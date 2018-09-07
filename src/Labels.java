import javax.swing.*;
import java.awt.*;

class Labels extends JFrame{
    Container contantPane=getContentPane();
    JPanel grid=new JPanel(new GridLayout(4,1));
    JPanel pnl=new JPanel();

    JLabel lbl=new JLabel("Это верхний текст");

    JTextField text=new JTextField("Текст по умолчанию");

    JButton btn=new JButton("Нажми меня");

    Color customcolor=new Color(255,0,0);

    Font customFont=new Font("Serif",Font.BOLD,42);


    //JLabel lbl2=new JLabel("Это верхний текст","Это нижний текст",JLabel.CENTER);


    public Labels(){
        super("Окно Swing");
        setSize(500,200);

        lbl.setOpaque(true);
        lbl.setBackground(Color.BLACK);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(customFont);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //lbl.setHorizontalTextPosition(JLabel.CENTER);

        add(pnl);


        pnl.add(lbl);
        pnl.add(text);
        pnl.add(btn);


        grid.add(lbl);
        grid.add(text);
        grid.add(btn);

        contantPane.add(grid);




        setVisible(true);


    }

    public static void main(String[] args) {
        Labels gui=new Labels();

    }

}
