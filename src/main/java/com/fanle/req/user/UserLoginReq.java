package com.fanle.req.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Date: 2024/4/25 - 下午1:56
 * @author: mafanle
 */
@Data
public class UserLoginReq {

    @NotBlank(message = "【username】不能为空")
    private String username;

    @NotBlank(message = "【password】不能为空")
    private String password;
}
