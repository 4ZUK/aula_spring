package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.User;
import br.com.rd.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;


	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
//	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/create-user")
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/find-user/list")
	public List<User> find(){return  userRepository.findAll();}



}
