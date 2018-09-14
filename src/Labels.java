import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.ArrayList.*;

class Labels extends JFrame implements ActionListener{
    Container contantPane=getContentPane();
    JPanel grid=new JPanel(new GridLayout(5,1));
    JPanel pnl=new JPanel();
    String[] fdata;

    JLabel lbl=new JLabel("Это верхний текст");

    ArrayList<String> list=new ArrayList<String>();
    String[] text1;
    JLabel lbl1=new JLabel(text1);
    JTextField text=new JTextField();//Текстовое поле
    JButton btn=new JButton();
    JButton btn1=new JButton();


    Color customcolor=new Color(255,0,0);

    Font customFont=new Font("Serif",Font.BOLD,42);



    public void dataWrite(){

    }

    public void actionPerformed(ActionEvent event){
        String textarea=text.getText();//Переменная в которую читается введенный текст
        text.setText(event.getActionCommand());
        if(event.getSource()==btn){
            try{

                FileWriter file=new FileWriter("E:\\data\\data.txt",true);
                BufferedWriter buffer=new BufferedWriter(file);
                buffer.write("\n " + textarea);
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
                //ArrayList<String> list=new ArrayList<String>();

                while ((line=buffer1.readLine())!=null){
                    list.add(line);
                   for(int i=0;i<list.size();i++){
                       System.out.println(list.get(i));
                       text1=list;

                   }

                }

            }
            catch (IOException e){
                System.out.println("Произошла ошибка чтения.");
            }
        }


    }


    public Labels(){
        super("Окно Swing");
        setSize(500,200);

        lbl.setOpaque(true);
        lbl.setBackground(Color.BLACK);
        lbl.setForeground(Color.WHITE);
        lbl1.setBackground(Color.WHITE);
        lbl1.setForeground(Color.BLACK);
        lbl.setFont(customFont);
        lbl1.setFont(customFont);
        btn.addActionListener(this);
        btn1.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        lbl.setHorizontalTextPosition(JLabel.CENTER);

        add(pnl);


        pnl.add(lbl);
        pnl.add(text);
        pnl.add(btn);
        pnl.add(btn1);
        pnl.add(lbl1);


        grid.add(lbl);
        grid.add(text);
        grid.add(btn);
        grid.add(btn1);
        grid.add(lbl1);

        contantPane.add(grid);




        setVisible(true);


    }

    public static void main(String[] args) {
        Labels gui=new Labels();

    }

}
