package com.amar.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Banking {

	@Autowired // FIELD INJECTION
	@Qualifier("wellsfargoBank")
	private FederalBanking fed;
	
// 		CONSTRUCTOR INJECTION
//	public Banking(HSBCBank hsbcbank) {
//		this.hsbcbank = hsbcbank;
//	}
	
// 		SETTER INJECTION
//	@Autowired
//	public void setBanking(HSBCBank hsbcbank) {
//		this.hsbcbank = hsbcbank;
//	}

	public void bankDetails() {
		fed.customerDetails();
	}

}