package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Camaro", 2018));
        cars.add(new Car("BMW", "M5", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count > 0 ? count : cars.size())
                .collect(Collectors.toList());
    }
}