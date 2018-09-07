public class Scope {
    final static String txt="Это глобальная переменная класса Scope.";
    public static void main(String[] args) {

        System.out.println(txt);
        String txt="Это локальная переменная метода main.";
        System.out.println(Scope.txt);
        sub();
    }

    public static void sub(){
        String txt="Это локальная переменная метода sub.";
        System.out.println(txt);
    }



}
