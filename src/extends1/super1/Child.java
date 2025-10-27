package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value); //this 생략 가능 (this는 내 클래스(Child)에서 찾는 것)
        System.out.println("super value = " + super.value); //(super은 부모 클래스(Parent)에서 찾는 것)

        this.hello(); //this 생략 가능
        super.hello();
    }


}
