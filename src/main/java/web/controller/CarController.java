package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String Cars(@RequestParam(value = "count", required = false, defaultValue = "5")int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", "Black", 2019));
        cars.add(new Car("Mercedes", "White", 2015));
        cars.add(new Car("BMW", "Grey", 2018));
        cars.add(new Car("Mercedes", "Blue", 2013));
        cars.add(new Car("Porsche", "Grean", 2020));
        model.addAttribute("cars", CarService.getCar(cars, count));
        return "cars";
    }
}
