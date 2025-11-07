package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";


        // try-with-resources 구문은 try 블럭이 끝나면 자동으로 AutoClosable.close()를 호출해서 자원을 해제한다.
        try (NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);

        } catch (Exception e){
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
