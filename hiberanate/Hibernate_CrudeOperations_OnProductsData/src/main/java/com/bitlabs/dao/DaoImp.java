package com.bitlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import com.bitlabs.entity.Products;

public class DaoImp implements Dao{
	
	
	SessionFactory sf=null;
	public DaoImp() {
		sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 	
	}

	@Override
	public boolean addProduct(Products pro) {
		Session session = sf.openSession();
		Transaction tnx = session.beginTransaction();
		session.save(pro);
		tnx.commit();
		session.close();
		
		return true;
	}
	
	@Override
	public boolean deleteProduct(int id) {
		Session session = sf.openSession();
		Transaction tnx = session.beginTransaction();
		Products pro = session.get(Products.class,id);
		session.delete(pro);
		tnx.commit();
		session.close();
		
		return true;
	}

	@Override
	public Products searchProductById(int Id) {
		Session session=sf.openSession();
		Products pro=session.get(Products.class,Id);
		session.close();
		return pro;
	}

	@Override
	public List<Products> viewAllProducts() {
		List<Products> list=new ArrayList<Products>();
		Session session=sf.openSession();
		Query query=session.createQuery("from Products");
		list=query.list();
		session.close();
		return list;
	}

}
