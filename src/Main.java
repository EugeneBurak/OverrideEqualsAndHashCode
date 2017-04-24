public class Main {

    public static void main(String[] args) {
	// write your code here
        OverrideEqualsAndHashCode over1 = new OverrideEqualsAndHashCode(2147483647, "Qwer");
        OverrideEqualsAndHashCode over2 = new OverrideEqualsAndHashCode(2147483647, "Qwer");

        System.out.println(over1.equals(over2));    //true
        System.out.println(over1.hashCode() == over2.hashCode());   //true
    }
}
