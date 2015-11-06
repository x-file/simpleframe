package com.simple.frame.modules.sys.dao;

import com.simple.frame.common.persistence.CrudDao;
import com.simple.frame.common.persistence.annotation.MyBatisDao;
import com.simple.frame.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author sa
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
