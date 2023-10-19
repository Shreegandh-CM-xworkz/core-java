package com.me.playstore.application;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Application {


    private int id;
    private String appName;
    private double sizeInMb;
    private String version;
    private  String companyName;
    private String appType;
    private String releaseDate;
}