/**
 * 
 */
package nostra.assessment.movie.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import nostra.assessment.movie.dao.MovieDao;
import nostra.assessment.movie.model.Movies;
import nostra.assessment.movie.model.ResponseApi;
import nostra.assessment.movie.service.MovieService;
import nostra.assessment.movie.utils.StaticVariable;

/**
 * @author rudi_
 * Jun 7, 2022
 */

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public ResponseApi getMovies() {
		// TODO Auto-generated method stub
		ResponseApi response = new ResponseApi();
		try {
			List<Movies> listEntity = movieDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
			response.setStatus(StaticVariable.STATUS_SUCCESS);
			response.setDetailInfo(listEntity.size());
			response.setResult(listEntity);
		} catch (Exception e) {
			response.setStatus(StaticVariable.STATUS_FAILED);
			response.setMessage(StaticVariable.MESSAGE_API_RETRIEVE_FAILED);
		}
		return response;
	}

	@Override
	public ResponseApi getMovieById(Long id) {
		// TODO Auto-generated method stub
		ResponseApi response = new ResponseApi();
		try {
			Optional<Movies> entity = movieDao.findById(id);
			response.setStatus(StaticVariable.STATUS_SUCCESS);
			response.setDetailInfo(1);
			response.setResult(entity);
		} catch (Exception e) {
			response.setStatus(StaticVariable.STATUS_FAILED);
			response.setMessage(StaticVariable.MESSAGE_API_RETRIEVE_FAILED);
		}
		return response;
	}

	@Override
	public ResponseApi saveMovie(Movies movie) {
		// TODO Auto-generated method stub
		ResponseApi response = new ResponseApi();
		try {
			if (movieDao.existsById(movie.getId())) {
				//update movie
				Movies entity = movieDao.save(movie);
				response.setStatus(StaticVariable.STATUS_SUCCESS);
				response.setDetailInfo(1);
				response.setMessage(StaticVariable.MESSAGE_API_UPDATE_SUCCESS);
				response.setResult(entity);
			} else {
				//add new movie
				Movies entity = movieDao.save(movie);
				response.setStatus(StaticVariable.STATUS_SUCCESS);
				response.setDetailInfo(1);
				response.setMessage(StaticVariable.MESSAGE_API_CREATE_SUCCESS);
				response.setResult(entity);
			}
		} catch (Exception e) {
			response.setStatus(StaticVariable.STATUS_FAILED);
			response.setMessage(
					StaticVariable.MESSAGE_API_CREATE_FAILED + " or " + StaticVariable.MESSAGE_API_UPDATE_FAILED);
		}
		return response;
	}

	@Override
	public ResponseApi deleteMovie(Long id) {
		// TODO Auto-generated method stub
		ResponseApi response = new ResponseApi();
		try {
			movieDao.deleteById(id);
			response.setStatus(StaticVariable.STATUS_SUCCESS);
			response.setDetailInfo(1);
			response.setResult(StaticVariable.MESSAGE_API_DELETE_SUCCESS);
		} catch (Exception e) {
			response.setStatus(StaticVariable.STATUS_FAILED);
			response.setMessage(StaticVariable.MESSAGE_API_DELETE_FAILED);
		}
		return response;
	}

	@Override
	public ResponseApi getMovieByCategory(String movieName, String rating, String genre, int year) {
		// TODO Auto-generated method stub
		ResponseApi response = new ResponseApi();
		try {
			List<Movies> listEntity = movieDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
			System.out.println("listEntity" + listEntity);
			if(movieName != null) {
				listEntity = listEntity.stream()
					.filter(n -> n.getMovie_name().toLowerCase().contains(movieName.toLowerCase()))
					.collect(Collectors.toList());
			}
			if(rating != null) {
				listEntity = listEntity.stream()
					.filter(n -> rating.equals(n.getRating()))
					.collect(Collectors.toList());
			}
			if(genre != null) {
				listEntity = listEntity.stream()
					.filter(n -> genre.equals(n.getGenre()))
					.collect(Collectors.toList());
			}
			
			if(year != 0) {
				listEntity = listEntity.stream()
					.filter(n -> n.getYear() == year)
					.collect(Collectors.toList());
			}
							
			response.setStatus(StaticVariable.STATUS_SUCCESS);
			response.setDetailInfo(listEntity.size());
			response.setResult(listEntity);
		} catch (Exception e) {
			response.setStatus(StaticVariable.STATUS_FAILED);
			response.setMessage(StaticVariable.MESSAGE_API_RETRIEVE_FAILED);
		}
		return response;
	}

}
