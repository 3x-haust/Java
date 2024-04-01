class ArrayTest2{
    public static void main(String[] args){
        String[] me = new String[]{"1", "2", "6", "lyusungyun"};

        java.util.Arrays.stream(me).forEach(str -> System.out.println(str));
    }
}
