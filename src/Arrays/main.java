package Arrays;

public class main {
    public static void main(String[] args) {
        //task 1
        int[]intArray =  {1,2,3,4,5,6,7,8,9};
        for (int i : intArray){
            System.out.print(i + " ");//foreach
        }
        System.out.println();
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " A "); //standard loop
        }
        System.out.println();
        //task 2
        int sum = 0;
        for (int i : intArray){
            sum+=i;
        }
        System.out.println(sum);
        //Task 3
        String [] names = { "Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        for (int i  = 0; i < names.length; i+=2 ){
            System.out.println(names[i] +" "+ names[i + 1]);
        }
        //task 4
        int []backwards =  { 45, 34, 5, 8, 10, 2, 13, 25}; //25,13,2,10,8,5,34,45
        for (int i = backwards.length-1; i > 0; i--){
            System.out.print(backwards[i] + " ");
        }
        System.out.println();
        //task 5
        int biggest = backwards[0];
        int smallest = backwards[0];
        for (int i = 0; i<backwards.length; i++){
            if (biggest < backwards[i]) biggest = backwards[i];
            if (smallest > backwards[i]) smallest = backwards[i];
        }
        System.out.println("biggest: " + biggest + "\n" + "smallest: "  + smallest);

        //task 6
        //Note that this might not be the most pratical, but i was to lazy to write 2 new arrays
        boolean same = true; //backwards and intarray
        int numerofsimulars = 0;
        if (backwards.length != intArray.length) {
            same =false;
        } else {
            for (int i = 0; i < backwards.length - 1; i++) {
                for (int j = 0; j < intArray.length - 1; i++) {
                    if (intArray[i] == backwards[j]) numerofsimulars++;
                }
            }
            if (numerofsimulars != backwards.length) same = false;

        }
        System.out.println("is the array the same? " + same);

        //task 7
        int a[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i =0; i < a.length; i++){
            if(i % 2 == 0) System.out.println("even " + i);
            else System.out.println("odd " + i);
        }
    }
}
