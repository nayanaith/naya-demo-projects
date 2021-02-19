package com.naya.customer_crud.error_response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

abstract class ApiSubError{

}

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError{
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ApiValidationError(String object, String message){
        this.object = object;
        this.message = message;
    }
}
