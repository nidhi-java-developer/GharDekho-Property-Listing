package com.univ.dao;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univ.model.Customer;

@Repository
public class CustDao {
@Autowired
private HibernateTemplate hibernateTemplate;

@Transactional
public int saveUser(Customer user)
{
	int id=(Integer)this.hibernateTemplate.save(user);
	return id;
}

public List checkUser(Customer user)
{
 DetachedCriteria dt=(DetachedCriteria)DetachedCriteria.forClass(Customer.class);
 dt.add(Restrictions.eq("unm", user.getUnm()));
 dt.add(Restrictions.eq("pw", user.getPw()));
 List<Customer> lt=(List<Customer>)this.hibernateTemplate.findByCriteria(dt);
 return lt;
}
}
