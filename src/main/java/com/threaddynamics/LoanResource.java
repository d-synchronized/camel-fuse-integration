package com.threaddynamics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class LoanResource {

	@GET
	@Path("/detail/{loanId}")
	public String fetchLoanDetails(@PathParam("loanId") final Long loanId) {
		return "Returning information against loan Id '" + loanId + "'";
	}

}
