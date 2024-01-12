package com.xworks.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resume")
@Data
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name="resume_id")
    private int resume_id;
    @Column(name="resume_type")
    private String resume_type;
    @Column(name="role")
    private int role;
    @Column(name="name")
    private String name;
    @Column(name="pages")
    private int pages;
}
