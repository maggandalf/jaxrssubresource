package org.suerbiz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ShoppingCart {

	@Path("/customers/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Customer get(@PathParam("id") String id) {
		Customer customer = new Customer();
		customer.setAddress("a");
		customer.setId(id);
		return customer;
	}
}
