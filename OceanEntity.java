package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ocean")
@Data
@AllArgsConstructor
public class OceanEntity {

        @Id
        @Column(name="id")
        private int id;
        @Column(name="name")
        private String name;
        @Column(name="deapth")
        private int deapth;
        @Column(name="threats")
        private String threats;
        @Column(name="country")
        private String country;
}
