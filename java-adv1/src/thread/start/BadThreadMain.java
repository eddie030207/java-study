package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        // main 스레드가 run() 메서드를 실행하는 것이 아니라, Thread-0 스레드가 run() 메서드를 실행한다.
        helloThread.run(); // run() 직접 실행

        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
