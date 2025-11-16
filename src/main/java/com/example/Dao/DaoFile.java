package com.example.Dao;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Profile("file")  // Ce bean sera actif uniquement avec le profil "file"
public class DaoFile implements IDao {
    @Override
    public double getValue() {
        return 180.0;
    }
}