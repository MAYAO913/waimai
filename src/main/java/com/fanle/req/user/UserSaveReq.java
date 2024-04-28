package com.fanle.req.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Date: 2024/4/25 - 下午1:50
 * @author: mafanle
 */
@Data
public class UserSaveReq {

    private Integer id;

    @NotBlank(message = "【username】不能为空")
    private String username;

    @NotBlank(message = "【password】不能为空")
    private String password;

    @NotBlank(message = "【phone】不能为空")
    private String phone;

    @NotBlank(message = "【email】不能为空")
    private String email;

    @NotBlank(message = "【firstname】不能为空")
    private String firstname;

    @NotBlank(message = "【lastname】不能为空")
    private String lastname;

    @NotBlank(message = "【role】不能为空")
    private String role;

    private String socialProvider;
}
