import java.util.Scanner;

public class Time1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        int h = time / 3600;
        int m = time % 3600 / 60;
        int s = time % 3600 % 60;

        System.out.println(h + "h " + m + "m " + s + "s ");
    }
}