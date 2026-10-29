package com.quickrelief.service;
import com.quickrelief.dto.AddSupplyRequest;
import com.quickrelief.model.Supply;
import com.quickrelief.repository.SupplyRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SupplyService {
    private final SupplyRepository repository;
    public SupplyService(SupplyRepository repository) { this.repository = repository; }
    public Supply addOrRestock(AddSupplyRequest request) {
        repository.addOrRestock(request.itemName(), request.quantity());
        return repository.findAll().stream().filter(s -> s.itemName().equalsIgnoreCase(request.itemName().trim())).findFirst().orElseThrow();
    }
    public List<Supply> findAll() { return repository.findAll(); }
}
