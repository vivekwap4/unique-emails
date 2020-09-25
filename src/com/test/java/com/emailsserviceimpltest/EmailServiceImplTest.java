package com.emailsserviceimpltest;

import com.emailsserviceimpl.EmailsServiceImpl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class EmailsServiceImplTest {
	
	EmailsServiceImpl emailsServiceImpl = new EmailsServiceImpl();
	
	List<String> emails = new ArrayList<String>();
	
	@Test
	public void getUniqueEmailsTest() {
		emails.add("test.email@gmail.com");
		emails.add("test+email@gmail.com");
		Set<String> set = emailsServiceImpl.getUniqueEmails(emails);
		assertEquals(2, set.size());
	}
	
}
