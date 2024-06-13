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
    curl -i localhost:8080/bottles
    */
    @GetMapping("/bottles")
    List<Bottle> all(){
        return repository.findAll();
    }

    /* curl sample :
    curl -i localhost:8080/bottles/1
    */
    @GetMapping("/bottles/{id}")
    Bottle one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new BottleNotFoundException(id));
    }
}
