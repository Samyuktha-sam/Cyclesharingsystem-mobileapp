package com.example.otp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RegisterDto {
    private Long id;
    private String name;
    private String password;
    private String email;
}
