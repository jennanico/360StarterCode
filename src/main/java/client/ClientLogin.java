package client;

import org.springframework.web.client.RestClient;

public class ClientLogin {
	
	RestClient defaultClient = RestClient.create();
	
	public void main(String[] args) {
	
		String result = defaultClient.get()
							.uri("cs-hydra.centre.edu:9000")
							.retrieve()
							.body(String.class);
						
		System.out.println(result);
		
	}

}
