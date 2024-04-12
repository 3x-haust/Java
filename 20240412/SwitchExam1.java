public class SwitchExam1{
    public static void main(String[] args){
        int a = 20, b = 10; char op = '*';

        switch(op){
            case '+': System.out.println(a + " + " + b + " = " + (a + b));
            case '-': System.out.println(a + " - " + b + " = " + (a - b));
            case '*': System.out.println(a + " * " + b + " = " + (a * b));
            case '/': System.out.println(a + " / " + b + " = " + (a / b));
            default: System.out.println("사칙연산자가 아닙니다.");
        }
    }
}