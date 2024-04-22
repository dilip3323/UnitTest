package com.Gevee.qa;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TestCases {
	
	
	 	HashMap<String, String> map = readData(1);
	    String username = map.getKey(1);
	    String password = map.get(username);
	    
	    AuthModule auth = new AuthModule();
	    
	
	// Register User with Valid Username and Password
	@Test
	private void testcase_001() {
	   
	    try {
	        auth.registerUser(username, password);
	        
	        // Ensure user is registered successfully
	        assertTrue(auth.users.containsKey(username));
	        assertEquals(password, auth.users.get(username));
	        
	        
	        // Check for success message
	        assertEquals("Registration Successful", successElement.getText());
	    } catch (Exception e) {
	        // Check if the exception is due to duplicate username
	        if (e.getMessage().equals("Username already exists")) {
	            fail("Username already exists, enter a unique username");
	        } else {
	            // Unexpected exception occurred
	            fail("Unexpected exception occurred: " + e.getMessage());
	        }
	    }
	
	
	
	@Test
	
	private void verifyValidUser() {
	   
	        auth.authenticateUser(username, password);
	        // Ensure user is LoggedIn successfully
	        assertTrue(auth.users.containsKey(username));
	        assertEquals(password, auth.users.get(username));
	        
	        // Check for success message
	        assertEquals("Login Successful", successElement.getText());
	        
	    } catch (Exception e) {
	        // Check if the exception is due to duplicate username
	        if (e.getMessage().equals("Username already exists")) {
	            fail("Username already exists, enter a unique username");
	        } else {
	            // Unexpected exception occurred
	            fail("Unexpected exception occurred: " + e.getMessage());
	        }
	    }
	
	


}
