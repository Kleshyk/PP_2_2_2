package web.Service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarServiceImp implements CarService{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Lada", "Vesta", 2018));
        cars.add(new Car("Haval", "Dargo", 2022));
        cars.add(new Car("Chevrolet", "Captiva", 2015));
        cars.add(new Car("Cherry", "Tiggo ProMax", 2024));
    }

    @Override
    public List<Car> getAllCars(int count) {
        return IntStream.range(0, cars.size()).filter(i -> i < count)
                .mapToObj(cars::get)
                .toList();
    }
}
