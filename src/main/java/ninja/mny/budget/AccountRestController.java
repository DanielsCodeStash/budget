package ninja.mny.budget;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

	private Integer counter = 2;

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public Account getTest()
	{
		counter++;
		return new Account("Test Account", 1337.0);
	}
}
