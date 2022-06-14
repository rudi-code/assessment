package id.co.multisoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.co.multisoft.entity.UnusualEventA;
import id.co.multisoft.entity.UnusualEventB;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.UnusualEventCViewModel;
import id.co.multisoft.service.UnusualEventService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "unusualEvent")
public class UnusualEventController {
	
	@Autowired
	UnusualEventService unusualEventService;
	
	@ApiOperation(value = "Get All Unusual Event C", response = UnusualEventC.class)
	@RequestMapping(value = "/getAllUnusualEvent", method = RequestMethod.GET)
	public ResponseEntity<List<UnusualEventCViewModel>> getAllEvent(){
		List<UnusualEventCViewModel> dataList = unusualEventService.getDataAllUnusualEventC();
		return new ResponseEntity<List<UnusualEventCViewModel>>(dataList, HttpStatus.OK);
	}
	
	@ApiOperation(value = "create Unusual Event A", response = UnusualEventA.class)
	@RequestMapping(value = "/createUnusualEventA", method = RequestMethod.POST)
	public ResponseEntity<String> createUnusualEventA(@RequestBody UnusualEventA unusualEventA){
		String rn = unusualEventService.createEventA(unusualEventA);
		return new ResponseEntity<String>(rn, HttpStatus.OK);
	}
	
	@ApiOperation(value = "create Unusual Event B", response = UnusualEventB.class)
	@RequestMapping(value = "/createUnusualEventB", method = RequestMethod.POST)
	public ResponseEntity<String> createUnusualEventB(@RequestBody UnusualEventB unusualEventB){
		String rn = unusualEventService.createEventB(unusualEventB);
		return new ResponseEntity<String>(rn, HttpStatus.OK);
	}
	
	/*@ApiOperation(value = "Get Unusual Event by Id", response = UnusualEventC.class)
	@RequestMapping(value = "/getAllUnusualEvent/{id}", method = RequestMethod.GET)
	public ResponseEntity<UnusualEventCViewModel> getEventById(@RequestParam int id){
		UnusualEventCViewModel dataVM = unusualEventService.getUnusualEventCById(id);
		return new ResponseEntity<UnusualEventCViewModel>(dataVM, HttpStatus.OK);
	}*/
	

}
