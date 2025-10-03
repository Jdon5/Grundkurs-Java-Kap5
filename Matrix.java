public class Matrix {
    public static void main(String[] args) {
        //20x20 Matrix
        int[][] intArr = new int[20][20];

        //Programm um jedes Element mit dem Produkt seiner Indizes zu belegen
        for(int i=1;i<intArr.length;i++){
            for(int j=1;j<intArr[i].length;j++){
                intArr[i][j] = i*j;
            }
        }

        //Ausgabe des 2D-Arrays mittels der for-each-Schleife
        for(int[] i: intArr){
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
