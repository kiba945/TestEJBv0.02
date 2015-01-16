package com.test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MonEJB
 */
@Stateless
@LocalBean
public class MonEJB implements MonEJBRemote {

    /**
     * Default constructor. 
     */
    public MonEJB() {
        // TODO Auto-generated constructor stub
    }

    public String ditBonjour(String aQui) {
        return "Bonjour " + aQui + " !!!";
     }
    
}
