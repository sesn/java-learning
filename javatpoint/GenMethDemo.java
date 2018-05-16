class GenMethDemo {

    // Determine if an object is in an array
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[ ] y) {
        for(int i=0;i<y.length;i++)
            if(x.equals(y[i])) return true; 
        
        return false;
    }

    public static void main(String[] args) {
        // use isIn on Integers
        Integer nums[] = { 1,2,3,4,5,6,7};

        if(isIn(2, nums))
            System.out.println("2 is in nums");
        
        if(isIn(9, nums))
            System.out.println("9 is not in nums");

        String strs[] = {
            "one", "two", "three", "four", "fice"
        };

        if(isIn("one",strs))
            System.out.println("two is in strs");
        
        if(isIn("seven",strs))
            System.out.println("seven is in strs");
    }
}