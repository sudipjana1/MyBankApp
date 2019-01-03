package bank.com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.com.model.AccountInfo;
import bank.com.repository.AccountInfoRepo;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {
	
	@Autowired 
	private AccountInfoRepo ar;

	@Override
	public AccountInfo getAccountInfo(Integer accountNo) {
		// TODO Auto-generated method stub
		return ar.findOne(accountNo);
		
	}

	@Override
	public void setAccountInfo(AccountInfo accountInfo) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ADD Account::"+accountInfo);
		ar.save(accountInfo);		
	}

	@Override
	public List<AccountInfo> getallAccountInfo() {
		// TODO Auto-generated method stub
		return (List<AccountInfo>) ar.findAll();
	}

}
