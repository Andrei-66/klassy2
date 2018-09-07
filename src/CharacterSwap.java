public class CharacterSwap {
    public static void main(String[] args) {
        String txt="";
        if (txt.isEmpty())txt=" Borocudo  ";
        System.out.println("Строка " + txt);
        System.out.println("Длина строки txt равна " + txt.length());


        txt=txt.trim();
        System.out.println("Длина строки txt после обрезки "+txt.length());

        char initial=txt.charAt(0);
        System.out.println("Первыйф символ строки txt - "+initial+".");

        initial=txt.charAt(txt.length()-1);
        System.out.println("Последний символ строки txt ="+ initial);

        txt=txt.replace('o','a');
        System.out.println("Новый вид строки txt - "+txt);

    }
}
