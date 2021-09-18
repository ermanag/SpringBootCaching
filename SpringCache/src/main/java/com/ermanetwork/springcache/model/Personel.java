package com.ermanetwork.springcache.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personel {

    private Integer personelId;
    private String personelName;
    private String personelSurname;
    private Integer personelIdentityNumber;
    private String personelEmail;

    public Personel(Integer personelId, String personelName, String personelSurname, Integer personelIdentityNumber, String personelEmail) {
        this.personelId = personelId;
        this.personelName = personelName;
        this.personelSurname = personelSurname;
        this.personelIdentityNumber = personelIdentityNumber;
        this.personelEmail = personelEmail;
    }
}
