package com.catcher92.demo.framework.bean;

import java.io.Serializable;

/**
 * Created by caoxuedong on 2017/2/8.
 */

public class BaseEntity implements Serializable{

    private static final long serialVersionUID = 1785129440414617042L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
