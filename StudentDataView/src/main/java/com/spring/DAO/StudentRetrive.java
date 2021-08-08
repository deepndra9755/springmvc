package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.spring.BO.Boimpl;
@Repository("gop")
public class StudentRetrive implements IStudentRetrive {
	// | id | name | address | city | sallary | job | DEPARTMENT
	public static final String QRY_TO_RETRIVE = "SELECT ID,NAME,ADDRESS,CITY,SALLARY,JOB,DEPARTMENT FROM CIVIL";
    @Autowired
	private JdbcTemplate jov;
	List<Boimpl> data;

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

}
