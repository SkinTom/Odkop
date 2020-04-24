package tskinder.odkop.dao;

import java.util.List;

import tskinder.odkop.model.User;

public interface UserDAO extends GenericDAO<User, Long>{
	
	List<User> getAll();
	User getUserByUsername(String username);
}
