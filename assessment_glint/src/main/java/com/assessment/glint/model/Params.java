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


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Params {
	
	private Integer userId;
	private String itemId;
	private int amount;

}
