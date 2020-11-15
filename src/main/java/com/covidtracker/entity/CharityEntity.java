package com.covidtracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "charity")
public class CharityEntity extends BaseEntity {

    @NotNull(message = "cX cant be null")
    @Column(name = "cX")
    private String cX;

    @NotNull(message = "cY cant be null")
    @Column(name = "cY")
    private String cY;

    @NotNull(message = "Name cant be null")
    @Column(name = "cName", columnDefinition = "TEXT")
    private String name;

    @NotNull(message = "Address cant be null")
    @Column(name = "cAddress",columnDefinition = "TEXT")
    private String address;

    @NotNull(message = "Content cant be null")
    @Column(name = "cContent",columnDefinition = "TEXT")
    private String content;

    public String getcX() {
        return cX;
    }

    public void setcX(String cX) {
        this.cX = cX;
    }

    public String getcY() {
        return cY;
    }

    public void setcY(String cY) {
        this.cY = cY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
