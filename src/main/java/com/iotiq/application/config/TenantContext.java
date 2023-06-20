package com.iotiq.application.config;

public class TenantContext {

    private TenantContext() {
    }

    private static final ThreadLocal<String> CURRENT_TENANT = new ThreadLocal<>();

    public static String getCurrentTenant() {
        return CURRENT_TENANT.get();
    }

    public static void setCurrentTenant(String tenant) {
        CURRENT_TENANT.set(tenant);
    }

    public static void removeCurrentTenant() {
        CURRENT_TENANT.remove();
    }
}