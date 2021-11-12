package com.aman.boot.bootweb.Service;

import com.aman.boot.bootweb.Bean.City;
import com.aman.boot.bootweb.Mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper citymapper;

    public City getById(long id)
    {
        return citymapper.getById(id);
    }

    public Integer insertCity(City city)
    {
        return citymapper.insertCity(city);
    }
}
