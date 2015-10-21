package com.sa.simpleframe.modules.sys.service;

import com.sa.simpleframe.common.config.Global;
import com.sa.simpleframe.common.service.BaseService;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Administrator on 2015/10/21.
 */
public class SystemService extends BaseService implements InitializingBean{
    /**
     * 获取Key加载信息
     */
    public static boolean printKeyLoadMessage(){
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n======================================================================\r\n");
        sb.append("\r\n    欢迎使用 "+ Global.getConfig("productName")+"  - Powered By sa\r\n");
        sb.append("\r\n======================================================================\r\n");
        System.out.println(sb.toString());
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
