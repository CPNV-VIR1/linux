package ch.cpnves.payroll.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BottleNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(BottleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String bottleNotFoundHandler(BottleNotFoundException ex){
        return ex.getMessage();
    }
}
