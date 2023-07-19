package com.pavan.chess.model;

import com.pavan.chess.model.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel {

    private String name;
    private String email;

    public User(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }
}
