package client;

import org.springframework.web.client.RestClient;

public class ClientLogin {
		
	public static void main(String[] args) {
		
		RestClient defaultClient = RestClient.create();
		
		String username = "jenna";
	
		String password = defaultClient.get()
								.uri("http://cs-hydra.centre.edu:9000/request/{username}", username)
								.retrieve()
								.body(String.class);
						
		System.out.println(password);
		
		String registerResult = defaultClient.get()
									.uri("http://cs-hydra.centre.edu:9000/auth/{username}/{pw}", username, password)
									.retrieve()
									.body(String.class);
		
		System.out.println(registerResult);
		
	}

}
