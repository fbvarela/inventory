package com.embl.inventory.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.embl.inventory.dto.ReportDTO;
import com.embl.inventory.mapper.ReportMapper;
import com.embl.inventory.model.Report;
import com.embl.inventory.service.ServiceInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InventoryController {
    public final ServiceInventory service;
    public final ReportMapper mapper;

    @Autowired
    public InventoryController(ServiceInventory service, ReportMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/repository")
    public ResponseEntity<List<ReportDTO>> index() throws InventoryNotFoundException {

        List<Report> reports = service.getAllInventory()
                                      .orElseThrow(() -> new InventoryNotFoundException(
                                          "There are no reports in the inventory"));

        List<ReportDTO> reportsDTO = reports.stream()
                                            .map(report -> mapper.ReportToReportDTO(report))
                                            .collect(Collectors.toList());

        return new ResponseEntity<>(reportsDTO, HttpStatus.OK);
    }
}
