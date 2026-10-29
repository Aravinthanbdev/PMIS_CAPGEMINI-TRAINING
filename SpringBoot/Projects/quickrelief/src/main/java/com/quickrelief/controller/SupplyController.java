package com.quickrelief.controller;
import com.quickrelief.dto.AddSupplyRequest;
import com.quickrelief.model.Supply;
import com.quickrelief.service.SupplyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/supplies")
public class SupplyController {
    private final SupplyService service;
    public SupplyController(SupplyService service) { this.service = service; }
    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public Supply addOrRestock(@Valid @RequestBody AddSupplyRequest request) { return service.addOrRestock(request); }
    @GetMapping public List<Supply> getAll() { return service.findAll(); }
}
