import java.util.Scanner;

public class Birth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birthDate = scanner.nextInt();

        int year = birthDate / 10000;
        int month = (birthDate % 10000) / 100;
        int day = (birthDate % 100) ; 
    
        System.out.println( year + "Y " +  month + "M " + day + "D ");
    }
}
