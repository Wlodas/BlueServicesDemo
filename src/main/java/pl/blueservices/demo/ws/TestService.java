package pl.blueservices.demo.ws;

import java.time.LocalDate;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.*;

import lombok.*;

@WebService
public interface TestService {
	@WebMethod
	Person savePerson(Person person);
	
	@Value
	@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
	@RequiredArgsConstructor
	@XmlRootElement
	@XmlAccessorType(XmlAccessType.FIELD)
	public static final class Person {
		private String firstName;
		private String lastName;
		private LocalDate birthDate;
		private Address address;
		
		@Value
		@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
		@RequiredArgsConstructor
		@XmlRootElement
		@XmlAccessorType(XmlAccessType.FIELD)
		public static final class Address {
			private String street;
			private String zipCode;
		}
	}
}
