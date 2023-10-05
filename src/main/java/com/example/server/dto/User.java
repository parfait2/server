package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// server는 lombok을 쓰고 있기 때문에 client와 달리 어노테이션을 붙여서 쓸 수 있다.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int age;
}
