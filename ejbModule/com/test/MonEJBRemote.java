package com.test;

import javax.ejb.Remote;

@Remote
public interface MonEJBRemote {
	public String ditBonjour(String aQui);
}
