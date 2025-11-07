package exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);

        } finally {
            // finally 안의 코드는 catch에서 잡지 못한 예기치 못한 예외가 터져도 반드시 실행된다.
            client.disconnect();
        }
    }
}
