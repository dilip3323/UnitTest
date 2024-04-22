package com.Gevee.qa;


public class AuthModule {


		  constructor() {
		    this.users = new Map();
		  }

		  registerUser(username, password) {
		    if (this.users.has(username)) {
		      throw new Error('Username already exists');
		    }
		    this.users.set(username, password);
		  }

		  authenticateUser(username, password) {
		    if (!this.users.has(username)) {
		      throw new Error('User not found');
		    }
		    const storedPassword = this.users.get(username);
		    if (password !== storedPassword) {
		      throw new Error('Invalid password');
		    }
		    return true;
		  }
		}

		module.exports = AuthModule;

}
