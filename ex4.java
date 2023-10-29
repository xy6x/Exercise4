import javax.print.attribute.standard.NumberUpSupported;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class ex4 {
    public static void main(String[] args) {
      ///1
        int [] arr ={50,-20,0,30,40,60,10};
        if(arr[0] == arr[6]){
            System.out.println(true);
        }else System.out.println(false);
        //2

        int [] ars ={100,3,25,7,17,4,1};
        int num =0;
        for (int n:ars
             ) {
            num +=n;

            }
        int tst =num/ars.length;

        for (int ts:ars
             ) {
            if (ts >= tst) {
                System.out.println("greater than the average: "+ts);

            }

        }
        System.out.println("The average of the said array is:"+tst);
      //3
        int[] max={20, 30, 40};
        System.out.println("Larger value between first and last element"+Arrays.stream(max).max());
       ////4
        int [] areas ={20, 30, 40};
        Arrays.sort(areas);
        for (int i = areas.length-1; i >=0 ; i--) {

            System.out.println(areas[i]);
             }
            ////5
            ArrayList nee = new ArrayList();
            int[] new_num = {2, 3, 40, 1, 5, 9, 4, 10, 7};
            for (int ne : new_num) {
                if (ne % 2 != 0) {
                    nee.add(ne);
                }

                nee.toString();

            }
            for (int ne : new_num) {
                if (ne % 2 == 0) {
                    nee.add(ne);
                }

                nee.toString();

            }


            System.out.println(nee.toString());


            ///6
            int[] first = {2, 3, 6, 6, 4};
            int[] second = {2, 3, 6, 6, 4};
            boolean tsst = Arrays.equals(first, second);
            System.out.println(tsst);




    }
}
