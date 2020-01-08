package com.evil.framework.registry;

/**
 * 服务注册表
 */
public interface ServiceRegistry {
    /**
     * 注册服务信息
     */
    void register(String serviceName, String serviceAddress);

}
