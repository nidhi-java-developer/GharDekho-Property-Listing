package com.univ.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.dao.CustDao;
import com.univ.model.Customer;

@Service
public class CustomerServices {
@Autowired
 
private CustDao userDao;

public int createUser(Customer user)
{
  return this.userDao.saveUser(user);	
}

public List loginCheck(Customer user)
{
 return this.userDao.checkUser(user);
 //calling dao method
}
}
