package com.amar.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WellsfargoBank implements FederalBanking {

	public void customerDetails() {
		String name = "MarkSlone";
		double balance = 322112.32;
		System.out.println("Bank Details = WELLSFARGO\n" +"Customer Name = " + name 
				+ "\nBalance = $" + balance);
	}
}
