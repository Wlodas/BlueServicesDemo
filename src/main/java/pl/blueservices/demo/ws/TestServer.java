package pl.blueservices.demo.ws;

import javax.xml.ws.Endpoint;

public class TestServer {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/test", new TestServiceImpl());
	}
	
}
