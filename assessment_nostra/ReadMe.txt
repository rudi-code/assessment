--- REQUIREMENT ---

•	Project : Nostra Movie Service API
•	Language : Java
•	Spring Boot : 2.7.0
•	Project Metadata: Merupakan metadata project Maven, terdiri sebagai berikut
	o	groupId: nostra
	o	artifactId: movie
	o	name: movie
	o	description : Assessment Nostra Project
	o	package name : nostra.movie
	o	packaging : jar
	o	Java : Java 11
•	Dependencies : 
	o	Spring web
	o	Spring data JPA
	o	PostgreSQL Driver
	o	Open Api UI (for Swagger)
	o	Spring Boot DevTools
	o	Lombok
•	DataBase: PostgreSQL

--- HOW TO RUN APP ---

•	On Localhost

	o	run commandprompt(cmd)
	o	root to project (Example : D:\Work\MyProject\movie)
	o	mvn clean install (for clean apps and build project)
	o	mvn spring-boot:run (run application)

•	On Docker

	o	Create .jar from application (.jar can get from mvn clean install on target package) 
	o	Create dockerfile 
		Example :
			FROM openjdk:11-slim
			RUN mkdir -p /apps/logs
			COPY your-jar.jar /apps/ your-jar.jar
			WORKDIR /apps
			ENTRYPOINT exec java -jar your-jar.jar
	o	docker build –t image-name (build Image Docker)
	o	docker run --name [pengaliasan_container] -p [port_yang_mau_diexposed:port_program] –d [nama_image:nama_tag] (run application)



--- LIST API ---

•	Get All Movies
	
	curl: 
		curl -X 'GET' \
  	 	'http://localhost:8000/nostra/all-movies' \
  	 	-H 'accept: */*'
	request url:
	 	http://localhost:8000/nostra/all-movies
	Description:
	 	to get all data movie.

•	Get Movie by Id

	curl:
		curl -X 'GET' \
  		'http://localhost:8000/nostra/movie/2' \
 		-H 'accept: */*'

	request Url:  
		http://localhost:8000/nostra/movie/2

	response body:
		{
  		"status": "SUCCESS",
  		"message": null,
  		"executiontime": 0,
  		"detailInfo": 1,
  		"result": {
    			"id": 2,
    			"movie_name": "KAPAL KERTAS",
    			"rating": null,
    			"genre": null,
    			"path_image": null,
    			"path_video": null,
    			"year": 2021,
    			"run_time": 90,
    			"description": "young girl who always got bully but never giveup for her life",
    			"created_by": "admin",
    			"created_date": "2022-06-08T00:00:00.000+00:00",
    			"updated_by": "",
    			"updated_date": "2022-06-08T00:00:00.000+00:00"
  			}
			}

	Description:
	 	to get movie by id movie.

•	Add new Movie

	curl:
		curl -X 'POST' \
		  'http://localhost:8000/nostra/movie/add' \
		  -H 'accept: */*' \
		  -H 'Content-Type: application/json' \
		  -d '{
		  "id": 0,
		  "movie_name": "KERIPIK",
		  "rating": "60",
		  "genre": "drama",
		  "path_image": "string",
		  "path_video": "string",
		  "year": 2019,
		  "run_time": 120,
		  "description": "string",
		  "created_by": "string",
		  "created_date": "2022-06-10T08:55:55.912Z",
		  "updated_by": "string",
		  "updated_date": "2022-06-10T08:55:55.912Z"
		}'

	request Url:  
		http://localhost:8000/nostra/movie/add

	request body:
		{
 		  "id": 0,
		  "movie_name": "KERIPIK",
		  "rating": "60",
		  "genre": "drama",
 		  "path_image": "string",
		  "path_video": "string",
		  "year": 2019,
		  "run_time": 120,
		  "description": "string",
		  "created_by": "string",
		  "created_date": "2022-06-10T08:55:55.912Z",
		  "updated_by": "string",
		  "updated_date": "2022-06-10T08:55:55.912Z"
		}

	response body:
		{
		  "status": "SUCCESS",
		  "message": "Data already created.",
		  "executiontime": 0,
		  "detailInfo": 1,
		  "result": {
 		  "id": 7,
 		  "movie_name": "KERIPIK",
 		  "rating": "60",
 		  "genre": "drama",
  		  "path_image": "string",
  		  "path_video": "string",
   		  "year": 2019,
   		  "run_time": 120,
   		  "description": "string",
  		  "created_by": "string",
   		  "created_date": "2022-06-10T08:55:55.912+00:00",
  		  "updated_by": "string",
  		  "updated_date": "2022-06-10T08:55:55.912+00:00"
 		 }
		}

	Description:
	 	to add new movie by model.

