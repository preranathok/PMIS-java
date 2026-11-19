
package com.quickrelief.quickrelief.controller;

import com.quickrelief.quickrelief.model.Supply;
import com.quickrelief.quickrelief.service.SupplyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/api/supplies")
public class SupplyController {

    private final SupplyService supplyService;

    public SupplyController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    // Add a new supply or restock an existing one
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addSupply(@RequestBody Supply supply) {
        supplyService.addOrRestock(supply);
        return "Supply added or restocked successfully";
    }

    // View all available supplies
    @GetMapping
    public List<Supply> getAllSupplies() {
        return supplyService.getAllSupplies();
    }
    // Update supply quantity using ID
    @PutMapping("/{id}")
    public String updateSupplyQuantity(
            @PathVariable Long id,
            @RequestParam int quantity) {

        supplyService.updateSupplyQuantity(id, quantity);
        return "Supply quantity updated successfully";
    }
    // Delete supply using ID
    @DeleteMapping("/{id}")
    public String deleteSupply(@PathVariable Long id) {
        supplyService.deleteSupply(id);
        return "Supply deleted successfully";
    }
}
