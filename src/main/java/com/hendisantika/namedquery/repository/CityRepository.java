package com.hendisantika.namedquery.repository;

import com.hendisantika.namedquery.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-namedquery-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/04/18
 * Time: 07.06
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    List<City> findAllOrderedByNameDescending();
}