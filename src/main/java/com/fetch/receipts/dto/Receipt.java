package com.fetch.receipts.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
@JsonInclude(Include.NON_NULL)
@Data
public class Receipt {
    String id; 
    @JsonFormat(pattern = "^[\\w\\s\\-&]+$")
    String retailer; 
    Date purchaseDate; 
    LocalTime purchaseTime; 
    @JsonFormat(pattern="^\\d+\\.\\d{2}$")
    String total; 
    LinkedList<Item> items;
}
