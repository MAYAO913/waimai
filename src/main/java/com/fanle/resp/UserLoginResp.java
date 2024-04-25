package com.fanle.resp;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Date: 2024/4/25 - 下午3:11
 * @author: mafanle
 */
@Data
public class UserLoginResp {

    private String username;

    private String phone;

    private String email;

    private String firstname;

    private String lastname;

    private String token;
}
