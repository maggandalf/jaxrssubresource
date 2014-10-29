package org.suerbiz;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class Customer {

	private String id;
	private String address;
	
	public String getId() {
		return id;
	}
	
	@Path("/address")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAddress() {
		return address;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
