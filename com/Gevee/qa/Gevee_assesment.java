package com.Gevee.qa;
import org.testng.annotations.Test;

public class GeveeAssesment {

	
		HashMap<String, String> map = readData(1);
	    String username = map.getKey(1);
	    String password = map.get(username);
	
	
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
	}
	
	@Test
	public void verifyExistingUser() {
		
		try {
			
		assertTrue(auth.users.containsKey(username));	
		auth.registerUser(username, password);

		}
		catch(Exception e){
			
			assertFail(e.getMessage(),"Username already exists!")
			fail("Try with different user name");
			
		}
		
		else {
			
			fail("Unexpected Error");
			
		}
		
	}
	
	@Test
	public void verifyRegistrationAsNewUser() {
		
		try {
			
			auth.register(username, password);
			assertTrue(auth.users.containsKey(username));
	        assertEquals(password, auth.users.get(username));
	        // Check for success message
	        assertEquals("Registration Successful", successElement.getText());
	        

		}
		
		catch(Exception e){	
			
			// check valid username
			assertTrue(e.getMessage(),"Invalid Username");
			fail("UserName should contain only alphanumeric chars");
			
		}
		catch(Exception ex){	
			// check valid username
			assertTrue(e.getMessage(),"Exceeds character limit");
			fail("UserName should be of length 15");
			assert();
		}
		
		else {
			fail(if(auth.users.get(passwod)==""));
			fail("Unexpected Error");
		}		
	}
	
	
	
	@Test
	public void verifyRegistarPasswordContainsSpecialChar() {
		    String storedPassword = this.users.get(username);
			assertTrue(password == storedPassword && password.contains(([^a-z0-9] ),true);			   
	}
	
	
	@Test
	public void verifyRegistrationPasswordContainsNumericVal() {
			    String storedPassword = this.users.get(username);
			    assertTrue(password == storedPassword && password.contains([0-9]) , true);		
	}
	
	
	@Test
	public void verifyLoginInvalidValidUserName() {
		
		auth.authenticateUser(username, password);
		   
        // Ensure user is LoggedIn successfully
        assertTrue(!auth.users.containsKey(username));
 assertFalse(password, auth.users.get(username));
        
        // Check for success message
        assertEquals("Invalid Username ", successElement.getText())
	}
	
	@Test
	public void verifyLoginInvalidPassword() {
        
		
		auth.authenticateUser(username, password);
		   
        // Ensure user is LoggedIn successfully
        assertTrue(!auth.users.containsKey(username));
        assertFalse(password, auth.users.get(username));
        
        // Check for success message
        assertEquals("Invalid Username ", successElement.getText())
		
		
	}
	
	
	@Test
	public void verifyLoginasnvalidValidUser() {
		auth.authenticateUser(username, password);
   
        // Ensure user is LoggedIn successfully
        assertTrue(auth.users.containsKey(username));
        assertEquals(password, auth.users.get(username));
        
        // Check for success message
        assertEquals("LoggedIn successfully", successElement.getText());
		
	}
	
	@Test
	public void verifyLoginWithValidPassword() {
		auth.authenticateUser(username, password);
        
        // Ensure user is LoggedIn successfully
        assertTrue(auth.users.containsKey(username));
        assertEquals(password, auth.users.get(username));
        
        // Check for success message
        assertEquals("Login Successful", successElement.getText())
		
		
	}
	


	
	@Test
	public void verifyRegistrationBlankPassword() {
		 authenticateUser(username, password) {
			    const storedPassword = this.users.get(username);
			    if (password == "") {
			    	System.out.println("Password Field is Blankr");
			    }
			  }
		
		
	}
	

	
	
	
	
	

	
	
}
