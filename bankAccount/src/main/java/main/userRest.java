package main;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userDetails")


public class userRest {
	
	private userServices Services;
	@Autowired
	public userRest(userServices Services) {
		super();
		this.Services = Services;
	}
	
	@GetMapping("/getAll")
	
	public List<userDetails> getAllUserDetails(){
		
		return this.Services.getAllUsers();
		
	}
	
	
	@PutMapping("/update")
	
	public userDetails updateUserDetails(@PathParam("id") Long id, @RequestBody userDetails userDetails) {
		
		return this.Services.updateUser(userDetails, id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserDetails(@PathVariable Long id) {
		this.Services.deleteUser(id);
	}
	
	@PostMapping("/create")
	public userDetails createUserDetails(@RequestBody userDetails userDetails) {
		return this.Services.createUser(userDetails);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}