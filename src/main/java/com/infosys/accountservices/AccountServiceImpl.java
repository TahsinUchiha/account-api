package com.infosys.accountservices;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepo;
	

	public String getAll() {
		return accountRepo.getAll();
	}


	public String add(String account) {
		return accountRepo.create(account);
	}


	public String delete(Long id) {
		return accountRepo.delete(id);
	}
	

	public String update(Long id, String accountToUpdate) {
		return accountRepo.update(id, accountToUpdate);
	}
	

	public String create(String account) {
		return accountRepo.create(account);
	}

	public void setRepo(AccountRepository persist) {
		this.accountRepo = persist;
	}
	
	

	public String get(Long id) {
		return accountRepo.get(id);
	}

}
