package com.jay.CWOrderService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int orderId;
    private String washName;
    private String carModel;
    private double amount;
    private String customerName;
    private String washerName;
    private Date date;

}
