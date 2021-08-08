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

import com.spring.BO.BOimpl;

@Repository
public class Daoimpl implements IDAO {
   public static final String QRY_TO_INSERT="INSERT INTO STUDENTDE(NAME,LAST,IMAGE) values(?,?,?)";
   public static final String QRY_TO_RETRIVE="SELECT NAME,LAST,IMAGE FROM studentDE";
   @Autowired
	JdbcTemplate jov;
	@Override
	public int insertEmp(BOimpl ok) {
		// TODO Auto-generated method stub
		System.out.println(ok.getName()+""+ok.getLast()+""+ok.getImage());
		jov.update(QRY_TO_INSERT,ok.getName(),ok.getLast(),ok.getImage());
	return 0;
	}
	
	@Override
	public List<BOimpl> retrive() {
		return jov.query(QRY_TO_RETRIVE,new RetriveEMP());
		
	}

	public class RetriveEMP implements ResultSetExtractor<List<BOimpl>> {

		@Override
		public List<BOimpl> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			 List<BOimpl>data = new ArrayList<BOimpl>();
			while (rs.next()) {
				// | id | name | address | city | sallary | job | DEPARTMENT

				BOimpl obj = new BOimpl();
				
				obj.setName(rs.getString("name"));
				obj.setLast(rs.getString("last"));
				obj.setImage(rs.getString("image"));
				data.add(obj);
			}
			return data;
		}

	}
}
