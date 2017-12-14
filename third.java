
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
        System.out.println(str);
        System.out.print(arrayFinal[0]);
        for(int i=1;i<size;i++){
            arrayFinal[i]= a+(int)(Math.random()*b);
            System.out.print(","+arrayFinal[i]);
        }
        System.out.println(";");
        int max=arrayFinal[0];
        for(int i:arrayFinal){
            if(i>max){
                max=i;
            }
        }
        System.out.print(maximum+max);
    }
}
