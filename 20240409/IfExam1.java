import java.util.Scanner;

public class IfExam1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //int a = 10;
        int a = sc.nextInt();

        if(a <= 0) System.out.println("음수와 0은 계산되지 않습니다");

        else 
            if(a % 2 == 0) System.out.println(a + "은(는) 짝수입니다.");
            else System.out.println(a + "은(는) 홀수 입니다.");
    }
}