package second;
import java.util.Arrays;
import java.util.Scanner;

public class second {

    public static final String error_msg="Введите размер массива > 3";
    public static void main(String[] args){
        int n=0,a=0,array_two_size=0,current=0;
        String str="";
        Scanner in= new Scanner(System.in);
        while(n<=3){
            System.out.println(error_msg);
            str=in.next();
            if(str.matches("[-+]?\\d+")){
                n=Integer.parseInt(str);
            }
        }
        int[] array_one= new int [n];
        for(int i=0;i<n;i++){
            array_one[i]=a+(int)(Math.random()*n);
            if(array_one[i]%2==0&&array_one[i]!=0){
                array_two_size++;
            }
            if(i!=n&&i!=0)
                System.out.print(",");
            System.out.print(array_one[i]);
        }
        System.out.println(';');
        int[]array_two=new int[array_two_size];
        for(int i=0;i<n;i++){
            if(array_one[i]%2==0&&array_one[i]!=0){
                array_two[current]=array_one[i];
                System.out.print(array_two[current++]);
                if(current!=array_two_size){
                    System.out.print(",");
                }
            }
        }
        System.out.println(";");
    }
}
