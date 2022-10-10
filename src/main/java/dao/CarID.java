package dao;
import model.Car;
import java.util.UUID;

public interface CarID {
    int insertCarID(UUID id, Car car);

    default int insertCarID(Car car){
        UUID id = UUID.randomUUID();
        return insertCarID(id, car);
    }


}
