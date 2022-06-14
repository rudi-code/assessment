/**
 * 
 */
package nostra.assessment.movie.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author rudi_
 * Jun 8, 2022
 */

@Entity
@Table
@Getter
@Setter
@ToString
public class Movies implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String movie_name;
	private String rating;
	private String genre;
	private String path_image;
	private String path_video;
	private int year;
	private int run_time;
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@Column(nullable = false, updatable = false)
	private String created_by;

	@Column(nullable = false, updatable = false)
	@DateTimeFormat
	private Date created_date;

	@Column(nullable = true, updatable = true)
	private String updated_by;

	@Column(nullable = true, updatable = true)
	@DateTimeFormat
	private Date updated_date;
	
	
}
