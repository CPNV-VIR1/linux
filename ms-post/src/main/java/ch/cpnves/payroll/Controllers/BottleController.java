package ch.cpnves.payroll.Controllers;

import ch.cpnves.payroll.Repositories.BottleRepository;
import ch.cpnves.payroll.Entities.Bottle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BottleController {

    private final BottleRepository repository;

    BottleController(BottleRepository repository){
        this.repository = repository;
    }

    /* curl sample :
    curl -i -X POST localhost:8080/bottles ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Russel George\"}"
    */
    @PostMapping("/bottles")
    Bottle newBottle(@RequestBody Bottle newBottle){
        return repository.save(newBottle);
    }
}
