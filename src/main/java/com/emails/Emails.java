package com.emails;

import com.emailsservice.EmailsService;
import com.emailsserviceimpl.EmailsServiceImpl;

import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/emails")
public class Emails {
	
	@POST
	@Path("/unique")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response countUniqueEmails(List<String> emails){
		
		/* 
		 * Checking if the input is is an empty list
		 * If yes, return error 400 (Bad request) to the user
		 * */
		if(emails.isEmpty()) {
    		return Response.status(Response.Status.BAD_REQUEST).build();
    	}
		
		/*
		 * Call to the method in service layer that returns a set of unique emails
		 */
		EmailsService emailService = new EmailsServiceImpl();
		Set<String> set = emailService.getUniqueEmailService(emails);
		
		/*
		 * Final response, size of the set (total unique emails) and the 'ok" status
		 */
		return Response.ok(set.size(), MediaType.APPLICATION_JSON).build();
	}
}
