package com.simple.frame.modules.gen.dao;

import com.simple.frame.common.persistence.CrudDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.gen.entity.GenTemplate;

/**
 * 代码模板DAO接口
 * @author sa
 * @version 2015-11-05
 */
@MyBatisDao
public interface GenTemplateDao extends CrudDao<GenTemplate> {
	
}
