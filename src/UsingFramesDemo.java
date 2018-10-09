import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextInputFrame implements ActionListener{
    private JFrame frame;
    JLabel enter;
    JTextField tf;
    JButton btYes,btNo;
    private String name;
    //Конструктор класса
    TextInputFrame(String msg){
       int width=300,height=150;


    }

}


public class UsingFramesDemo {
    public static void main(String[] args) {
        TextInputFrame.show("Как Вас зовут? Введите Ваше имя : ");
    }
}
