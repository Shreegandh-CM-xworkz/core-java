package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="festival")
@Data
@AllArgsConstructor
public class FestivalEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="religion")
    private String religion;
    @Column(name="date")
    private String date;
    @Column(name="duration")
    private int duration;
}
