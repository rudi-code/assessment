/**
 * 
 */
package com.assessment.glint.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.glint.model.MProduct;
import com.assessment.glint.model.Params;

/**
 * @author rudi_
 * Jun 14, 2022
 */

@Repository
public interface PaymentDao extends JpaRepository<MProduct, Integer> {

}
