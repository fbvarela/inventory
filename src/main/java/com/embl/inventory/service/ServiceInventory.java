package com.embl.inventory.service;

import java.util.List;
import java.util.Optional;

import com.embl.inventory.model.Report;

public interface ServiceInventory {
    Optional<List<Report>> getAllInventory();
}
