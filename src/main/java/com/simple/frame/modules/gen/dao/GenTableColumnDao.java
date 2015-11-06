package com.simple.frame.modules.gen.dao;

import com.simple.frame.common.persistence.CrudDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
	
	public void deleteByGenTableId(String genTableId);
}
