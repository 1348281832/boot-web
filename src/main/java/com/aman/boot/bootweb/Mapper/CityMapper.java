package com.aman.boot.bootweb.Mapper;

import com.aman.boot.bootweb.Bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("select * from  City where  id=#{id}")
    public City getById(Long id);

    public Integer insertCity(City city);
}
