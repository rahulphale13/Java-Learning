class MethodsExample {

    static void greet() {
        System.out.println("Hello, welcome to Java!");
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}