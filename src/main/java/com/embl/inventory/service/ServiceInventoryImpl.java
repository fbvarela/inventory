package com.embl.inventory.service;

import java.util.List;
import java.util.Optional;

import com.embl.inventory.model.Report;
import com.embl.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceInventoryImpl implements ServiceInventory {

    private final InventoryRepository repository;

    @Autowired
    public ServiceInventoryImpl(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<List<Report>> getAllInventory() {
        return Optional.ofNullable(repository.findAll());
    }
}
