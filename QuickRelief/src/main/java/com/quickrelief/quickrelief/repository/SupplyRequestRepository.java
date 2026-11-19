
package com.quickrelief.quickrelief.repository;
import java.util.List;
import com.quickrelief.quickrelief.model.SupplyRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class SupplyRequestRepository {

    private final JdbcTemplate jdbcTemplate;

    public SupplyRequestRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<SupplyRequest> requestRowMapper =
            (rs, rowNum) -> new SupplyRequest(
                    rs.getLong("id"),
                    rs.getString("item_name"),
                    rs.getInt("quantity"),
                    rs.getString("status"),
                    rs.getString("requested_by")
            );

    public int deductStock(String itemName, int quantity) {
        String sql = """
                UPDATE supplies
                SET quantity = quantity - ?
                WHERE item_name = ? AND quantity >= ?
                """;

        return jdbcTemplate.update(sql, quantity, itemName, quantity);
    }

    public void saveRequest(SupplyRequest request) {
        String sql = """
                INSERT INTO requests
                (item_name, quantity, status, requested_by)
                VALUES (?, ?, ?, ?)
                """;

        jdbcTemplate.update(
                sql,
                request.getItemName(),
                request.getQuantity(),
                request.getStatus(),
                request.getRequestedBy()
        );
    }

    public SupplyRequest findById(Long id) {
        String sql = """
                SELECT id, item_name, quantity, status, requested_by
                FROM requests WHERE id = ?
                """;

        return jdbcTemplate.queryForObject(
                sql, requestRowMapper, id
        );
    }
    public List<SupplyRequest> findAll() {
        String sql = """
            SELECT id, item_name, quantity, status, requested_by
            FROM requests
            ORDER BY id
            """;

        return jdbcTemplate.query(sql, requestRowMapper);
    }
}
