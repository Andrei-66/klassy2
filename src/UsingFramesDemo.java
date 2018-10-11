import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

class TextInputFrame implements ActionListener{
    private JFrame frame;
    JLabel enter;
    JTextField tf;
    JButton btYes,btNo;
    private String name;
    //Конструктор класса
    TextInputFrame(String msg){
       int width=300,height=150;
       frame.setBounds(400,300,width,height);
       frame.setLayout(null);
       //Текстовая метка для поля текстового ввода
        enter=new JLabel(msg,JLabel.LEFT);
        enter.setBounds(10,10,width-20,height/6);

        tf=new JTextField(frame.getWidth()-20);
        tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);

        btYes=new JButton("Подтверждаю");
        btYes.setBounds(10,height/2+10,(width-30)/2,height/6);

        btNo=new JButton("Завершить");
        btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);

        //отмена режима отображения рамки
        btYes.setFocusPainted(false);
        btNo=new JButton("Завершить");
        btNo.setBounds((width-30)/2,height/2+18,(width-30)/2,height/2);
        btNo.setFocusPainted(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(enter);
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        frame.setResizable(false);
        btYes.addActionListener(this);
        btNo.addActionListener(this);

        frame.setVisible(true);}

        //ОБработка щечка на кнопке
        public void actionPerformed(ActionEvent ae){
            String btName=ae.getActionCommand();
            if(btName.equalsIgnoreCase(btYes.getText())){
                name=tf.getText();
                frame.setVisible(false);
                IntInputFrame.show("Сколько вам лет?", name);
            }
            else System.exit(0);

        }

        static void show(String txt){
        //Создание анонимного обьекта
            new TextInputFrame(txt);
        }









}

//Класс для реализации окна для ввода целого числа
class IntInputFrame implements ActionListener,KeyListener{

    private JFrame frame;
    private JLabel enter;
    private JButton btYes,btNo;
    private JTextField tf;
    private String name;
    private  int age;
    //Конструктор класса
    IntInputFrame(String msg, String name){
        //Значение текствого поля
        this.name=new String(name);
        //Размеры окна
        int width=300,height=150;
        //Создание окна
        frame=new JFrame("Окно для ввода числа возраста");
        frame.setBounds(400,300,width,height);
        //Отключение менеджера компоровки
        frame.setLayout(null);
        enter=new JLabel(msg,JLabel.LEFT);
        enter.setBounds(10,10,width-20,height/6);
        tf=new JTextField(frame.getWidth()-20);
        tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);
        //Регистрация обработчика в текстовом поле
        tf.addKeyListener(this);

        btYes=new JButton("Подтверждаю");
        btYes.setBounds(10,height/2+10,(width-30),height/6);

        btNo=new JButton("Завершить");
        btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        frame.setResizable(false);

        //Регистрация обработчика в кнопке подтверждения
        btYes.addActionListener(this);
        btNo.addActionListener(this);

        frame.setVisible(true);

    }
    //оБРАБОТКА события отпускания кнопки
    public void keyReliased(KeyEvent ke){

        try {
            //Попытка преобразовать текст в число
            Integer.parseInt(tf.getText());
            //Кнопка подтвепждения ввода активна
            btYes.setEnabled(true);
        }
        catch (Exception e){
            btYes.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent ae){
        //Определение текста нажатой кнопки
        String btName=ae.getActionCommand();
        if(btName.equalsIgnoreCase(btYes.getText())){
            //wЦелочисленному полю присваивается значение
            age=Integer.parseInt(tf.getText());
            //Окно убирается с экрана
            frame.setVisible(false);
            String msg="ДОБРЫЙ ДЕНЬ "+name+"!\n";
            msg+="Ваш возраст - "+age+"лет";
            MessageFrame.show(msg);
        }
        else System.exit(0);
    }

    static void show(String txt,String name){
        new IntInputFrame(txt,name);
    }





}

class MessageFrame implements ActionListener{
    //Ссылка на обьект окна
    private JFrame frame;
    JLabel il;
    JLabel message;
    JButton button;
    //Конструктор класса
    MessageFrame(String msg){
        int width=350,height=150;
        frame=new JFrame("Сообщение ...");
        frame.setBounds(400,300,width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        message=new JLabel("<html>"+msg.replace("\n","<br>"),+"</html>",JLabel.LEFT);
        message.setBounds(w+20,10,width-30-w,height/2-10);
        //Добавление метки с изображением в окно
        frame.add(message);

        button =new JButton("Прочитано");
        button.setBounds(width/4,3*height/5,width/2,height/6);

        button.setFocusPainted(false);
        button.addActionListener(this);

        //Добавление кнопки в окно
        frame.add(button);
        frame.setResizable(false);
        //Отображение окна
        frame.setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        //Завершение рабьоты
        System.exit(0);
    }


}


public class UsingFramesDemo {
    public static void main(String[] args) {
        TextInputFrame.show("Как Вас зовут? Введите Ваше имя : ");
    }

}
