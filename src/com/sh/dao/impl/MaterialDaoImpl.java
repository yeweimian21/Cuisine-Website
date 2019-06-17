package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.MaterialDao;
import com.sh.model.Category;
import com.sh.model.Material;

public class MaterialDaoImpl implements MaterialDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Material> getMaterialByCategory(int materialCategoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Material where materialCategoryId=:materialCategoryId order by materialId ASC";
		Query query=session.createQuery(hql);
		query.setInteger("materialCategoryId", materialCategoryId);
		List<Material> list=query.list();
		return list;
	}

	public void addMaterial(Material material) {
		Session session=sessionFactory.getCurrentSession();
		session.save(material);
		
	}

	public void deleteMaterial(int materialId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Material where materialId=:materialId";
		Query query=session.createQuery(hql);
		query.setInteger("materialId", materialId);
		Material material=(Material)query.uniqueResult();
		session.delete(material);
		
	}

	public Material getMaterial(int materialId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Material where materialId=:materialId";
		Query query=session.createQuery(hql);
		query.setInteger("materialId", materialId);
		Material material=(Material)query.uniqueResult();
		return material;
	}

	public void updateMaterial(int materialId, Material material) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Material where materialId=:materialId";
		Query query=session.createQuery(hql);
		query.setInteger("materialId", materialId);
		Material material2=(Material)query.uniqueResult();
		
		material2.setMaterialName(material.getMaterialName());
		material2.setMaterialCategoryId(material.getMaterialCategoryId());
		
		session.update(material2);
		
	}

	public List<Material> getMaterialList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Material orderby materialId asc";
		Query query=session.createQuery(hql);
		List<Material> list=query.list();
		return list;
	}

}
