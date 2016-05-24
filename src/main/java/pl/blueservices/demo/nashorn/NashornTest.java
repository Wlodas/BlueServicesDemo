package pl.blueservices.demo.nashorn;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import javax.script.*;

public class NashornTest {
	
	public interface ZipCodeValidator {
		boolean validate(String input);
	}
	
	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		
//		engine.eval("function validate(input) {return /[0-9]{2}-[0-9]{3}/.test(input);}");
		
		engine.eval(new InputStreamReader(NashornTest.class.getResourceAsStream("validators.js")));
		
		Invocable invocable = (Invocable) engine;
		ZipCodeValidator function = invocable.getInterface(ZipCodeValidator.class);
		
		System.out.println(function.validate("00-000"));
		System.out.println(function.validate("00-00"));
		System.out.println(function.validate(null));
	}
	
}
