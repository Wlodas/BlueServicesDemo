package pl.blueservices.demo.ws;

import javax.jws.WebService;

@WebService(
	endpointInterface = "pl.blueservices.demo.ws.TestService",
	serviceName = "TestService",
	portName = "TestPort"
)
public class TestServiceImpl implements TestService {
	@Override
	public Person savePerson(Person person) {
		return person;
	}
}
