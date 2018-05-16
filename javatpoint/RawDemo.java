class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}


class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<Float> fOb = new Gen<Float>(22.3F);
        Gen<String> sOb = new Gen<String>("Generics Test");

        // Creating a raw type Gen object and give it a double value
        Gen raw = new Gen(Double.valueOf(98.6));

        // cast here is necessary because type is unknown
        double d = (Double) raw.getob();

    }
}