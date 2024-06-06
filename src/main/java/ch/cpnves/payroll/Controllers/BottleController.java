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
    curl -i -X POST localhost:8080/bottles ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Russel George\"}"
    */
    @PostMapping("/bottles")
    Bottle newBottle(@RequestBody Bottle newBottle){
        return repository.save(newBottle);
    }

    /* curl sample :
    curl -i localhost:8080/bottles/1
    */
    @GetMapping("/bottles/{id}")
    Bottle one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new BottleNotFoundException(id));
    }

    /* curl sample :
    curl -i -X PUT localhost:8080/bottles/2 ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Samwise Bing\"}"
     */
    @PutMapping("/bottles/{id}")
    Bottle replaceBottle(@RequestBody Bottle newBottle, @PathVariable Long id) {
        return repository.findById(id)
                .map(bottle -> {
                    bottle.setName(newBottle.getName());
                    return repository.save(bottle);
                })
                .orElseGet(() -> {
                    newBottle.setId(id);
                    return repository.save(newBottle);
                });
    }

    /* curl sample :
    curl -i -X DELETE localhost:8080/bottles/2
    */
    @DeleteMapping("/bottles/{id}")
    void deleteBottle(@PathVariable Long id){
        repository.deleteById(id);
    }
}
