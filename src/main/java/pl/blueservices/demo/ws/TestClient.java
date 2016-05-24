package pl.blueservices.demo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import pl.blueservices.demo.ws.TestService.Person;
import pl.blueservices.demo.ws.TestService.Person.Address;

public class TestClient {
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8888/ws/test?wsdl");
		QName qname = new QName("blueservices.pl", "Test");
		Service service = Service.create(url, qname);
		TestService port = service.getPort(TestService.class);
		
		Person person = new Person("ggg", "hhh", LocalDate.of(2000, Month.JANUARY, 01),
			new Address("sss", "zzz")
		);
		System.out.println(port.savePerson(person));
	}
	
}
