
package third;
import java.util.Scanner;

public class third {
    public final static String str="Массив:";
    public final static String maximum="Максимальное:";
    public final static int size=15;
    public static void main(String args[]) {
        int a=0,b=100;
        int [] arrayFinal=new int[size];
        arrayFinal[0]= a+(int)(Math.random()*b);
        int max=arrayFinal[0];
        System.out.println(str);
        System.out.print(arrayFinal[0]);
        for(int i=1;i<size;i++){
            arrayFinal[i]= a+(int)(Math.random()*b);
            System.out.print(",");
            System.out.print(arrayFinal[i]);
            if(arrayFinal[i]>max){
                max=arrayFinal[i];
            }
        }
        System.out.println(";");
        System.out.print(maximum+max);
    }
}
