package com.simple.frame.modules.sys.dao;

import com.simple.frame.common.persistence.TreeDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author sa
 * @version 2015-11-05
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
