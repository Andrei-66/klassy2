import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Класс для кнопки
class MyButton extends JButton{
    //Ccылка на окно в которое добавляется кнопка
    private MyFrame frame;
    MyButton(MyFrame frame,boolean state){
        //Вызов конструктора суперкласса
        super();
        this.frame=frame;
        //Текст для записи имени файла изображения
        String fileName;
        //Текст для записи имени кнопки
        String bName;
        //Определение имени файла и названия кнопки
        if (state){
            fileName="Yes.png";
            bName="Да";
            addActionListener(new HandlerYes(frame));
        }
        else{fileName="No.png";
        bName="Нет";
        addActionListener(new HandlerNo());
        }

        //Фомирование полного имени файла с изображением
        fileName="d://books//files//"+fileName;
        imageIcon icn=new ImageIcon(fileName);
        //Применение пиктограммы для кнопки
        setIcon(icn);
        setText(bName);
        setFocusPainted(false);
        //Размеры кнопки
        int w=frame.getWidth()/4;
        int h=frame.getHeight()/8;
        //Применение размеров для кнопки
        setSize(w,h);
        //Координаты кнопки
        int x=frame.getWidth()/4, y=frame.getHeight()-h-50;
        if(!state)x+=w+50;

        //Положение кнопки во окне
        setLocation(x,y);
        //Добавление кнопки в окно
        frame.add(this);



    }
}

//Класс метки с изображением
class MyIconLabel extends JLabel{
    private MyFrame frame;

    //Конструктор класса, аргумент - окно, в которое добавляется метка
    MyIconLabel(MyFrame frame){
        //Вызов конструктора суперклалсса
        super();
        //Заполнение поля класса
        this.frame=frame;
        //Cоздание изображения


    }
}




public class MakeComponentsDemo {
}

