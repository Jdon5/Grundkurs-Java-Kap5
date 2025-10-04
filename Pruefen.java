public class Pruefen {
    public static void main(String[] args) {
        //Programm zur Überprüfung de
        int[] A = {1,2,4};
        int[] B = {1,4,2};

        InsertionSort(A);
        InsertionSort(B);

        //Programm zum Überprüfen ob A = B ist ungeachtet dessen in welcher Reihenfolge sich die Elemente befinden
        int b=0;
        if(A.length == B.length){
            for(int i=0;i<A.length;i++){
                b = (A[i]==B[i])? b+1: b;
            }
            System.out.println(b==A.length);
        } else {
            System.out.println(false);;
        }

    }

    public static void InsertionSort(int[] A){
        //Sortieren des Arrays A mittels Sortieralgorithmus InsertionSort-Algor
        int key;
        for(int i=1;i<A.length;i++){
            key = A[i];
            int j = i-1;

            while(j>=0 && A[j] > key){
                A[j+1] =A[j];
                j--;
            }
            A[j+1] = key;
        }
    }

}
