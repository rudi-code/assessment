/**
 * 
 */
package nostra.assessment.movie.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import nostra.assessment.movie.model.Movies;
import nostra.assessment.movie.model.ResponseApi;
import nostra.assessment.movie.service.MovieService;

/**
 * @author rudi_
 * Jun 7, 2022
 */

@RestController
@CrossOrigin
@Tag(name = "Nostra Movie", description = "Nostra Movie API")
@RequestMapping("/nostra")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/all-movies", method = RequestMethod.GET)
	@Operation(summary = "Get All Movie", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully retrieved list"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> getMovies() {
		return new ResponseEntity<ResponseApi>(movieService.getMovies(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
	@Operation(summary = "Get Movie by id", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully retrieved data"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> getMovieById(@PathVariable Long id) {
		return new ResponseEntity<ResponseApi>(movieService.getMovieById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	@Operation(summary = "Get Movie by Category", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully retrieved data"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> getMovieByCategory(
			@RequestParam(required=false) String movieName,
			@RequestParam(required=false) String rating,
			@RequestParam(required=false) String genre,
			@RequestParam(defaultValue = "0", required=false) int year
			) {
		
		System.out.println(movieName);
		System.out.println(rating);
		System.out.println(genre);
		System.out.println(year);
		return new ResponseEntity<ResponseApi>(movieService.getMovieByCategory(movieName, rating, genre, year), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movie/add", method = RequestMethod.POST)
	@Operation(summary = "Add new Movie", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully add new data"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> addMovie(@RequestBody Movies movie) {
		return new ResponseEntity<ResponseApi>(movieService.saveMovie(movie), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movie/update", method = RequestMethod.PUT)
	@Operation(summary = "Update Movie", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully update data"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> updateMovie(@RequestBody Movies movie) {
		return new ResponseEntity<ResponseApi>(movieService.saveMovie(movie), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movie/delete/{id}", method = RequestMethod.DELETE)
	@Operation(summary = "Delete Movie", tags = { "Nostra Movie" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully delete data"),
		    @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found")
	})
	public ResponseEntity<ResponseApi> deleteMovie(@PathVariable Long id) {
		return new ResponseEntity<ResponseApi>(movieService.deleteMovie(id), HttpStatus.OK);
	}
	

}
