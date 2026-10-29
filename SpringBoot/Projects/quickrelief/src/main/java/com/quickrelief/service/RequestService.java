package com.quickrelief.service;
import com.quickrelief.dto.CreateRequest;
import com.quickrelief.model.Supply;
import com.quickrelief.model.SupplyRequest;
import com.quickrelief.repository.RequestRepository;
import com.quickrelief.repository.SupplyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
@Service
public class RequestService {
    private final SupplyRepository supplies;
    private final RequestRepository requests;
    public RequestService(SupplyRepository supplies, RequestRepository requests) { this.supplies = supplies; this.requests = requests; }
    @Transactional
    public SupplyRequest allocate(CreateRequest request) {
        Supply supply = supplies.findByNameForUpdate(request.itemName()).orElseThrow(() ->
            new ResponseStatusException(HttpStatus.NOT_FOUND, "Supply item not found: " + request.itemName().trim()));
        if (supply.quantity() < request.quantity()) throw new ResponseStatusException(HttpStatus.CONFLICT, "Insufficient stock. Available quantity: " + supply.quantity());
        if (supplies.deductQuantity(supply.id(), request.quantity()) != 1) throw new ResponseStatusException(HttpStatus.CONFLICT, "Stock changed; please retry");
        return requests.create(request.itemName(), request.quantity(), "ALLOCATED", request.requestedBy());
    }
}
