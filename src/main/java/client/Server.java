package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Server {
	
		@GetMapping("/auth")
		public String showRequestList() {
			return "Hi";
    		
    	}
	
	
	    public static void main(String[] args) {

	        SpringApplication.run(Server.class, args);
	        
	        // return the string of html you want to display

	    }
	    
	    

}
