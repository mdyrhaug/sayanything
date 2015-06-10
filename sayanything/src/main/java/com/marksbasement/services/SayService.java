package com.marksbasement.services;

import java.util.Date;
import java.util.List;

import com.marksbasement.daos.SayDao;
import com.marksbasement.daos.SayDaoDerbyImpl;
import com.marksbasement.domain.Say;

public class SayService {

	public List<Say> getSays()
	{
		SayDao dao = new SayDaoDerbyImpl();
		List<Say> says = dao.searchSays(new Date(), new Date());
		System.out.println("in getSays.  found this many: " +says.size());
		return says;
	}
	
	public void insertSay(Say say)
	{
		SayDao dao = new SayDaoDerbyImpl();
		dao.insertSay(say);
	}
}
