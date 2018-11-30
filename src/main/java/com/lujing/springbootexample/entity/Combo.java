package com.lujing.springbootexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Author: luman
 * Date: 2018/11/30
 * Description: default description
 * Modify By: who am i
 */
@Entity
public class Combo {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    private Integer count;

    public Combo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
