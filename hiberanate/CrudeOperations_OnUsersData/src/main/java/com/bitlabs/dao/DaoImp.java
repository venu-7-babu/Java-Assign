package com.bitlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.entity.Users;

public class DaoImp implements Dao {
	
	SessionFactory sf=null;
	public DaoImp() {
		sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 	
	}

	@Override
	public boolean addUsers(Users usr) {
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
				session.save(usr);
				txn.commit();
				session.close();
		return true;
	}

	@Override
	public boolean deleteUserById(int id) {
		Session session=sf.openSession();
		Transaction txns=session.beginTransaction();
		Users usr=session.get(Users.class,id);
		session.delete(usr);
		txns.commit();
		session.close();
		return true;
	}

	@Override
	public List<Users> viewAllUsers() {
		List<Users> list=new ArrayList<Users>();
		Session session=sf.openSession();
		Query query=session.createQuery("from Users");
		list=query.list();
		session.close();
		return list;
	}

	@Override
	public Users updateUserbyId(int id, String uname) {
		Session session= sf.openSession();
		Transaction txns=session.beginTransaction();
		Users usr=session.get(Users.class, id);
		usr.setUname(uname);
		txns.commit();
		session.close();
		return null;
	}

	@Override
	public Users getUserbyId(int id) {
		Session session=sf.openSession();
		Users usr=session.get(Users.class, id);
		session.close();
		return usr;
	}
}
