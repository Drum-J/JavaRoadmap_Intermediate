package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            // 없어도 상관은 없다.
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
        /*
        finally {
            client.disconnect(); //여기서는 client 를 접근할 수 없다.
        }
        */
    }
}
