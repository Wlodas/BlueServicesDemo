package pl.blueservices.demo.ws;

import java.time.LocalDate;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.*;

import lombok.*;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TestService {
	@WebMethod
	Person savePerson(@WebParam(name = "person") Person person);
	
	@Value
	@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
	@RequiredArgsConstructor
	@XmlRootElement
	@XmlAccessorType(XmlAccessType.FIELD)
	public static final class Person {
		@XmlElement(required = true)
		private String firstName;
		
		@XmlElement(required = true)
		private String lastName;
		
		@XmlElement(required = true)
		@XmlSchemaType(name = "date")
		private LocalDate birthDate;
		
		@XmlElement(required = true)
		private Address address;
		
		@Value
		@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
		@RequiredArgsConstructor
		@XmlAccessorType(XmlAccessType.FIELD)
		public static final class Address {
			@XmlElement(required = true)
			private String street;
			
			@XmlElement(required = true)
			private String zipCode;
		}
	}
}
