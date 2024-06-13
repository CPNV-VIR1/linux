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
    curl -i -X DELETE localhost:8080/bottles/2
    */
    @DeleteMapping("/bottles/{id}")
    void deleteBottle(@PathVariable Long id){
        repository.deleteById(id);
    }
}
