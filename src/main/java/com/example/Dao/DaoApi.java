package com.example.Dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Profile("api")  // Ce bean sera actif uniquement avec le profil "api"
public class DaoApi implements IDao {
    @Override
    public double getValue() {
        return 220.0;
    }
}