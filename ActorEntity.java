package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor")
@Data
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name="real_name")
    private String realName;

    @Column(name="fictional_name")
    private String FictionalName;

    @Column(name="strength")
    private String strength;

    @Column(name="weekness")
    private String weekness;



}
