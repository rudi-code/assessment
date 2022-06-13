/**
 * 
 */
package nostra.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nostra.movie.model.Movies;

/**
 * @author rudi_
 * Jun 8, 2022
 */

@Repository
public interface MovieDao extends JpaRepository<Movies, Long> {

}
