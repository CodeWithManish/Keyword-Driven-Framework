package com.qa.fb.keyword.Test;

import org.testng.annotations.Test;
import com.qa.fb.keyword.engine.KeyWordEngine;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class LoginTest {
public KeyWordEngine keyWordEngine;

public static Logger log = Logger.getLogger(LoginTest.class);

	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Sheet1");
		log.info("Login Page: "+keyWordEngine);
	}
	
	
	@Test
	public void signUpTest() throws InvalidFormatException{
			keyWordEngine = new KeyWordEngine();
			keyWordEngine.startExecution("Sheet2");
	}
}
