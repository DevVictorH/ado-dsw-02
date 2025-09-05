package br.com.carstore.controller;

import br.com.carstore.dto.CarDTO;
import br.com.carstore.model.Car;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @PostMapping("/car")
    public ResponseEntity<CarDTO> home(@Valid @ModelAttribute CarDTO car){
        return ResponseEntity.ok(car);
    }

}
