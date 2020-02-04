package com.moneyhub.web.cus.mappers;

import com.moneyhub.web.cus.domains.Account;

public interface AccountMapper {
	
	public void createAcc(Account acc);
	public int existAcc(String acc);
	public Account getAcc(String acctNo);
}
