/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Adam
 */

public class EmptyOrNullException extends Exception {
    static final String MSG = "Im sorry your input can not be blank";

    public EmptyOrNullException() {
        super(MSG);
    }

    public EmptyOrNullException(String MSG) {
        super(MSG);
    }

    public EmptyOrNullException(String MSG, Throwable cause) {
        super(MSG, cause);
    }

    public EmptyOrNullException(Throwable cause) {
        super(MSG, cause);
    }



}