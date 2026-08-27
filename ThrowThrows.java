class ThrowThrows {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not eligible");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}