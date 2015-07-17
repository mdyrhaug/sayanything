package com.marksbasement.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.marksbasement.domain.Say;

public class SayDaoDerbyImpl implements SayDao {

	public static final String derbyDir="E:\\dev\\apps\\derby";

	public void insertSay(Say say) {
		try{
			Connection conn = DriverManager.getConnection("jdbc:derby:E:\\dev\\apps\\derby\\sayanything");
			PreparedStatement insert = conn.prepareStatement("insert into say (name,location,createdate,say) values(?,?,?,?)");
			insert.setString(1, say.getName());
			insert.setString(2, say.getLocation());
			insert.setDate(3, new java.sql.Date( Calendar.getInstance().getTime().getTime() ));			
			insert.setString(4, say.getSay());
			insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("All done with insert");
	}

	public void updateSay(Say say) {
		// TODO Auto-generated method stub

	}

	public void deleteSay(Say say) {
		// TODO Auto-generated method stub

	}

	public List<Say> searchSays(Date startDate, Date endDate) {
		
		List<Say> says = new ArrayList<Say>();		
		
		try{
			Connection conn = DriverManager.getConnection("jdbc:derby:E:\\dev\\apps\\derby\\sayanything");
			PreparedStatement select = conn.prepareStatement("select * from say order by createdate");
			ResultSet rs = select.executeQuery();
			while(rs.next())
			{
				Say say = new Say();
				say.setName(rs.getString("name"));
				say.setLocation(rs.getString("location"));
				say.setSay(rs.getString("say"));
				say.setCreateDate(rs.getDate("createdate"));
				says.add(say);
			}
		} catch (SQLException e) {
		 e.printStackTrace();	
		}
		return says;
	}

}
