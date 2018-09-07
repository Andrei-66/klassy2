import javax.swing.*;

class Buttons extends JFrame{
    JPanel pnl=new JPanel();
    JButton btn=new JButton("Нажми меня");
    JButton cross=new JButton("Стоп");

    public Buttons(){
        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        pnl.add(btn);
        pnl.add(cross);
        setVisible(true);


    }

    public static void main(String[] args) {
        Buttons gui=new Buttons();

    }

}
