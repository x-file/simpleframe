package com.simple.frame.modules.sys.dao;

import java.util.List;

import com.simple.frame.common.persistence.CrudDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author sa
 * @version 2015-11-04
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
