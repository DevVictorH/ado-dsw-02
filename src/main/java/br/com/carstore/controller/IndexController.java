package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "<h2>Create Car</h2>" +
                "<form action= '/car' method='post'>" +
                "<label>Car Name</label> <br>" +
                "<input type='text' name='name' id='car-name'>" +
                "<br> <br>"+
                "<label>Car Color</label> <br>" +
                "<input type='text' name='color' id='car-color'>" +
                "<br> <br>"+
                "<button type='submit'>Register</button>" +
                "</form>";
    }

    @PostMapping("/car")
    public ResponseEntity<Car> home(@ModelAttribute Car car){
        return ResponseEntity.ok(car);
    }

}
