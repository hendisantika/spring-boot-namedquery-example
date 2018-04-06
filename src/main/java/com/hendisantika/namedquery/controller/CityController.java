package com.hendisantika.namedquery.controller;

import com.hendisantika.namedquery.domain.City;
import com.hendisantika.namedquery.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-namedquery-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/04/18
 * Time: 07.08
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/showCitiesOrderedByNameDescending")
    public String findAllOrderedByNameDescending(Model model) {

        List<City> cities = cityService.findAllOrderedByNameDescending();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}
