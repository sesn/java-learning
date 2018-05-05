class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp = 0;
        int endNumber = 40;
        while( b < endNumber) {
            if(a == 0) {
                System.out.println(a);
            }
            System.out.println(b);
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}