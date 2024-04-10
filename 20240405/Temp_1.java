import java.util.Scanner;
public class Temp_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        System.out.println(String.format("섭씨: %d ==> 화씨: %d", temp, (temp * 9/5) + 32));
    }
}