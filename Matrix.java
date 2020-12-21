public class Matrix {
    private int M = 0;
    private int N = 0;
    private int Arr[][];

    Matrix(int m, int n){
        M = m;
        N = n;
        Arr = new int[M][N];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                Arr[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void print(){
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%-4s", Arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void add(Matrix B){
        if(M == B.M && N == B.N) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    Arr[i][j] += B.Arr[i][j];
                }
            }
        }
        else
            System.out.println("Матрицы должно быть одинакого размера!!!");
    }

    public Matrix add_new(Matrix B){
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C.Arr[i][j] =  0;
            }
        }
        if(M == B.M && N == B.N) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    C.Arr[i][j] =  Arr[i][j] + B.Arr[i][j];
                }
            }
        }
        else {
            System.out.println("Матрицы должно быть одинакого размера!!!");
        }
        return C;
    }

    public static void add(Matrix A, Matrix B){
        if(A.M == B.M && A.N == B.N) {
            for (int i = 0; i < A.M; i++) {
                for (int j = 0; j < A.N; j++) {
                    A.Arr[i][j] += B.Arr[i][j];
                }
            }
        }
        else
            System.out.println("Матрицы должно быть одинакого размера!!!");
    }

    public static Matrix add_new(Matrix A, Matrix B){
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < A.M; i++) {
            for (int j = 0; j < A.N; j++) {
                C.Arr[i][j] =  0;
            }
        }
        if(A.M == B.M && A.N == B.N) {
            for (int i = 0; i < A.M; i++) {
                for (int j = 0; j < A.N; j++) {
                    C.Arr[i][j] =  A.Arr[i][j] + B.Arr[i][j];
                }
            }
        }
        else {
            System.out.println("Матрицы должно быть одинакого размера!!!");
        }
        return C;
    }

    private static int sum_mlt(Matrix A, int m, Matrix B, int n){ // возвращает сумму произведений соответствующих элементов данной строки и столбца
        int sum = 0;
            for (int i = 0; i < A.N; i++) {
                sum += A.Arr[m][i] * B.Arr[i][n];
            }
        return sum;
    }

    public Matrix mlt(Matrix B){
        Matrix C = new Matrix(M, B.N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < B.N; j++) {
                C.Arr[i][j] =  0;
            }
        }

        if(N == B.M){
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < B.N; j++) {
                    C.Arr[i][j] = Matrix.sum_mlt(this, i, B, j);
                }
            }
        }
        else {
            System.out.println("Число столбцов первой матрицы не равняется числу строк второй матрицы!!!");
        }
        return C;
    }

    public static Matrix mlt(Matrix A, Matrix B){
        Matrix C = new Matrix(A.M, B.N);
        for (int i = 0; i < A.M; i++) {
            for (int j = 0; j < B.N; j++) {
                C.Arr[i][j] =  0;
            }
        }

        if(A.N == B.M){
            for (int i = 0; i < A.M; i++) {
                for (int j = 0; j < B.N; j++) {
                    C.Arr[i][j] = Matrix.sum_mlt(A, i, B, j);
                }
            }
        }
        else {
            System.out.println("Число столбцов первой матрицы не равняется числу строк второй матрицы!!!");
        }
        return C;
    }
}
