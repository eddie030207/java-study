package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("Seoul");
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야 함
        memberB.getAddress().setValue("Busan");
        System.out.println("memberA = " + memberA); //A의 주소도 부산으로 바뀌어버리는 Side Effect 발생
        System.out.println("memberB = " + memberB);
    }
}
