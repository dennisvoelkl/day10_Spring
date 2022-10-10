package service;

import dao.CarRepo;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepo carRepo;

    @Autowired
    public CarService(@Qualifier("fakeDAO") CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public int addCar(Car car){
        return carRepo.insertCarID(car);
    }
}
