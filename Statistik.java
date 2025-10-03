public class Statistik {
    public static void main(String[] args) {
        int[] numArr = {4,3,5,10,12};
        int kleinsterWert = numArr[0];
        int groessterWert = numArr[0];
        double mittelwert = 0;

        // Programm zur Ermittlung des kleinsten Wertes eines int-Arrays
        for(int i=0;i<numArr.length;i++){
            if(kleinsterWert>numArr[i]){
                kleinsterWert= numArr[i];
            }
        }
        System.out.println("Kleinster Wert des Arrays: "+kleinsterWert);

        //Programm zur Ermittlung des größten Wertes eines int-Arrays
        for(int i=0;i<numArr.length;i++){
            if(groessterWert<numArr[i]){
                groessterWert=numArr[i];
            }
        }
        System.out.println("Größter Wert des Arrays: "+ groessterWert);

        //Programm zur Ermittlung des Mittelwerts eines Arrays
        for(int i=0;i<numArr.length;i++){
            mittelwert+=numArr[i];
        }
        System.out.println("Mittelwert: "+mittelwert/numArr.length);


    }
}