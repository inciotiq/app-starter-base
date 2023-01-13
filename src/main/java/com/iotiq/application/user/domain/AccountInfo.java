package com.iotiq.application.user.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AccountInfo implements Serializable {
    String username;
}
