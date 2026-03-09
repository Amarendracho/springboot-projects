package com.amar.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CitiBank implements FederalBanking {

	public void customerDetails() {
		String name = "Baaily";
		double balance = 5322112.32;
		System.out.println("Bank Details = CITI\n" + "Customer Name = " + name 
				+ "\nBalance = $" + balance);
	}

}
