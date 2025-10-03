public class Test {
    public static void main(String[] args) {

        //Programm um mit einem Array rechteckige Ausgabe an Zahlen durchzuführen
        int[][] x = {{1},{1,2},{1,2,3}};

        for(int[] i: x){
            for(int j: i){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}