package com.simple.frame.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simple.frame.common.service.TreeService;
import com.simple.frame.modules.sys.dao.AreaDao;
import com.simple.frame.modules.sys.entity.Area;
import com.simple.frame.modules.sys.utils.UserUtils;

/**
 * 区域Service
 * @author sa
 * @version 2015-11-03
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}
