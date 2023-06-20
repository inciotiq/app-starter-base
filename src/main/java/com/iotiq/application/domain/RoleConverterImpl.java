package com.iotiq.application.domain;

import com.iotiq.user.domain.authorities.Role;
import com.iotiq.user.domain.authorities.RoleConverter;
import org.springframework.stereotype.Component;

@Component("application-role-converter")
public class RoleConverterImpl implements RoleConverter {
    @Override
    public Role convert(String role) {
        return switch (role) {
            case "SUPER_ADMIN" -> com.iotiq.application.domain.Role.SUPER_ADMIN;
            case "CURATOR" -> com.iotiq.application.domain.Role.CURATOR;
            case "VISITOR" -> com.iotiq.application.domain.Role.VISITOR;
            default -> null;
        };
    }
}
