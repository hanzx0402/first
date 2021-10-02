package com.han.moder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String address;
    private String phone;
}
