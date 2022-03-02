public class Test {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        singletonA.setValue(5);
        System.out.println("singletonA.getValue() = " + singletonA.getValue());
        System.out.println("singletonA = " + singletonA.toString());

        Singleton singletonB = Singleton.getInstance();
        System.out.println("singletonB.getValue() = " + singletonB.getValue());
        System.out.println("singletonB = " + singletonB.toString());

    }
}
