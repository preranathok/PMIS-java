
package com.quickrelief.quickrelief.service;

import com.quickrelief.quickrelief.model.SupplyRequest;
import com.quickrelief.quickrelief.repository.SupplyRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyRequestService {

    private final SupplyRequestRepository requestRepository;

    public SupplyRequestService(SupplyRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public void createRequest(SupplyRequest request) {

        if (request.getItemName() == null ||
                request.getItemName().isBlank()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }

        if (request.getQuantity() <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero");
        }

        if (request.getRequestedBy() == null ||
                request.getRequestedBy().isBlank()) {
            throw new IllegalArgumentException(
                    "Requested by cannot be empty");
        }

        int rowsUpdated = requestRepository.deductStock(
                request.getItemName(),
                request.getQuantity()
        );

        if (rowsUpdated == 0) {
            throw new IllegalArgumentException(
                    "Item not found or insufficient stock");
        }

        request.setStatus("APPROVED");
        requestRepository.saveRequest(request);
    }

    public SupplyRequest getRequestById(Long id) {
        return requestRepository.findById(id);
    }

    public List<SupplyRequest> getAllRequests() {
        return requestRepository.findAll();
    }
}
