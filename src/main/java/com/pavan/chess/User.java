package com.pavan.chess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class User extends  BaseModel {

    private  String name ;
    private  String email ;

    public User(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }
}
