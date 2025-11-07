package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가
        
        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " +  e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            // finally 안의 코드는 catch에서 잡지 못한 예기치 못한 예외가 터져도 반드시 실행된다.
            client.disconnect();
        }
    }
}
