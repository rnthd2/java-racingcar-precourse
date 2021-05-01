import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName(value = "자동차 일급 컬렉션 테스트")
class CarsTest {
    Cars cars;
    Car car;

    final String CAR_NAME = "바나나차";
    final String CARS_NAMES = "바나나차차,딸기차차,토마토차차,바나나차차차";
    final int CARS_SIZE = 3;

    @BeforeEach
    void setup(){
        cars = new Cars();
        car = Car.createCar(CAR_NAME);
    }

    @Test
    void addCar() {
        cars.addCar(car);
        assertTrue(cars.hasCar(car));
    }

    @Test
    void getCar(){
        cars.addCar(this.car);
        Car car = cars.getCar(CAR_NAME);
        assertTrue(car.matchName(CAR_NAME));
    }

    @Test
    void setCarsByNames(){
        List<String> nameArrays = Arrays.asList(CARS_NAMES.split(","));
        cars.setCarsByNames(nameArrays);
        long count = nameArrays.stream()
                .map(name -> Car.createCar(name))
                .filter(car -> !cars.hasCar(car))
                .count();
        assertTrue(count == CARS_SIZE);
    }

    @Test
    void getWinningCar(){
        Car car1 = Car.createCar("바나나차차");
        Car car2 = Car.createCar("딸기차차");
        Car car3 = Car.createCar("토마토차차");

        car1.run();
        car2.run();
        car3.stop();

        car1.run();
        car2.run();
        car3.stop();

        cars.addCar(car1);
        cars.addCar(car2);
        cars.addCar(car3);

        List<Car> winningCar = cars.getWinningCar(2);
        assertTrue(winningCar.contains(car2));
        assertTrue(winningCar.contains(car1));
    }




}