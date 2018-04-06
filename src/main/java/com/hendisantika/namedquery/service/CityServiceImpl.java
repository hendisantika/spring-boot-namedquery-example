package com.hendisantika.namedquery.service;

import com.hendisantika.namedquery.domain.City;
import com.hendisantika.namedquery.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-namedquery-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/04/18
 * Time: 07.07
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAllOrderedByNameDescending() {

        List<City> cities = repository.findAllOrderedByNameDescending();
        return cities;
    }
}