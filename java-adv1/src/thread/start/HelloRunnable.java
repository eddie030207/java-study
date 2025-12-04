package thread.start;

public class HelloRunnable implements Runnable {
    // Runnable 인터페이스를 구현하는 방식 사용 : 스레드와 실행할 작업을 명확히 분리하고, 인터페이스를 사용하므로 Thread 클래스를 extend 하는
    // 방식보다 더 유연하고 유지 보수하기 용이한 코드를 만들 수 있다.

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
