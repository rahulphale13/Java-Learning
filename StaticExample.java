class StaticExample {

    static int count = 0;

    StaticExample() {
        count++;
    }

    static void displayCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {

        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();
        StaticExample s3 = new StaticExample();

        StaticExample.displayCount();
    }
}