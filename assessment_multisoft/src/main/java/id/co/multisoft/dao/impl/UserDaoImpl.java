package id.co.multisoft.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import id.co.multisoft.dao.UserDao;
import id.co.multisoft.entity.UnusualEventC;
import id.co.multisoft.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/*########## RETRIEVE #########*/
	@Override
	public List<User> getAlluser(String tableName) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM "+tableName;
		List<User> data = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class)); 
		return data;
	}
	
	@Override
	public User getUserById(String id, String tableName) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ? WHERE ID=?";
		User data = (User) jdbcTemplate.queryForObject(sql, new Object[] {tableName, id}, new BeanPropertyRowMapper(User.class)); 
		return data;
	}
	
	@Override
	public boolean validasiIdAndEmail(String id, String email) {
		try {
			String sql = "SELECT * FROM USER_C WHERE ID =? OR EMAIL =?";
			User data = (User) jdbcTemplate.queryForObject(sql, new Object[] {id, email}, new BeanPropertyRowMapper(User.class));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	/*########## INSERT UPDATE #########*/
	
	@Override
	public String callSP(User user) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("_ID", user.getId());
		param.put("_NAME", user.getName());
		param.put("_EMAIL", user.getEmail());
		
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
		Map<String, Object> map = call.withoutProcedureColumnMetaDataAccess()
				.withProcedureName("USER_INS")
				.declareParameters(new SqlParameter[] {
						new SqlParameter("_ID", Types.VARCHAR),
						new SqlParameter("_NAME", Types.VARCHAR),
						new SqlParameter("_EMAIL", Types.VARCHAR),
						new SqlOutParameter("O_STATUS_MSG", Types.VARCHAR)
				}).execute(param);
		String rn = (String) map.get("O_STATUS_MSG");
		return rn;
	}

}
