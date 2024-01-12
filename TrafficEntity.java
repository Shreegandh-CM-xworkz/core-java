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
@Table(name="traffic")
public class TrafficEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="vehicle_type")
    private String vehicle_type;
    @Column(name="speed")
    private int speed;
    @Column(name="location")
    private String location;
    @Column(name="type")
    private String type;

}
