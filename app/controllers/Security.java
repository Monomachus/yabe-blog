package controllers;

import models.User;

public class Security extends Secure.Security {

	static boolean check(String profile) {
		if ("admin".equals(profile)) {
			return User.find("byEmail", connected()).<User> first().isAdmin;
		}
		return false;
	}

	static boolean authenticate(String username, String password) {
		return User.connect(username, password) != null;
    }

	static void onDisconnected() {
	    Application.index();
	}

	static void onAuthenticated() {
	    Admin.index();
	}
}