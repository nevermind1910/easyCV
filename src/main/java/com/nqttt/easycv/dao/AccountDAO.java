package com.nqttt.easycv.dao;

import com.nqttt.easycv.model.AccountDTO;

public interface AccountDAO {
    public AccountDTO findByUsername(String username);
    public boolean remove(int id);
    public int add(AccountDTO obj);
    public boolean edit(AccountDTO obj);

}
