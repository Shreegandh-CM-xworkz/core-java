package com.xworks.january.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="film")
@AllArgsConstructor
public class FilmEntity {
    @Id
    @Column(name="film_id")
    private int id;
    @Column(name="film_name")
    private String name;
    @Column(name="film_hero")
    private String hero;
    @Column(name="film_producer")
    private String producer;
    @Column(name="release_date")
    private String releaseDate;
}
