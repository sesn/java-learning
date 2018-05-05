class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class Bike7 extends A {
    Bike7() {
        super();
        System.out.println("child class constrcutor invoked");
    }

    Bike7(int a) {
        super();
        System.out.println("child class constructor invoked"+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]) {
        Bike7 b1 = new Bike7();
        Bike7 b2 = new Bike7(10);
    }
}