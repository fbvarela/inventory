package com.embl.inventory.repository;

import com.embl.inventory.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Report, Long> {
}
