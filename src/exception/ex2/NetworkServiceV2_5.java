package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            //NetworkClientExceptionV2이 아닌 다른 예외가 발생해도 실행된다. finally 가 실행되고 난 이후에 다른 예외가 발생한다.
            client.disconnect();
        }
    }
}
