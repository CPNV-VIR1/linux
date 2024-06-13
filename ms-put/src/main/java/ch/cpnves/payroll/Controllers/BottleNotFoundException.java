package ch.cpnves.payroll.Controllers;

public class BottleNotFoundException extends RuntimeException{

    BottleNotFoundException(Long id){
        super("Could not find bottle " + id);
    }
}
