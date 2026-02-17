public class VariableScope {
    static int x = 3; // CLASS

    static void local() {
        int x = 1; // LOCAL

        IO.println(x);
        doSomething();
    }

    static void doSomething() {
        int x = 2; //LOCAL

        IO.println(x);
    }
}
