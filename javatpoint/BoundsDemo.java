class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all class
    double average() {
        double sum = 0.0;
        for(int i=0;i < nums.length;i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }


}

class BoundsDemo {

    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average: " + v);

        Double dnums[] = {1.0,2.2,3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average: " + w);
    }
}