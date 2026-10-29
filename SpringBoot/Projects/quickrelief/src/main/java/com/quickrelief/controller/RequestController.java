package com.quickrelief.controller;
import com.quickrelief.dto.CreateRequest;
import com.quickrelief.model.SupplyRequest;
import com.quickrelief.service.RequestService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/requests")
public class RequestController {
    private final RequestService service;
    public RequestController(RequestService service) { this.service = service; }
    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public SupplyRequest create(@Valid @RequestBody CreateRequest request) { return service.allocate(request); }
}
