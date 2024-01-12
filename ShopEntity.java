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
@Table(name="shop")
public class ShopEntity {
    @Id
    @Column(name="shop_id")
    private int shop_id;
    @Column(name="shop_name")
    private String shop_name;
    @Column(name="shop_type")
    private String shop_type;
    @Column(name="roi")
    private int roi;
    @Column(name="employees")
    private int employees;
}
