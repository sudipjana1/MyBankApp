package bank.com.service;


import java.util.List;

import org.springframework.stereotype.Service;

import bank.com.model.AccountInfo;

@Service
public interface AccountInfoService {
	
	public AccountInfo getAccountInfo(Integer accountNo); 
	
	public void setAccountInfo(AccountInfo accountInfo); 
	
	public List<AccountInfo> getallAccountInfo(); 

}
