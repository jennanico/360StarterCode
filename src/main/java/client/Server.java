package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Server {
	
	
	@GetMapping("/request")
	public String showRequestList() {
		return "Hi";
		
	}
		
	
	@GetMapping("/auth")
	public String showAuthList() {
		return "Hi";
    		
    }
	
	@GetMapping("/request/{username}")
	public String showPassForUser(@PathVariable String username) {
		return "Hi";
		
	}
	
	@GetMapping("/auth/{username}/{password}")
	public String authPassForUser(@PathVariable String username, @PathVariable String password) {
		return "Hi";
		
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
				   "<li><a href='/auth/janedoe/3104'>/auth/:username/:password</a> attempts to authenticate the password for the username provided</li>";
		return index;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Server.class, args);
	}
	    
	    

}
