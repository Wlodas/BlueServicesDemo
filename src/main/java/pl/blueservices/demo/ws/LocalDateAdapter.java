package pl.blueservices.demo.ws;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
	@Override
	public LocalDate unmarshal(String value) {
		return LocalDate.parse(value);
	}
	
	@Override
	public String marshal(LocalDate value) {
		return value.toString();
	}
}
