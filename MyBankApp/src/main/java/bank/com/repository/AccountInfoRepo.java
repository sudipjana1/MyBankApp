package bank.com.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.com.model.AccountInfo;

@Repository
public interface AccountInfoRepo extends CrudRepository<AccountInfo, Integer> {
	


}
