class NonGen {
    Object ob;

    NonGen(Object o) {
        o = ob;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is "+ob.getClass().getName());
    }
}

class NonGenDemo {
    
    public static void main(String args[]) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();
        // Get the value of iOb
        // This time, a cast is necessary.
        // int v = (Integer) iOb.getob();
        // System.out.println("value: "+v);

        System.out.println();

        // NonGen strOb = new NonGen("Non-Generics test");

        // strOb.showType();

        // String str = (String) strOb.getob();

        // System.out.println("value: "+str);

    }
}