•	Update Movie

	curl:
		curl -X 'PUT' \
  		'http://localhost:8000/nostra/movie/update' \
  		-H 'accept: */*' \
  		-H 'Content-Type: application/json' \
  		-d '{
    		"id": 7,
    		"movie_name": "KERIPIK",
    		"rating": "60",
    		"genre": "drama",
    		"path_image": "string",
    		"path_video": "string",
    		"year": 2019,
    		"run_time": 120,
    		"description": "testing",
    		"created_by": "string",
    		"created_date": "2022-06-10T08:55:55.912+00:00",
    		"updated_by": "string",
    		"updated_date": "2022-06-10T08:55:55.912+00:00"
  		}'

	request Url:  
		http://localhost:8000/nostra/movie/add

	request body:
		{
 		  "id": 7,
		  "movie_name": "KERIPIK",
		  "rating": "60",
		  "genre": "drama",
 		  "path_image": "string",
		  "path_video": "string",
		  "year": 2019,
		  "run_time": 120,
		  "description": "testing",
		  "created_by": "string",
		  "created_date": "2022-06-10T08:55:55.912Z",
		  "updated_by": "string",
		  "updated_date": "2022-06-10T08:55:55.912Z"
		}

	response body:
		{
  		"status": "SUCCESS",
  		"message": "Data already update.",
  		"executiontime": 0,
  		"detailInfo": 1,
  		"result": {
    			"id": 7,
    			"movie_name": "KERIPIK",
    			"rating": "60",
    			"genre": "drama",
    			"path_image": "string",
    			"path_video": "string",
    			"year": 2019,
    			"run_time": 120,
    			"description": "testing",
    			"created_by": "string",
    			"created_date": "2022-06-10T08:55:55.912+00:00",
    			"updated_by": "string",
    			"updated_date": "2022-06-10T08:55:55.912+00:00"
  			}
		}

	Description:
	 	to update movie.

•	Update Movie

	curl:
		curl -X 'GET' \
  		'http://localhost:8000/nostra/movies?genre=drama&year=0' \
  		-H 'accept: */*'

	request Url:  
		http://localhost:8000/nostra/movies?genre=drama&year=0
	
	request parameter:
		movieName: null
		rating: null
		genre: drama
		year: 0

	response body:
		{
  "status": "SUCCESS",
  "message": null,
  "executiontime": 0,
  "detailInfo": 3,
  "result": [
    {
      "id": 7,
      "movie_name": "KERIPIK",
      "rating": "60",
      "genre": "drama",
      "path_image": "string",
      "path_video": "string",
      "year": 2019,
      "run_time": 120,
      "description": "testing",
      "created_by": "string",
      "created_date": "2022-06-10T08:55:55.912+00:00",
      "updated_by": "string",
      "updated_date": "2022-06-10T08:55:55.912+00:00"
    },
    {
      "id": 5,
      "movie_name": "BEBEK BAIK",
      "rating": "89",
      "genre": "drama",
      "path_image": "string",
      "path_video": "string",
      "year": 2019,
      "run_time": 90,
      "description": "A little girl who so good on cooking",
      "created_by": "string",
      "created_date": "2022-06-09T17:19:46.704+00:00",
      "updated_by": "string",
      "updated_date": "2022-06-09T17:19:46.704+00:00"
    },
    {
      "id": 4,
      "movie_name": "BEBEK CUTE",
      "rating": "90",
      "genre": "drama",
      "path_image": "string",
      "path_video": "string",
      "year": 2019,
      "run_time": 90,
      "description": "A little girl who so cute and beautiful",
      "created_by": "string",
      "created_date": "2022-06-09T17:19:46.704+00:00",
      "updated_by": "string",
      "updated_date": "2022-06-09T17:19:46.704+00:00"
    }
  ]
}

	Description:
	 	to get movie by paramter title, genre, rating, and year.






•	Delete Movie

	curl:
		curl -X 'DELETE' \
  		'http://localhost:8000/nostra/movie/delete/3' \
  		-H 'accept: */*'

	request Url:  
		http://localhost:8000/nostra/movie/delete/3

	response body:
		{
  		"status": "SUCCESS",
  		"message": null,
  		"executiontime": 0,
  		"detailInfo": 1,
  		"result": "Deleted Data Success."
		}

	Description:
	 	to delete movie by id movie.



















