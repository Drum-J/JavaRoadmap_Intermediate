package exception.ex4.exception;

public class SendExceptionV2 extends NetworkClientExceptionV4 {

    private final String sendData;

    public SendExceptionV2(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
