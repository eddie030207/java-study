package thread.sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV6 implements BankAccount {
    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccountV6(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        try {
            // 대기 시간인 0.5초 동안 락을 획득하지 못하면 false를 반환한다.
            if (!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                // if 안에 있는 문장이 !false, 즉 true가 되므로 아래 로직을 수행한다.
                log("[진입 실패] 이미 처리 중인 작업이 있습니다.");
                // false를 반환하고 메서드를 종료한다.
                return false;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }

            // 잔고가 출금액보다 많으면, 진행
            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000); // 출금에 걸리는 시간으로 가정
            balance -= amount;

            log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);


        } finally {
            lock.unlock(); // ReentrantLock 이용하여 락 해제
        }

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        lock.lock(); // ReentrantLock 이용하여 락 걸기
        try {
            return balance;
        } finally {
            lock.unlock(); // ReentrantLock 이용하여 락 해제
        }
    }
}
