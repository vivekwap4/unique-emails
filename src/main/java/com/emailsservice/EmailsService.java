package com.emailsservice;

import java.util.List;
import java.util.Set;

public interface EmailsService {
	public Set<String> getUniqueEmailService(List<String> emails);
}
