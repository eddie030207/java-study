package thread.bounded;

public interface BoundedQueue {
    // 버퍼에 데이터를 보관한다.
    void put(String data);

    // 버퍼에 보관된 값을 가져온다.
    String take();
}
