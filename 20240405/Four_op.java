import java.util.ArrayList;
public class Four_op{
    public static void main(String[] args){
        ArrayList<String> cal = new ArrayList<>();
        cal.add(" + ");
        cal.add(" - ");
        cal.add(" * ");
        cal.add(" / ");
        double a = 3.5;
        double b = 7.2;
        
        for(String c : cal){
            switch(c){
                case " + ":
                    System.out.println(a + c + b + " = " + (a + b));
                    break;
                case " - ":
                    System.out.println(a + c + b + " = " + (a - b));
                    break;
                case " * ":
                    System.out.println(a + c + b + " = " + (a * b));
                    break;
                case " / ":
                    System.out.println(a + c + b + " = " + (a / b));
                    break;
            }
        }
    }
}