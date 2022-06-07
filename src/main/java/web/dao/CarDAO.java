package web.dao;

import web.models.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO implements DAO {

    private final List<Car> carList;

    public CarDAO() {
        carList = List.of(
                new Car("Reno", 100, 2.0),
                new Car("Lada", 2108, 1.6),
                new Car("Kamaz", 2200, 6.0),
                new Car("Audi", 100, 2.2),
                new Car("Porsche", 911, 3.5));
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
