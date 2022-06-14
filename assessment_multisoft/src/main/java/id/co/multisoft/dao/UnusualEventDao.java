package id.co.multisoft.dao;

import java.util.List;

import id.co.multisoft.entity.UnusualEventA;
import id.co.multisoft.entity.UnusualEventB;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.UnusualEventCViewModel;

public interface UnusualEventDao {
	
	public List<UnusualEventA> getAllUsunualEventA();
	public List<UnusualEventB> getAllUsunualEventB();
	public List<UnusualEventC> getAllUsunualEventC();

	public void createEventA(UnusualEventA unusualEventA);
	public void createEventB(UnusualEventB unusualEventB);
	public boolean validasiId(int id, String tableName);

	

}
