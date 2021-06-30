package br.com.definf.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.definf.hroauth.entities.User;
import br.com.definf.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user==null) {
			logger.error("E-mail not found: " + email);
			throw new IllegalArgumentException("E-mail not found.");
		}

		logger.error("E-mail found: " + email);
		return user;
	}
}
