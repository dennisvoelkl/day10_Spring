package dao;
import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDAO")
public class CarRepo implements CarID {
    private static List<Car> DB= new ArrayList<>();

    @Override
    public int insertCarID(UUID id, Car car) {
        DB.add(new Car(id, car.getManufacturName()));
        return 1;
    }
}



