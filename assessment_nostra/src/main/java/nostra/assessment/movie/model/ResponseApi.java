/**
 * 
 */
package nostra.assessment.movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author rudi_
 * Jun 8, 2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseApi {
	
	private String status;
	private String message;
	private int executiontime;
	private Object detailInfo;
	private Object result;

}
