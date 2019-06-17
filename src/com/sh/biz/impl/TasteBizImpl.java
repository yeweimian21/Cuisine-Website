package com.sh.biz.impl;

import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.dao.TasteDao;
import com.sh.model.Taste;

public class TasteBizImpl implements com.sh.biz.TasteBiz {

	TasteDao tasteDao;
	
	public TasteDao getTasteDao() {
		return tasteDao;
	}

	public void setTasteDao(TasteDao tasteDao) {
		this.tasteDao = tasteDao;
	}

	public Map getTasteList() {
		Map tasteListMap=new LinkedMap();
		tasteListMap.put("title", "口味");
		tasteListMap.put("name", "taste");
		tasteListMap.put("dataList", tasteDao.getTasteList());
		return tasteListMap;
	}

	public Taste getTaste(int tasteId) {
		
		return tasteDao.getTaste(tasteId);
	}

}
