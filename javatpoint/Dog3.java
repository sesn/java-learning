class Animal {}

class Dog3 extends Animal {
    static void method(Animal a) {
        if(a instanceof Dog3) {
            Dog3 d = (Dog3)a;
            System.out.println("ok downcasting performed");
        }
    }

    public static void main(String args[]) {
        Animal a = new Animal();
        Dog3.method(a);
    }
}