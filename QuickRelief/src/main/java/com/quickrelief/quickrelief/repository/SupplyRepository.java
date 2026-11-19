
package com.quickrelief.quickrelief.repository;

import com.quickrelief.quickrelief.model.Supply;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupplyRepository {

    private final JdbcTemplate jdbcTemplate;

    public SupplyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Supply> supplyRowMapper = (rs, rowNum) ->
            new Supply(
                    rs.getLong("id"),
                    rs.getString("item_name"),
                    rs.getInt("quantity")
            );

    // Add a new supply or restock an existing one
    public void addOrRestock(Supply supply) {

        String updateSql =
                "UPDATE supplies SET quantity = quantity + ? WHERE item_name = ?";

        int rowsUpdated = jdbcTemplate.update(
                updateSql,
                supply.getQuantity(),
                supply.getItemName()
        );

        if (rowsUpdated == 0) {
            String insertSql =
                    "INSERT INTO supplies (item_name, quantity) VALUES (?, ?)";

            jdbcTemplate.update(
                    insertSql,
                    supply.getItemName(),
                    supply.getQuantity()
            );
        }
    }

    // Retrieve all supplies
    public List<Supply> findAll() {

        String sql =
                "SELECT id, item_name, quantity FROM supplies ORDER BY id";

        return jdbcTemplate.query(sql, supplyRowMapper);
    }
    // Update supply quantity using ID
    public int updateQuantity(Long id, int quantity) {

        String sql =
                "UPDATE supplies SET quantity = ? WHERE id = ?";

        return jdbcTemplate.update(sql, quantity, id);
    }
    // Delete supply using ID
    public int deleteById(Long id) {
        String sql = "DELETE FROM supplies WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }


}
