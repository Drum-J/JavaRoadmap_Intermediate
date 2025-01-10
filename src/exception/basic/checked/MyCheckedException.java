package exception.basic.checked;

/**
 * Exception을 상속받은 예외틑 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
