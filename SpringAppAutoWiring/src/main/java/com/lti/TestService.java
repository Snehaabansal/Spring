package com.lti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {
private CardService cardService;

@Autowired
public TestService(CardService cardService) { //dependency injection through constructor
	this.cardService = cardService;
}
void testServiceMethods() {
	cardService.verifyCard();
	cardService.doTrans();
	cardService.closeTran();
}

}
