package com.marksbasement.daos;

import java.util.Date;
import java.util.List;

import com.marksbasement.domain.Say;

public interface SayDao {
	
	public void insertSay(Say say);
	public void updateSay(Say say);
	public void deleteSay(Say say);
	public List<Say> searchSays(Date startDate, Date endDate);

}
