package com.niladri.todo.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}