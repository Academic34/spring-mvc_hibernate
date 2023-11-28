package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao cars;

    @Override
    public List<Car> getCars(int quantity) {
        return cars.getCars(quantity);
    }
}
