package id.co.multisoft.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.multisoft.dao.UnusualEventDao;
import id.co.multisoft.entity.UnusualEventA;
import id.co.multisoft.entity.UnusualEventB;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.UnusualEventCViewModel;
import id.co.multisoft.service.UnusualEventService;

@Service
public class UnusualEventServiceImpl implements UnusualEventService {

	@Autowired
	UnusualEventDao unusualEventDao;

	@Override
	public List<UnusualEventCViewModel> getDataAllUnusualEventC() {
		// TODO Auto-generated method stub
		List<UnusualEventA> ListEntityA = unusualEventDao.getAllUsunualEventA();
		List<UnusualEventB> ListEntityB = unusualEventDao.getAllUsunualEventB();
		List<UnusualEventC> ListEntityC = unusualEventDao.getAllUsunualEventC();
		
		int longListEntityC = ListEntityC.size();
		List<UnusualEventCViewModel> listDataVM = new ArrayList<>();
		
		for(int i=0; i<longListEntityC; i++) {
			Integer idEventA = ListEntityC.get(i).getId_unusual_event_a() == null? 0:ListEntityC.get(i).getId_unusual_event_a();
			Integer idEventB = ListEntityC.get(i).getId_unusual_event_b() == null? 0:ListEntityC.get(i).getId_unusual_event_b();
			
			UnusualEventCViewModel dataVM = new UnusualEventCViewModel();
			dataVM.setId(ListEntityC.get(i).getId());
			dataVM.setCreated_date(ListEntityC.get(i).getCreated_date());
			
			for(UnusualEventA eventA : ListEntityA) {
				if(idEventA == eventA.getId()) {
					dataVM.setUnusualEventA(eventA);
				}
			}	
			for(UnusualEventB eventB : ListEntityB) {
				if(idEventB == eventB.getId()) {
					dataVM.setUnusualEventB(eventB);
				}
			}
			listDataVM.add(dataVM);
		}
		
		return listDataVM;
	}

	@Override
	public String createEventA(UnusualEventA unusualEventA) {
		// TODO Auto-generated method stub
		if(unusualEventDao.validasiId(unusualEventA.getId(), "UNUSUAL_EVENT_A")) {
			return "Unusual Event with id ="+unusualEventA.getId()+" already exist";
		}else {
			unusualEventDao.createEventA(unusualEventA);
			return "SUKSES CREATED";
		}
	}

	@Override
	public String createEventB(UnusualEventB unusualEventB) {
		// TODO Auto-generated method stub
		if(unusualEventDao.validasiId(unusualEventB.getId(), "UNUSUAL_EVENT_B")) {
			return "Unusual Event with id ="+unusualEventB.getId()+" already exist";
		}else {
			unusualEventDao.createEventB(unusualEventB);
			return "SUKSES CREATED";
		}
		
	}
	
	/*@Override
	public List<UnusualEventC> getDataAllUnusualEvent() {
		// TODO Auto-generated method stub
		List<UnusualEventA> dataA = unusualEventDao.getAllUsunualEventA();
		List<UnusualEventB> dataB = unusualEventDao.getAllUsunualEventB();
		
		int longDataA = dataA.size();
		int longDataB = dataB.size();
		List<UnusualEventC> dataList = new ArrayList<>();
		java.util.Date dt = new java.util.Date();
		if(longDataA>longDataB) {
			
		}else if(longDataA<longDataB) {
			
		}else {
			for(int i=0; i<longDataA; i++) {
				UnusualEventC dataC = new UnusualEventC();
				dataC.setId(i+1);
				dataC.setUnusualEventA(dataA.get(i));
				dataC.setUnusualEventB(dataB.get(i));
				dataC.setCreated_date(dt.toString());
				dataList.add(dataC);
			}
		}
		return dataList;
	}*/
	
	/*@Override
	public UnusualEventCViewModel getUnusualEventCById(int id) {
		// TODO Auto-generated method stub
		UnusualEventA eventA = unusualEventDao.getEventAById(id);
		UnusualEventB eventB = unusualEventDao.getEventBById(id);
		UnusualEventC eventC = unusualEventDao.getEventCById(id);
		
		UnusualEventCViewModel dataVM = new UnusualEventCViewModel();
		dataVM.setId(eventC.getId());
		dataVM.setUnusualEventA(eventA);
		dataVM.setUnusualEventB(eventB);
		dataVM.setCreated_date(eventC.getCreated_date());
		
		return dataVM;
	}*/
}
