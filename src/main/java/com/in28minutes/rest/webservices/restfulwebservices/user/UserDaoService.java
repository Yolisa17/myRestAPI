package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
		users.add(new User(4, "Yolisa", new Date()));
	}
	
	public List<User> FindAll()
	{
		return users;
	}
	
	public User saveUser(User paUser)
	{
		if(paUser.getId()==null)
		{
			paUser.setId((users.size()+1));
		}
		users.add(paUser);
		return paUser;
	}
	
	public User findOne(int userId)
	{
		for(User user:users) {
			if(user.getId()==userId)
				return user;
		}
		return null;
	}
}
