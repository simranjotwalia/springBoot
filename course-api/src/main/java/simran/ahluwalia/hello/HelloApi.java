package simran.ahluwalia.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

	@GetMapping(value= {"/hello"})
	public String respondHi() {
		return "Hi";
	}
}
