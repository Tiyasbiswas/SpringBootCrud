package demo.testemsbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND) //setting status value to show the error message
public class ResouceNotFoundException extends RuntimeException{
//contructor
public ResouceNotFoundException(String message){
    super(message);
}


}
