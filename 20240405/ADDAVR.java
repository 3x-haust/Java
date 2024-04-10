import java.util.Scanner;

public class ADDAVR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(String.format("세 수의 합은 %d 입니다 \n세 수의 평균은 %d 입니다", a+b+c, (a+b+c)/3));
    }
}