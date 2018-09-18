import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class demoText extends JFrame implements ActionListener {
    Container contantPane = getContentPane();

    JPanel pnl = new JPanel();


    String text = "";
    String stroka;



    JLabel lbl = new JLabel();



    JButton btn = new JButton("Вывести данные");

    demoText() {                 //Конструктор класса

        super("Окно Swing");
        setSize(500,200);

        lbl.setOpaque(true);
        lbl.setText("VJ;JH");
        lbl.setBackground(Color.BLACK);
        lbl.setForeground(Color.WHITE);

        btn.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lbl.setHorizontalTextPosition(JLabel.CENTER);

        add(pnl);

        pnl.add(lbl);
        pnl.add(btn);






        setVisible(true);



    }


    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==btn){
            try{
                String line="";


            FileReader freader=new FileReader("E:\\data\\data.txt");
            BufferedReader buffer=new BufferedReader(freader);
                while ((line=buffer.readLine())!=null){
                    text+=(line);
                }

            }

            catch (IOException e){
                System.out.println("Ошибка чтения");
            }
        }


    }

    public static void main(String[] args) {

        demoText gui=new demoText();

    }

}




