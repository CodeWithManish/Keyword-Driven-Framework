package com.qa.fb.keyword.Test;

import org.testng.annotations.Test;

import com.qa.fb.keyword.engine.KeyWordEngine;

public class LoginTest {
public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Sheet1");
	}
	
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Sheet2");
	}
}
