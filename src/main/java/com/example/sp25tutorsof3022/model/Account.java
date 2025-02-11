package com.example.sp25tutorsof3022.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Account {

    @NotBlank(message = "Email khong duoc de trong")
    private String email;

    @NotBlank(message = "Password khong duoc de trong")
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
