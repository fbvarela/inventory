package com.embl.inventory.mapper;

import com.embl.inventory.dto.ReportDTO;
import com.embl.inventory.model.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportMapper {
    public ReportDTO ReportToReportDTO(Report report) {
        return new ReportDTO(report.getSku(), report.getName(), report.getCount());
    }
}
