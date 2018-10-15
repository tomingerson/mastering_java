package session6.lecture;

/**
 * @author Created by tom on 14.10.2018.
 */
public class MyException extends Exception {

    void someMethod() {
        // CompilerError if uncommented
        //doStuff();
    }

    void doStuff() throws MyException {
        throw new MyException();
    }
}
