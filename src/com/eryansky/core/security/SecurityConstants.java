package com.eryansky.core.security;

import com.eryansky.common.utils.io.PropertiesLoader;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 项目中用到的静态变量.
 * 
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2012-8-20 上午11:40:56
 */
public class SecurityConstants {
    /**
     * session 登录用户key
     */
    public static final String SESSION_SESSIONINFO = "sessionInfo";

    /**
     * session 未授权的URL
     */
    public static final String SESSION_UNAUTHORITY_URL = "UNAUTHORITY_URL";

    /**
     * 超级管理员
     */
    public static final String ROLE_SUPERADMIN = "超级管理员";

    /**
     * 在线用户列表.
     */
    public static final Map<String,SessionInfo> sessionInfoMap = new ConcurrentHashMap<String, SessionInfo>();

}
