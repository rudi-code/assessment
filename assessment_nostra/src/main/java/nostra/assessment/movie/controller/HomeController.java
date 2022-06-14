/**
 * 
 */
package nostra.assessment.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

//import io.swagger.annotations.Api;

/**
 * @author rudi_
 * Jun 7, 2022
 */

@CrossOrigin
@Controller
//@Api(value = "Home", description = " ", tags = { "Home" })
public class HomeController {
	
	@GetMapping("/")
	String index() {
		return "redirect:/swagger-ui.html";		
	}

}
