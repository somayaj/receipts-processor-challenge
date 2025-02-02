package com.fetch.receipts.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Item {
    @JsonFormat(pattern="^[\\w\\s\\-]+$")
    String shortDescription; 
    @JsonFormat(pattern="^\\d+\\.\\d{2}$")
    String price; 
}
