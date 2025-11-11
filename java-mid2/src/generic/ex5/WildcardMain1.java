package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("냐옹이", 200));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        // 제너릭 메서드는 넣은 인자에 대한 반환값을 정확하게 받을 수 있다.
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        // 그에 비해 와일드카드를 사용한 일반적인 메서드는 <? extends 뒤에 오는 클래스(상한 제한을 걸어둔 클래스)으로만 반환 받는다.
        // 굳이 하위 클래스로 반환받으려면 반드시 다운 캐스팅이 필요하다.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        WildcardEx.printAndReturnWildcard(dogBox);
    }
}
