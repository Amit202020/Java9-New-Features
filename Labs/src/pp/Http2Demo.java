package pp;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.*;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;

public class Http2Demo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient   httpClient = HttpClient.newHttpClient();
		
		System.out.println(httpClient);
		
		
		HttpRequest   httpRequest = HttpRequest.newBuilder().uri(new URI("http://www.google.com")).GET().build();
		
		System.out.println(httpRequest);
		
		HttpResponse httpResponse=httpClient.send(httpRequest, HttpResponse.BodyHandler.asString());
		
		System.out.println(httpResponse);
		
		System.out.println(httpResponse.statusCode());
		
		System.out.println(httpResponse.body());
		

	}

}
