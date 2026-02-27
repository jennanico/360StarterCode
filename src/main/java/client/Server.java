package client;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Server {
	
	static HashMap<String, String> passDatabase = new HashMap();
	ArrayList<String> verified = new ArrayList();
	
	
	@GetMapping("/request")
	public String showRequestList() {
		String reqListString = passDatabase.keySet().toString();
		return reqListString;
		
	}
		
	
	@GetMapping("/auth")
	public String showAuthList() {
		String authListString = verified.toString();
		return authListString;
    		
    }
	
	@GetMapping("/request/{username}")
	public String showPassForUser(@PathVariable String username) {
		if (passDatabase.containsKey(username)) {
			return passDatabase.get(username);
		}
		
		int fourDigitNumber = (int) (Math.random() * 9000) + 1000;
		passDatabase.put(username, String.valueOf(fourDigitNumber));
		return String.valueOf(fourDigitNumber);
		
	}
	
	@GetMapping("/auth/{username}/{password}")
	public String authPassForUser(@PathVariable String username, @PathVariable String password) {
		if (passDatabase.get(username).equals(password)) {
			
			if (!verified.contains(username)) {
				verified.add(username);
			}
			
			return "Authenticated!";
		}
		
		return "Authentication failed";

	}
	
	
	@GetMapping("")
	public String display() {
		String index = "<html>" +
				   "<head></head>" +
				   "<body>" +
				   "<h1>Password Server</h1>" +
				   "<p>This is a REST server for retrieving and storing passwords. Here are the following links:</p>" +
				   "<ol>" +
				   "<li><a href='/request'>/request</a> a list of all people who have requested passwords</li>" +
				   "<li><a href='/auth'>/auth</a> a list of all people who have been successfully authenticated</li>" +
				   "<li><a href='/request/janedoe'>/request/:username</a> a request for a password for the username provided</li>" +
				   "<li><a href='/auth/janedoe/4132'>/auth/:username/:password</a> attempts to authenticate the password for the username provided</li>";
		return index;
	}
	
	public static void main(String[] args) {
		passDatabase.put("janedoe", "4132");
		SpringApplication.run(Server.class, args);
	}
	    
	    

}
