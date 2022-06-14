/**
 * 
 */
package com.assessment.glint.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.glint.model.Params;
import com.assessment.glint.service.PaymentService;

/**
 * @author rudi_
 * Jun 14, 2022
 */

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	@GetMapping("/test")
	private String test() {
		return "string";
	}
	
	@PostMapping("/amount-price")
	private String getPrice(@RequestBody Params params) {
		String result= paymentService.getAmountPrice(params);
		return result;
	}
}
