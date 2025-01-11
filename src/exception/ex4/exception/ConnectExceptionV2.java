package exception.ex4.exception;

public class ConnectExceptionV2 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptionV2(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
