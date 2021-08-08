package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.BO.Boimpl;
@Repository("gop")
public class StudentRetrive implements IStudentRetrive {
	// | id | name | address | city | sallary | job | DEPARTMENT
	public static final String QRY_TO_RETRIVE = "SELECT ID,NAME,ADDRESS,CITY,SALLARY,JOB,DEPARTMENT FROM CIVIL";
	public static final String QRY_TO_EDIT = "SELECT ID,NAME,ADDRESS,CITY,SALLARY,JOB,DEPARTMENT FROM CIVIL WHERE ID=?";
	public static final String QRY_TO_UPDATE = "UPDATE CIVIL SET CITY=?,ADDRESS=? WHERE ID=?";
		
	@Autowired
	private JdbcTemplate jov;
	List<Boimpl> data;
	
	List<Boimpl> data1;
	@Override
	public List<Boimpl> retrive() {
		data=jov.query(QRY_TO_RETRIVE,new RetriveEMP());
		return data;
	}

	public class RetriveEMP implements ResultSetExtractor<List<Boimpl>> {

		@Override
		public List<Boimpl> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			data = new ArrayList<Boimpl>();
			while (rs.next()) {
				// | id | name | address | city | sallary | job | DEPARTMENT

		      	Boimpl obj = new Boimpl();
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setAddress(rs.getString("address"));
				obj.setJob(rs.getString("job"));
				obj.setSallary(rs.getFloat("sallary"));
				obj.setDEPARTMENT(rs.getString("DEPARTMENT"));
				obj.setCity(rs.getString("city"));
				data.add(obj);
			}
			return data;
		}

	}

	public List<Boimpl> retrive(int id) {
		// TODO Auto-generated method stub
		List<Boimpl> vv=jov.query(QRY_TO_EDIT,new gg(),id);
		
		return vv;
		
	}
	public class gg implements RowMapper<Boimpl>
	{
		
		

		@Override
		public Boimpl mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
            Boimpl opo=new Boimpl();
            opo.setId(rs.getInt("id"));
            opo.setName(rs.getString("name"));
            opo.setAddress(rs.getString("address"));
            opo.setJob(rs.getString("job"));
            opo.setCity(rs.getString("city"));
            opo.setSallary(rs.getFloat("sallary"));
            opo.setDEPARTMENT(rs.getString("DEPARTMENT"));
		  
		return opo;
		}
		
	}

	@Override
	public int retrive(int id, String city, String add) {
		// TODO Auto-generated method stub
		List<Boimpl> pio=new ArrayList<Boimpl>();
		
		
//	   pio=jov.query(QRY_TO_UPDATE, new Updater(),city,add,id);
//	   Boimpl lo=new Boimpl();
//	   for(Boimpl ob:pio)
//	   {        
//	          System.out.println(ob.getAddress());
//	          System.out.println(ob.getCity());
//	          lo=ob;
//	   }
//		
		int k=jov.update(QRY_TO_UPDATE,city,add,id);
		System.out.println(k);
		return k;
 	
	}
	
public class Updater implements RowMapper<Boimpl>
{

	@Override
	public Boimpl mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Boimpl obj=new Boimpl();
		obj.setCity(rs.getString("city"));
		obj.setAddress(rs.getString("address"));
		return obj;
	}
	
}
}
