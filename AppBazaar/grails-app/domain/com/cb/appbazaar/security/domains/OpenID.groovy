package com.cb.appbazaar.security.domains



class OpenID {

	String url

	static belongsTo = [user: User]

	static constraints = {
		url unique: true
	}
}
