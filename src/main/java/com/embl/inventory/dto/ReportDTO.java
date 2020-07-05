package com.embl.inventory.dto;


import lombok.Data;

@Data
public class ReportDTO {
    private final Long identifier;
    private final String name;
    private final int numberOfItems;

}
