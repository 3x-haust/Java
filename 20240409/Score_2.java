import java.util.Scanner;
public class Score_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int korean = sc.nextInt();
        int math = sc.nextInt();
        int english = sc.nextInt();

        System.out.println(String.format("국어\t수학\t영어\t\n---------------------\n %d\t %d\t %d\n전체 = %d\n평균 = %d", korean, math, english, (korean + math + english), (korean + math + english) / 3));

    }
}