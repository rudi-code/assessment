package id.co.multisoft.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import id.co.multisoft.dao.UnusualEventDao;
import id.co.multisoft.entity.UnusualEventA;
import id.co.multisoft.entity.UnusualEventB;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.UnusualEventCViewModel;
import id.co.multisoft.entity.User;
import id.co.multisoft.service.UnusualEventService;

@Repository
public class UnusualEventDaoImpl implements UnusualEventDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<UnusualEventA> getAllUsunualEventA() {
		// TODO Auto-generated method stub
		String sql = "select * from UNUSUAL_EVENT_A";
		List<UnusualEventA> data = jdbcTemplate.query(sql, new BeanPropertyRowMapper(UnusualEventA.class));
		System.out.println("UNUSUAL_EVENT_A :"+data);
		return data;	
	}

	@Override
	public List<UnusualEventB> getAllUsunualEventB() {
		// TODO Auto-generated method stub
		String sql = "select * from UNUSUAL_EVENT_B";
		List<UnusualEventB> data = jdbcTemplate.query(sql, new BeanPropertyRowMapper(UnusualEventB.class));
		System.out.println("UNUSUAL_EVENT_B :"+data);
		return data;
	}

	@Override
	public List<UnusualEventC> getAllUsunualEventC() {
		// TODO Auto-generated method stub
		String sql = "select * from UNUSUAL_EVENT_C";
		List<UnusualEventC> data = jdbcTemplate.query(sql, new BeanPropertyRowMapper(UnusualEventC.class));
		System.out.println("UNUSUAL_EVENT_C :"+data);
		return data;
	}

	@Override
	public void createEventA(UnusualEventA unusualEventA) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO UNUSUAL_EVENT_A VALUES ("
				/*+ "(select max(id)+1 from UNUSUAL_EVENT_A),'"*/
				+ unusualEventA.getId()+",'"
				+ unusualEventA.getObject()+ "','"
				+ unusualEventA.getEvent_type()+ "','"
				+ unusualEventA.getVideo_link()+ "',"
				+ unusualEventA.isIs_alert()+","
				+ "to_char(current_timestamp, 'DDMMYYYYHHmmss'))";
		jdbcTemplate.execute(sql);
	}

	@Override
	public void createEventB(UnusualEventB unusualEventB) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO UNUSUAL_EVENT_B VALUES ("
				/*+ "(select max(id)+1 from UNUSUAL_EVENT_B),'"*/
				+ unusualEventB.getId()+",'"
				+ unusualEventB.getObject() + "','"
				+ unusualEventB.getObject_type() + "','"
				+ unusualEventB.getVideo_url()+ "',"
				+ "(SELECT trim(both '\"' from to_json(current_timestamp)::varchar)))";
		System.out.println("SQL :: "+sql);
		jdbcTemplate.execute(sql);
	}

	@Override
	public boolean validasiId(int id, String tableName) {
		// TODO Auto-generated method stub
		try {

			if(tableName.equalsIgnoreCase("UNUSUAL_EVENT_B")) {
				String sql = "SELECT * FROM "
						+ tableName +" WHERE ID = "+id;
				System.out.println("SQL : "+sql);
				UnusualEventB entity = (UnusualEventB) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(UnusualEventB.class));
				
			}else if(tableName.equalsIgnoreCase("UNUSUAL_EVENT_A")) {
				String sql = "SELECT * FROM "
						+ tableName +" WHERE ID = "+id;
				System.out.println("SQL : "+sql);
				UnusualEventA entity = (UnusualEventA) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(UnusualEventA.class));
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
