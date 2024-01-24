package com.xworks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="fertilizer")
@Data
@AllArgsConstructor
public class FertilizerEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="quantity")
    private int quantity;
    @Column(name="cost")
    private int cost;
    @Column(name="mfg_date")
    private LocalDate mfgDate;
    @Column(name="exp_date")
    private LocalDate expDate;


}
