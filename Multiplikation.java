public class Multiplikation {
    public static void main(String[] args) {
        // Programm zum Durchführen einer Matrixmultiplikation

        int l = 2;
        int m = 2;
        int n = 2;
        double[][] A = new double[l][m];
        double[][] B = new double[m][n];

        // A mit Zahlen befühlt
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j] = j+1;
            }
        }

        //Ausgabe von A
        for (double[] i: A) {
            for(double j: i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println();

        //B mit Zahlen befühlt
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                B[i][j] = j+2;
            }
        }

        //Ausgabe von B mit Zahlen
        for (double[] i: B) {
            for(double j: i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        double[][] C = new double[l][n];

        for(int i=0;i<A.length;i++){
            for (int j=0;j<B[0].length;j++){
                C[i][j] =0;
                for(int k=0;k<B.length;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        System.out.println();

        for(double[] i: C){
            for(double j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
