package com.simple.frame.common.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Mysql 多数据源切换
 *
 * @author sa
 * @version V1.0
 * @Description:
 * @date 2015/10/09
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    /**
     * @return the currentLookupKey
     * @author sa
     * @date 2015-10-29
     */
    public static String getCurrentLookupKey() {
        return (String) contextHolder.get();
    }

    /**
     * @param currentLookupKey the currentLookupKey to set
     * @author sa
     * @date 2015-10-29
     */
    public static void setCurrentLookupKey(String currentLookupKey) {
        contextHolder.set(currentLookupKey);
    }

    /* 
     * (non-Javadoc) 
     *  
     * @see 
     * org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource# 
     * determineCurrentLookupKey() 
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return getCurrentLookupKey();
    }
}