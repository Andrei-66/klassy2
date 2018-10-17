import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

class MyClass{
    static int N1;
    int N2;
    MyClass(int n1, int n2){
        String text="Cоздан новый обьект \n";
        text+="Cтатическое поле "+N1+"\n";
        text+="Нестатическое полу "+N2+"\n";

        JOptionPane.showMessageDialog(null, text);
    }

    void show(){
        String text="Поля обьекта \n";
        text+="Статическое поле "+N1+"\n";
        text+="нНестатическое поле "+N2+"\n";
        //Отображение окна
        JOptionPane.showMessageDialog(null,text);

    }
}

public class UsingStatDemo {
    public static void main(String[] args) {
        //Создание обьекта
        MyClass A=new MyClass(10,200);
        //Изменение значения статического поля
        MyClass.N1=(-50);
        //Отображение полей обьекта
        A.show();
        MyClass B=new MyClass(1,2);
        A.show();
        B.N1=-1;
        B.N2=-2;
        A.show();
    }

}
