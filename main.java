import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Filip on 2016-12-23.
 */
public class main {

    static int[] last3 = new int[3];
    static int ordning = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getNext(scan.nextInt());
    }
    public static boolean contains(int[] arr, int targetValue) {
        for(int i: arr){
            if(i == targetValue) {
                return true;
            }
        }
        return false;
    }
    static void getNext(int tal) {
        if(contains(last3, 1) && contains(last3, 2) && contains(last3, 4)) {
            System.out.println("End.");
            main(null);
        }
        if(ordning >= 2) {
            ordning = 0;
        } else {
            ordning++;
        }
        if((tal % 2) == 0) {
        System.out.println(tal/2);
            last3[ordning] = tal/2;
            getNext(tal/2);
        } else {
            System.out.println(tal*3+1);
            getNext(tal*3+1);
            last3[ordning] = tal*3+1;
        }
    }
}
