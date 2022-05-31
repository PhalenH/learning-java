public class Main {

    public static void main(String[] args) {

        Student bob = new Student("Bob", "BobBob", 2022, 3.8, "Coding");
        Student Jon = new Student("Jon", "Chief", 2023, 4.0, "Deals");

        System.out.println(Jon);
        System.out.println(bob.gpa);

        Jon.fifthYear();
        System.out.println(Jon.graduation);


    }

}
