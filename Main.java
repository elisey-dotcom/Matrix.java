public class Main {
    public static void main(String[] args) {

    Matrix a = new Matrix(4,3);
    a.print();
    Matrix b = new Matrix(3,2);
    b.print();

    a.add(b);
//    Matrix.add(a, b);
    a.print();

//    Matrix c = a.add_new(b);
//    Matrix c = Matrix.add_new(a,b);
//    c.print();

//    Matrix c = a.mlt(b);
//    Matrix c = Matrix.mlt(a, b);
//    c.print();

    }
}
