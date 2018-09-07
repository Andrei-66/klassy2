public class StringComparison {
    public static void main(String[] args) {
        String password="bingo";
        try{}
        catch (Exception e){
            System.out.printf("Требуется вввод пароля.");
        }
        if (args[0].toLowerCase().equals(password)){
            System.out.printf("Пароль подствержден.");
        }
        else{
            System.out.printf("Пароль неверный.");
        }

    }
}
