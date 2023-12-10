package com.multimodule.msa.api.user.request;

import com.multimodule.msa.model.Account;
import lombok.Getter;
import org.apache.catalina.User;

@Getter
public class UserRequest {

    private String userId;
    private String password;

    public Account toEntity(String userId, String password){
        return Account.builder()
                .userId(userId)
                .password(password)
                .build();

        }
}
