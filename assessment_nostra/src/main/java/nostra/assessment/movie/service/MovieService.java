/**
 * 
 */
package nostra.assessment.movie.service;

import nostra.assessment.movie.model.Movies;
import nostra.assessment.movie.model.ResponseApi;

/**
 * @author rudi_
 * Jun 7, 2022
 */
public interface MovieService {

	/**
	 * @return
	 */
	ResponseApi getMovies();

	/**
	 * @param id 
	 * @return
	 */
	ResponseApi getMovieById(Long id);

	/**
	 * @param movie
	 * @return
	 */
	ResponseApi saveMovie(Movies movie);

	/**
	 * @param id
	 * @return
	 */
	ResponseApi deleteMovie(Long id);

	/**
	 * @param movieName
	 * @param rating
	 * @param genre
	 * @param year
	 * @return
	 */
	ResponseApi getMovieByCategory(String movieName, String rating, String genre, int year);

}
