package client;

import org.springframework.web.client.RestClient;

public class ClientLogin {
		
	public static void main(String[] args) {
		
		RestClient defaultClient = RestClient.create();
	
		String password = defaultClient.get()
								.uri("http://cs-hydra.centre.edu:9000/request/{username}", "jenna")
								.retrieve()
								.body(String.class);
						
		System.out.println(password);
		
		String registerResult = defaultClient.get()
									.uri("http://cs-hydra.centre.edu:9000/auth/jenna/{pw}", password)
									.retrieve()
									.body(String.class);
		
		System.out.println(registerResult);
		
	}

}
