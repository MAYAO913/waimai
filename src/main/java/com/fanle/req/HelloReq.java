package com.fanle.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2024/4/25 - 上午11:51
 * @author: mafanle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloReq {

    @NotBlank(message = "username不能为空")
    private String username;
}
