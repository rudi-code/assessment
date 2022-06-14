package id.co.multisoft.service;

import java.util.List;

import id.co.multisoft.entity.UnusualEventA;
import id.co.multisoft.entity.UnusualEventB;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.UnusualEventCViewModel;

public interface UnusualEventService {
	
	
	/*RETRIEVE*/
	public List<UnusualEventCViewModel> getDataAllUnusualEventC();


	/*INSERT UPDATE*/
	public String createEventA(UnusualEventA unusualEventA);

	public String createEventB(UnusualEventB unusualEventB);

}
