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

public class NameException extends Exception {
    static final String MSG = "Im sorry your name is invalid";

    public NameException() {
        super(MSG);
    }

    public NameException(String MSG) {
        super(MSG);
    }

    public NameException(String MSG, Throwable cause) {
        super(MSG, cause);
    }

    public NameException(Throwable cause) {
        super(MSG, cause);
    }



}