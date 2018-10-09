import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;


class demoText extends JFrame implements ActionListener {



    JPanel pnl = new JPanel();


    Container contantPane = getContentPane();

    String text;
    String stroka;
    String[] month={"январь","февраль","март","апрель","май","июнь","июль","август",
            "сентябрь","октябрь","ноябрь","декабрь"};
    JCheckBox chk1=new JCheckBox(month[0]);
    JCheckBox chk2=new JCheckBox(month[1]);
    JCheckBox chk3=new JCheckBox(month[2]);
    JCheckBox chk4=new JCheckBox(month[3]);
    JCheckBox chk5=new JCheckBox(month[4]);
    JCheckBox chk6=new JCheckBox(month[5]);
    JCheckBox chk7=new JCheckBox(month[6]);
    JCheckBox chk8=new JCheckBox(month[7]);
    JCheckBox chk9=new JCheckBox(month[8]);
    JCheckBox chk10=new JCheckBox(month[9]);
    JCheckBox chk11=new JCheckBox(month[10]);
    JCheckBox chk12=new JCheckBox(month[11]);

    String[] years={"2017","2018","2019","2020"};


    JCheckBox chk21=new JCheckBox(years[0]);
    JCheckBox chk22=new JCheckBox(years[1]);
    JCheckBox chk23=new JCheckBox(years[2]);
    JCheckBox chk24=new JCheckBox(years[3]);


    JComboBox<String >box1=new JComboBox<String>(month);
    JComboBox<String >box2=new JComboBox<String>(years);

    JLabel lbl_pokaz=new JLabel("Введите показания");

    JLabel lbl_month=new JLabel("введите месяц");

    JTextField txtfield = new JTextField(12);


    JLabel lbl = new JLabel();
    JLabel lbl_year=new JLabel("введите год");

    JButton btn = new JButton("Записать данные");
    JButton btn1 = new JButton("Вывести данные");
    Font customfont=new Font("Serif",Font.PLAIN,32);
    Font customfont1=new Font("Serif",Font.BOLD,50);

    Container contentPane=getContentPane();


    JPanel grid=new JPanel(new GridLayout(5,2));

//---------------------------Конструктор класса demoText------------------

    demoText() {

        super("Cтарое окно Swing");
        setSize(500, 500);
        pnl.setLayout(null);



        txtfield.setFont(customfont);

        lbl.setOpaque(true);
        lbl.setBackground(Color.WHITE);
        lbl.setForeground(Color.BLACK);
        lbl.setFont(customfont1);

        btn.setPreferredSize(new Dimension(50,20));

        btn.addActionListener(this);
        btn1.addActionListener(this);
        box1.addActionListener(this);
        box2.addActionListener(this);



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lbl.setHorizontalTextPosition(JLabel.CENTER);

        add(pnl);
        pnl.add(lbl_month);
        pnl.add(box1);
        pnl.add(txtfield);
        pnl.add(lbl_year);
        pnl.add(box2);
        pnl.add(btn);
        pnl.add(btn1);
        pnl.add(lbl);
        pnl.add(lbl_pokaz);

        pnl.add(chk1);
        pnl.add(chk2);
        pnl.add(chk3);
        pnl.add(chk4);
        pnl.add(chk5);
        pnl.add(chk6);
        pnl.add(chk7);
        pnl.add(chk8);
        pnl.add(chk9);
        pnl.add(chk10);
        pnl.add(chk11);
        pnl.add(chk12);

        pnl.add(box1);

        grid.add(lbl_pokaz);
        grid.add(txtfield);

        grid.add(lbl_month);
        grid.add(box1);

        grid.add(lbl_year);
        grid.add(box2);

        grid.add(btn);
        grid.add(btn1);
        grid.add(lbl);

        contentPane.add("Center",grid);


        setVisible(true);

    }
//-------------------------------------------------------
    public void actionPerformed(ActionEvent event){


        if(event.getSource()==btn){

            try{
                //Переменная в которую читается введенный текст
                String txtf=txtfield.getText();
                String item=(String)box1.getSelectedItem();
                String item1=(String)box2.getSelectedItem();

                FileWriter file=new FileWriter("E:\\data\\data.txt",true);
                BufferedWriter buffer=new BufferedWriter(file);
                buffer.write("\n" + item + " " + item1+" " + txtf);
                buffer.close();

            }
            catch(IOException e){
                System.out.println("Произошла ошибка записи.");
            }
        }
        if(event.getSource()==btn1){
            try{
                FileReader readf=new FileReader("E:\\data\\data.txt");
                BufferedReader buffer1=new BufferedReader(readf);
                String line;

                while ((line=buffer1.readLine())!=null){
                    text+=(line+"||");
                }


                System.out.println();

                lbl.setText(text);
            }

            catch (IOException e){
                System.out.println("Произошла ошибка чтения.");
            }
        }

    }
    public static void main(String[] args){

        demoText gui = new demoText();
    }
}




