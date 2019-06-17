package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.model.Category;
import com.sh.model.CostTime;
import com.sh.model.Craft;
import com.sh.model.Cuisine;
import com.sh.model.Difficulty;
import com.sh.model.Recipe;

public class RecipeDaoImpl implements com.sh.dao.RecipeDao {
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Recipe getRecipe(int recipeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where recipeId=:recipeId";
		Query query=session.createQuery(hql);
		query.setInteger("recipeId", recipeId);
		Recipe recipe=(Recipe)query.uniqueResult();		
		return recipe;
	}

	public List<Recipe> getReciptList() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Recipe> getRecipeListByTaste(int tasteId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where tasteId=:tasteId";
		Query query=session.createQuery(hql);
		query.setInteger("tasteId", tasteId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByMaterial(int materialId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where materialId=:materialId";
		Query query=session.createQuery(hql);
		query.setInteger("materialId", materialId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getReciptList(String recipeName) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where recipeName like :recipeName";
		Query query=session.createQuery(hql);
		query.setString("recipeName", "%"+recipeName+"%");
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByCategory(int categoryId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where categoryId=:categoryId";
		Query query=session.createQuery(hql);
		query.setInteger("categoryId", categoryId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByCostTime(int costTimeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where costTimeId=:costTimeId";
		Query query=session.createQuery(hql);
		query.setInteger("costTimeId", costTimeId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByCraft(int craftId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where craftId=:craftId";
		Query query=session.createQuery(hql);
		query.setInteger("craftId", craftId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByCuisine(int cuisineId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where cuisineId=:cuisineId";
		Query query=session.createQuery(hql);
		query.setInteger("cuisineId", cuisineId);
		List<Recipe> list=query.list();
		return list;
	}

	public List<Recipe> getRecipeListByDifficulty(int difficultyId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recipe where difficultyId=:difficultyId";
		Query query=session.createQuery(hql);
		query.setInteger("difficultyId", difficultyId);
		List<Recipe> list=query.list();
		return list;
	}
	
	

}
