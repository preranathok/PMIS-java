package com.quickrelief.quickrelief.controller;

import com.quickrelief.quickrelief.model.SupplyRequest;
import com.quickrelief.quickrelief.service.SupplyRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class SupplyRequestController {

    private final SupplyRequestService requestService;

    public SupplyRequestController(SupplyRequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createRequest(@RequestBody SupplyRequest request) {
        requestService.createRequest(request);
        return "Emergency request created successfully";
    }

    @GetMapping
    public List<SupplyRequest> getAllRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("/{id}")
    public SupplyRequest getRequestById(@PathVariable Long id) {
        return requestService.getRequestById(id);
    }
}