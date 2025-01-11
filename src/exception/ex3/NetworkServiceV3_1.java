package exception.ex3;

import exception.ex3.exception.ConnectException;
import exception.ex3.exception.SendException;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendException e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally {
            //catch에서 처리한 예외가 아닌 다른 예외가 발생해도 실행된다. finally 가 실행되고 난 이후에 다른 예외가 발생한다.
            client.disconnect();
        }
    }
}
