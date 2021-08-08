package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.core.RecordExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.spring.bo.BOimp;
@Service("dap")
public class DAOimpl<T> implements Dao {
public static final String QRY_TO_EMP="SELECT ID,NAME,LAST,ROLL FROM EMPAC";
	         @Autowired
	         @Qualifier("fgg")
			JdbcTemplate jt;
	         List<Map<String,Object>> get;
	         List<BOimp>bhold=new ArrayList<>();
	         List<BOimp> po=new ArrayList<BOimp>();

	public class getemps implements ResultSetExtractor<List<BOimp>>
	{
		@Override
		public List<BOimp> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			while(rs.next())
		      {
			BOimp obk=new BOimp();
			obk.setId(rs.getInt("id"));
			obk.setName(rs.getString("name"));
			obk.setLast(rs.getString("last"));
			obk.setRoll(rs.getInt("roll"));
			po.add(obk);
		}
		return 	po;
		
		}	
	}
	public List<BOimp> getEMP() {
      jt.query(QRY_TO_EMP,new getemps());

		return  po;
	}

}
