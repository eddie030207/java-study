package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        //return param instanceof T; // 컴파일이 끝나고 런타임 시점에 param instanceOf Object 가 되어 항상 참을 반환하므로 오류가 난다.
        return false;
    }

    public void create() {
        //return new T(); //역시 항상 new Object()가 되어버려 허용하지 않는다.
    }
}
