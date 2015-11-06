package com.simple.frame.modules.gen.dao;

import com.simple.frame.common.persistence.CrudDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
