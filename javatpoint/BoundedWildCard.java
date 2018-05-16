// Two Dimensional coordinates
class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

// Three dimensional coordinates
class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}


class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

class BoundedWildCard {
    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates");
        for(int i=0; i< c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }


    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates");
        for(int i=0;i<c.coords.length;i++) 
            System.err.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z );

        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates");
        for(int i=0;i<c.coords.length;i++) 
            System.err.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " "+ c.coords[i].t );

        System.out.println();
    }

    public static void main(String[] args) {

        TwoD td[] = {
            new TwoD(0,0),
            new TwoD(7, 4)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        showXY(tdlocs);

        FourD fd[] = {
            new FourD(1, 2, 3, 4),
            new FourD(22, 5, 5, 6)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }

}