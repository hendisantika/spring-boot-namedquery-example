package com.hendisantika.namedquery.service;

import com.hendisantika.namedquery.domain.City;

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
public interface CityService {
    List<City> findAllOrderedByNameDescending();
}
