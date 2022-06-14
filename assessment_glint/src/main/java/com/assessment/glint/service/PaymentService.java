/**
 * 
 */
package com.assessment.glint.service;

import com.assessment.glint.model.Params;

/**
 * @author rudi_
 * Jun 14, 2022
 */
public interface PaymentService {

	/**
	 * @param params
	 * @return
	 */
	String getAmountPrice(Params params);

}
