package com.pavan.chess.model;

import java.util.Date;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseModel {
    private long id ;

    Date createDate ;
    Date lastModified;

    public BaseModel(long id) {
        this.id = id;
    }
}
