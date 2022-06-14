/**
 * 
 */
package com.assessment.glint.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author rudi_
 * Jun 14, 2022
 */

@Entity
@Table(name = "M_PRODUCT")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MProduct {
	
	@Id
	private Integer id_item;
	private Integer price_item;
	

}
