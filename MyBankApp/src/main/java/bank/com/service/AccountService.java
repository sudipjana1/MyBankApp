package bank.com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.com.model.AccountInfo;
import bank.com.repository.AccountInfoRepo;





@Service
public class AccountService {
	

	

	Hashtable<String ,AccountInfo> accountInfos = new Hashtable<String, AccountInfo>();
	
	public AccountService() {
		AccountInfo acctInfo = new AccountInfo();
		//acctInfo.setAccountno(100000);
		acctInfo.setAccountfname("Sudip");
		acctInfo.setAccountlname("Jana");
		acctInfo.setAccountaddress("Howrah");
		acctInfo.setAccountbal(100.00);
		acctInfo.setAccounttype("SB");
		acctInfo.setNominee("Saunak");
		acctInfo.setEmailid("sj@sjana.com");
		acctInfo.setContactno("302-763-6646");
		acctInfo.setAltcontactno("123456");
		acctInfo.setPanno("ABCDEFG");
		acctInfo.setStatus("Active");
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = null;
			date = fmt.parse("1982-08-25");
			acctInfo.setDob(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+acctRepo);
		//acctRepo.save(acctInfo);
		accountInfos.put("1",acctInfo);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+accountInfos);
		
		
		acctInfo = new AccountInfo();
		acctInfo.setAccountfname("Saunak");
		acctInfo.setAccountlname("Jana");
		acctInfo.setAccountaddress("Howrah");
		acctInfo.setAccountbal(100.00);
		acctInfo.setAccounttype("SB");
		acctInfo.setNominee("Saunak");
		acctInfo.setEmailid("sj@sjana.com");
		acctInfo.setContactno("302-763-6646");
		acctInfo.setAltcontactno("123456");
		acctInfo.setPanno("ABCDEFG");
		acctInfo.setStatus("Active");
		
		
		try {
			Date date = null;
			date = null;
			date = fmt.parse("2014-03-03");
			acctInfo.setDob(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		accountInfos.put("2",acctInfo);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+accountInfos);
		//acctRepo.save(acctInfo);
		
	}
	
	public AccountInfo getAccountInfo(String id) {
		if (accountInfos.containsKey(id))
			return accountInfos.get(id);
		else
			return null;
	}
	
	
	
}
	