import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerTest {

    Computer computer;
    Car car;
    final String CAR_NAME = "바나나차";

    @BeforeEach
    void setup(){
        computer = new Computer(new Cars());
        car = Car.createCar(CAR_NAME);
    }

    @Test
    void play() {
        computer.play();
        assertTrue(car.matchDistance(0) || car.matchDistance(1));
    }
}