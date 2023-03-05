package com.masai.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 "items": [
		{
		"name": "Product 1",
		"quantity": "12 Nos",
		"rate": 123.00,
		"amount": 1476.00
		}
		]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	 private String name;
	 private String quantity;
	 private double rate;
	 private double amount;

}
