package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.DAO;
import web.models.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private final DAO dao;

    public CarServiceImpl(DAO dao) {
        this.dao = new CarDAO();
    }
    @Override
    public List<Car> getCars(int count) {
        return dao.getCars(count);
    }
}
