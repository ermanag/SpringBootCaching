package com.ermanetwork.springcache.controller;

import com.ermanetwork.springcache.model.Personel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonelController {

    @RequestMapping("/getPersonelInformations")
    @Cacheable(value = "getCachePersonel")
    public List<Personel> getPersonelInformations(){

        List<Personel> personelList = Arrays.asList(new Personel(1, "TESTUSER1","TESTUSER1",1111111111,"TESTUSER@TEST.COM"),
                new Personel(2, "TESTUSER2","TESTUSER2",222222222,"TESTUSER2@TEST.COM"),
                new Personel(3, "TESTUSER3","TESTUSER3",333333331,"TESTUSER3@TEST.COM"));

        return personelList;
    }
}
