public class ArrayTest1{
    public static void main(String[] args){
        int[] A = new int[]{2, 4, 6, 8};

        java.util.Arrays.stream(A).forEach(i -> System.out.println(i));
    }
}