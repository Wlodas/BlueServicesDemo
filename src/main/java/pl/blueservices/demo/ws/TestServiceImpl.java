package pl.blueservices.demo.ws;

import javax.jws.WebService;

@WebService(
	endpointInterface = "pl.blueservices.demo.ws.TestService",
	targetNamespace = "blueservices.pl",
	serviceName = "Test"
)
public class TestServiceImpl implements TestService {
	@Override
	public Person savePerson(Person person) {
		return person;
	}
}
