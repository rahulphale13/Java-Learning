interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class InterfaceExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}