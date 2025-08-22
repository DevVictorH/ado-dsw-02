package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "<h2>Create Car</h2>" +
                "<label>Car Name</label>" +
                "<input type=\"text\" name=\"car-name\" id=\"car-name\">" +
                "<button type=\"submit\">Register</button>";
    }

    @GetMapping("/car")
    public ResponseEntity<Car> home(){
        Car car = new Car();
        car.setName("nivus");
        car.setColor("preto");

        return ResponseEntity.ok(car);
    }

}
