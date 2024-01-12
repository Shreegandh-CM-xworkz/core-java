package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
@Data
@AllArgsConstructor
public class SportsEntity {
    @Id
    @Column(name="sports_id")
    private int sports_id;
    @Column(name="type")
    private String type;
    @Column(name="name")
    private String name;
    @Column(name="no_players")
    private int no_players;
    @Column(name="result")
    private String result;
}
