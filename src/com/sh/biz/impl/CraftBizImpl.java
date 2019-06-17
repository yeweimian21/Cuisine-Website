package com.sh.biz.impl;

import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.CraftBiz;
import com.sh.dao.CraftDao;
import com.sh.model.Craft;

public class CraftBizImpl implements CraftBiz {

	CraftDao craftDao;
	
	public CraftDao getCraftDao() {
		return craftDao;
	}

	public void setCraftDao(CraftDao craftDao) {
		this.craftDao = craftDao;
	}

	public Map getCraftList() {
		Map craftListMap=new LinkedMap();
		craftListMap.put("title", "工艺");
		craftListMap.put("name", "craft");
		craftListMap.put("dataList", craftDao.getCraftList());
		return craftListMap;
	}

	public Craft getCraft(int craftId) {
		
		return craftDao.getCraft(craftId);
	}

}
