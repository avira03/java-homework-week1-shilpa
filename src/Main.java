import javaprogram.*;

public class Main {
    public static void main(String[] args) {
// biodata
        biodata b = new biodata();
        b.printbiodata();
// sum 2 numbers
        sum s = new sum();
        s.add();

// divide 2 numbers
        divide d = new divide();
        d.divide();

// multiply
        multiply m = new multiply();
        float mult = m.multiply(20,2);
        System.out.println("multiply: ");
        System.out.println(mult);

        // mix operations

        operations o = new operations();
        o.mixoperations();

        // face
        face f = new face();
        f.face();

        // triangle
        triangle t = new triangle();
        t.triangle();

        // triangle2
        secondtriangle t2 = new secondtriangle();
        t2.triangle();

        // JDE
        dje j = new dje();
        j.dje();
    }


}