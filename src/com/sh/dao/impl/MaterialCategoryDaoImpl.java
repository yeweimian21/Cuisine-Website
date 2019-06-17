package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.MaterialCategoryDao;
import com.sh.model.MaterialCategory;

public class MaterialCategoryDaoImpl implements MaterialCategoryDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<MaterialCategory> getMaterialCategoryList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from MaterialCategory order by materialCategoryId asc";
		Query query=session.createQuery(hql);
		List<MaterialCategory> list=query.list();
		return list;
	}

	public MaterialCategory getMaterialCategory(int materialCategoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from MaterialCategory where materialCategoryId=:materialCategoryId";
		Query query=session.createQuery(hql);
		query.setInteger("materialCategoryId", materialCategoryId);
		MaterialCategory materialCategory=(MaterialCategory)query.uniqueResult();
		return materialCategory;
	}

	public void addMaterialCategory(MaterialCategory materialCategory) {
		Session session=sessionFactory.getCurrentSession();
		session.save(materialCategory);
		
	}

	public void deleteMaterialCategory(int materialCategoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from MaterialCategory where materialCategoryId=:materialCategoryId";
		Query query=session.createQuery(hql);
		query.setInteger("materialCategoryId", materialCategoryId);
		MaterialCategory materialCategory=(MaterialCategory)query.uniqueResult();
		System.out.println("dele");
		session.delete(materialCategory);
		
	}

	public void updateMaterialCategory(int materialCategoryId, MaterialCategory materialCategory) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from MaterialCategory where materialCategoryId=:materialCategoryId";
		Query query=session.createQuery(hql);
		query.setInteger("materialCategoryId", materialCategoryId);
		MaterialCategory materialCategory2=(MaterialCategory)query.uniqueResult();
		
		materialCategory2.setMaterialCategoryId(materialCategory.getMaterialCategoryId());
		materialCategory2.setMaterialCategoryName(materialCategory.getMaterialCategoryName());
		
		session.update(materialCategory2);
		
	}

}
