package com.infosys.accountservices;

public interface AccountService {

	String getAll();

	String add(String account);

	String delete(Long id);

	String update(Long id, String accountToUpdate);

	String create(String account);

	String get(Long id);

}