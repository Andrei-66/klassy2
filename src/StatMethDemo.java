import javax.swing.*;
class MyMath{
    //Статическая константа
    final static double PI=3.14159265;
    //Статический метод для для вычисления синуса
    static double sin(double x, int n);
    //Локальные переменные
    double s=0,q=x;
    //Оператор цикла для вычисления ряда Тейлора для синуса
    int i;
    for( i=0;i<=n;i++){
        s+=q;
        q*=(-1)*x*x/(2*i)/(2*i+1);
        return s+q;
    }
}

public class StatMethDemo {
    public static void main(String[] args) {
        String text="Значения ряда Тейлора для синуса.";
        for(int k=0;k<5;k++){
            text+="\n Слагаемых "+(к+1)+" : ";
            text+="sin(p/4)"=+MyMath.sin(MyMath.PI/4,K);
            //Отображение окна сообщения
            JOptionPane.showMessageDialog(null,text);
        }
    }
}
