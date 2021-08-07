package com.lti;

import org.springframework.stereotype.Component;

@Component
public class CardService {
	public void verifyCard() {
		System.out.println("Card Verified..");
	}
public void doTrans() {
	System.out.println("Transaction in progress...");
}
public void closeTran() {
	System.out.println("Transaction completed...");
}
}
