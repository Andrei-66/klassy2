import javax.swing.*;
import java.awt.event.*;

 class testVivod extends  JFrame implements ActionListener{


    JPanel pnl=new JPanel();


    JButton btn=new JButton("ввод данных");
     JButton btn1=new JButton("вывод данных");



    public testVivod(){
        super("новое окно swing");
        setSize(590,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.setLayout(null);


        add(pnl);
        pnl.add(btn);
        pnl.add(btn1);

        btn.setBounds(250,225,90,50);
        btn1.setBounds(250,280,90,50);

        btn.addActionListener(this);
        btn1.addActionListener(this);



        setVisible(true);

    }

    public void actionPerformed(ActionEvent event){


    }








        public static void main(String[]args){
            testVivod gui=new testVivod();

        }

}
