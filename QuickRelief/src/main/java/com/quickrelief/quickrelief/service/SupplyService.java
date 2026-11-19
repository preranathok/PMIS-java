
package com.quickrelief.quickrelief.service;

import com.quickrelief.quickrelief.model.Supply;
import com.quickrelief.quickrelief.repository.SupplyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {

    private final SupplyRepository supplyRepository;

    public SupplyService(SupplyRepository supplyRepository) {
        this.supplyRepository = supplyRepository;
    }

    public void addOrRestock(Supply supply) {

        if (supply.getItemName() == null ||
                supply.getItemName().isBlank()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }

        if (supply.getQuantity() <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero");
        }

        supply.setItemName(supply.getItemName().trim());
        supplyRepository.addOrRestock(supply);
    }

    public List<Supply> getAllSupplies() {
        return supplyRepository.findAll();
    }
    public void updateSupplyQuantity(Long id, int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero");
        }

        int rowsUpdated = supplyRepository.updateQuantity(id, quantity);

        if (rowsUpdated == 0) {
            throw new IllegalArgumentException(
                    "Supply not found with ID: " + id);
        }
    }
    // Delete supply using ID
    public void deleteSupply(Long id) {
        int rowsDeleted = supplyRepository.deleteById(id);

        if (rowsDeleted == 0) {
            throw new IllegalArgumentException(
                    "Supply not found with ID: " + id);
        }
    }
}
