package main;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class userServices {

	private userRepo repo;

	public userServices(userRepo repo) {

		super();
		this.repo = repo;

	}

	public List<userDetails> getAllUsers() {
		return this.repo.findAll();

	}

	public userDetails updateUser(userDetails user, Long id) {
		userDetails toUpdate = this.repo.getOne(id);
		toUpdate.setFirstName(user.getFirstName());
		toUpdate.setLastName(user.getLastName());
		toUpdate.setAccountNumber(user.getAccountNumber());
		return null;

	}
	
	
	public void deleteUser(long id) {
		this.repo.deleteById(id);
	}
	
	public userDetails createUser(userDetails user) {
		return this.repo.save(user);
	}
	
	

}
