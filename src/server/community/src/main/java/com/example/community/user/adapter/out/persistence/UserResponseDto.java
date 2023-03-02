package com.example.community.user.adapter.out.persistence;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private int code;
    private String message;
    private String info;

    @Builder
    public UserResponseDto(int code, String message, String info) {
        this.code = code;
        this.message = message;
        this.info = info;
    }
}
