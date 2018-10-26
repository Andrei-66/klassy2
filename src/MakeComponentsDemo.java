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
        ImageIcon icn=new ImageIcon("");
        setIcon(icn);
        setBounds(5,15,frame.getWidth()/4-10,frame.getHeight()-30);
        frame.add(this);
    }
}

//Класс для панели меню
class MyMenuBar extends JMenuBar{
    //ссылка на окно в которое добавляется меню
    private MyFrame frame;

    //Конструктор класса
    MyMenuBar(MyFrame frame){
        // вызвов
        // конструктора суперкласса
        super();
        this.frame=frame;
        //Присваивание значения ссылке на обьект
        JMenu wind=new JMenu("Окно");
        //Пункты Меню "Окно"
        JMenuItem apply=new JMenuItem("Подтверждаю");Y
        JMenuItem exit=new JMenuItem("Выход");

        //Регистрация обработчиков событий
        apply.addActionListener(new HandlerYes(frame));
        apply.addActionListener(new HanderNo());

        wind.add(apply);
        wind.add(exit);

        add(wind);
        //Второе меню - По горизонтали
        JMenu horiz=new JMenu("По горизонтали");
        //Пункты ддя меню по горизонтали
        JMenuItem left=new JMenuItem("Влево");
        JMenuItem right=new JMenuItem("Вправо");
        JMenuItem hnone=new JMenuItem("На месте");

        //Регистрация обработчиков событий
        left.addActionListener(new MenuHandler(frame,true));
        right.addActionListener(new MenuHandler(frame,true));
        hnone.addActionListener(new MenuHandler(frame,true));

        //Добавление путкутов в меню по горизонтали
        horiz.add(left);
        horiz.add(right);
        horiz.add(hnone);

        //Добавление меню "По горизонтали" в панель меню

        add(horiz);
        //Третью меню = "По вертикали"

        JMenu vert=new JMenu("По вертикали");

        //Пункты меню "По вертикали"
        JMenuItem up=new JMenuItem("По вертикали");
        JMenuItem down=new JMenuItem("Вверх");
        JMenuItem vnone=new JMenuItem("На месте");

        //Регистрация обработчиков событий

        up.addActionListener(new MenuHandler(frame, false));
        down.addActionListener(new MenuHandler(frame, false));
        vnone.addActionListener(new MenuHandlwer(frame, false));

        //Добавление пунктов в меню "По вертикали"
        vert.add(up);
        vert.add(down);
        vert.add(vnone);

        //Добавление панели "По вертикали" меню в панели
        add(vert);

        //Положение и размер панели меню
        setBounds(1,1,frame.getWidth()-1,frame.getHeight()/10);

        //Добавление панели в окно
        frame.add(this);


















    }
}




public class MakeComponentsDemo {
}

