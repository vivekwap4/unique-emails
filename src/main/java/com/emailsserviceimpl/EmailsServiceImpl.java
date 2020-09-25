package com.emailsserviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.emailsservice.EmailsService;

public class EmailsServiceImpl implements EmailsService{

	@Override
	public Set<String> getUniqueEmailService(List<String> emails) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
    	
		for(String email : emails) {
			
			/*
			 * Split the email into two parts, username and domain
			 */
			String username = email.split("@")[0];
			String domain = email.split("@")[1];
			
			/*
			 * Ignoring everything after '+' in the username
			 */
			if(username.contains("+")) {
				username = username.substring(0, username.indexOf("+"));
			}
			
			/*
			 * Removing every '.' from the username
			 */
			if(username.contains(".")) {
				username = username.replaceAll("\\.", "");
			}
			
			/*
			 * Updated email after going through the conditions of '+' and '.'
			 * */
			String updatedEmail = username+"@"+domain;
			set.add(updatedEmail);
		}
		return set;
	}
	
}
