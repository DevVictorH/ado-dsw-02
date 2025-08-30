package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @PostMapping("/car")
    public ResponseEntity<Car> home(@ModelAttribute Car car){
        return ResponseEntity.ok(car);
    }

}
