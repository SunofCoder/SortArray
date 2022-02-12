import  java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i=0; i<array.length; i++){
            System.out.print((i+1)+"." + " Elemanı: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        System.out.println("Dizi: "+Arrays.toString(array));

    }

}

