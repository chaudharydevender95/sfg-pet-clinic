package com.dev.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class BaseEntity implements Serializable {
    private Long id;

//    @Override
//    public boolean equals(Object obj) {
//        return this.id = obj.;
//    }
}
