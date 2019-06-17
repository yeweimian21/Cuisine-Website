package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CategoryDao;
import com.sh.model.Category;

public class CategoryDaoImpl implements CategoryDao {
	
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Category> getCategoryList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Category order by categoryId asc";
		Query query=session.createQuery(hql);
		List<Category> categoryList=query.list();
		return categoryList;
	}

	public Category getCategory(int categoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Category where categoryId=:categoryId";
		Query query=session.createQuery(hql);
		query.setInteger("categoryId", categoryId);
		Category category=(Category)query.uniqueResult();
		return category;
	}

	public void addCategory(Category category) {
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		
	}

	public void deleteCategory(int categoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Category where categoryId=:categoryId";
		Query query=session.createQuery(hql);
		query.setInteger("categoryId", categoryId);
		Category category=(Category)query.uniqueResult();
		session.delete(category);
		
	}

	public void updateCategory(int categoryId, Category category) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Category where categoryId=:categoryId";
		Query query=session.createQuery(hql);
		query.setInteger("categoryId", categoryId);
		Category category2=(Category)query.uniqueResult();
		
		category2.setCategoryName(category.getCategoryName());
		
		session.update(category2);
		
	}

	
	
}
