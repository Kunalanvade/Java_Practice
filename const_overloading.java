public class const_overloading {

    int a = 0;
    int b = 0;
    double c = 0;

    const_overloading() {
        a = 20;
        b = 10;
        c = 2.33;

    }

    const_overloading(int x, int y) {
        a = x;
        b = y;
    }

    const_overloading(int x, int y, double z) {
        a = x;
        b = y;
        c = z;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        const_overloading obj = new const_overloading();
        obj.display();
        const_overloading obj1 = new const_overloading(1,2);
        obj1.display();
        const_overloading obj2 = new const_overloading(1,2,3.2);
        obj2.display();
        const_overloading obj3 = new const_overloading(1,2,45.4);
        obj3.display();
    }
}
