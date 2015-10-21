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
public class InputLessThanExpectedException extends Exception {
        static final String MSG = "Im sorry your input is too short";

    public InputLessThanExpectedException() {
        super(MSG);
    }

    public InputLessThanExpectedException(String MSG) {
        super(MSG);
    }

    public InputLessThanExpectedException(String MSG, Throwable cause) {
        super(MSG, cause);
    }

    public InputLessThanExpectedException(Throwable cause) {
        super(MSG, cause);
    }



}

