package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name="transport")
public class TransportEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="type")
    private String type;
    @Column(name="vehicle")
    private String vehicle;
    @Column(name="cost")
    private int cost;
    @Column(name="e_d_t_inHrs")
    private int e_d_t_inHrs;
}
