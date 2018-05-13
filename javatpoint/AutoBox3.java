// Autoboxing /unboxing a Boolean and Character

class AutoBox3 {
    public static void main(String[] args) {

        // Autobox/unbox a boolean
        Boolean b = true;

        if(b) System.out.println("b is true");

        Character ch = 'x';  // box a char
        char ch2 = ch; // unbox a char

        System.out.println("ch2 is " + ch2);

    }
}