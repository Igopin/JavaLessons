package lesson150331.linked_list.anonymous;

public class UseD {

    public static void main(String[] args) {
        String str = new String("DiMa NaUmEnKo LoShPeT!");

        D d1 = D.createNatural(str);
        D d2 = D.createUpper(str);
        D d3 = D.createLower(str);

        d1.doSomething();
        d2.doSomething();
        d3.doSomething();
    }
}
