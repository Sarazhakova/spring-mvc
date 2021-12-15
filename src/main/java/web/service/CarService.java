package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    public static List<Car> getCar(List<Car> cars, int count) {
        if(count >= 5){
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
