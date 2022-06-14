/**
 * 
 */
package com.assessment.glint.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.glint.dao.PaymentDao;
import com.assessment.glint.model.MProduct;
import com.assessment.glint.model.Params;
import com.assessment.glint.service.PaymentService;

/**
 * @author rudi_
 * Jun 14, 2022
 */

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentDao paymentDao;

	@Override
	public String getAmountPrice(Params params) {
		// TODO Auto-generated method stub
//		Optional<MProduct> product = paymentDao.findById(params.getItemId());
		Integer AmountPrice = 0;
		
//		for(int i=0; i<params.getAmount(); i++) {
//			AmountPrice += product.get().getPrice_item();
//		}
		
		return AmountPrice.toString();
	}

}
