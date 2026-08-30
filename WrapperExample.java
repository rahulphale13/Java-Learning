class WrapperExample {

    public static void main(String[] args) {

        int num = 10;

        // Autoboxing: primitive → object
        Integer obj = num;

        // Unboxing: object → primitive
        int value = obj;

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper Object: " + obj);
        System.out.println("Unboxed Value: " + value);
    }
}