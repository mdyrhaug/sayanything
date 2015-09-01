package com.marksbasement.services;

import java.util.Date;
import java.util.List;

import com.marksbasement.daos.SayDao;
import com.marksbasement.daos.SayDaoDerbyImpl;
import com.marksbasement.daos.SayDaoMySQLImpl;
import com.marksbasement.domain.Say;
import com.marksbasement.domain.SayConstants;

public class SayService {

	public List<Say> getSays()
	{
		SayDao dao = getDao();
		List<Say> says = dao.searchSays(new Date(), new Date());
		System.out.println("in getSays.  found this many: " +says.size());
		return says;
	}
	
	public void insertSay(Say say)
	{
		SayDao dao = getDao();
		dao.insertSay(say);
	}
	
	private SayDao getDao()
	{
		SayDao dao;
		
		if(SayConstants.getDatabaseType().equals("mysql"))
		{
			dao = new SayDaoMySQLImpl();			
		} else
		{
			dao = new SayDaoDerbyImpl();
		}
		return dao;
	}
}
