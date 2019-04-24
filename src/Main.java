public class Main {

    public static void main(String[] args) {

        System.out.println("NWD to " + NWD(12,15));

        int liczby[] = new int[]{1,2,3,4,5,6};

        System.out.println("suma liczb to: " + sumaEl(liczby));

        wiecej(liczby,100);

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }

    }

    public static int NWD (int x, int y){

        while (x != y){
            if (x > y)
                x = x - y;
            else y = y - x;
        }
        return x;
    }

    public static int sumaEl(int[] tablica){

        int suma = 0;

        for (int i = 0; i < tablica.length; i++)
           suma += tablica[i];

        return suma;
    }


    public static int[] wiecej(int[] tablica, int zwiekszO){

        int suma = 0;

        for (int i = 0; i < tablica.length; i++)
//            suma += tablica[i];
            tablica[i] += zwiekszO;

        return tablica;
    }
}
