package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="super_hero")
@Data
@AllArgsConstructor

public class SuperHeroEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="place")
    private String place;
    @Column(name="power")
    private String power;
    @Column(name="weekness")
    private String weekness;
}
