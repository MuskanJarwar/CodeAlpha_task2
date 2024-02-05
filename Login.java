package quiz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField textName;
    Login(){
        getContentPane().setBackground(Color.white);
        setSize(1000,500);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.png"));
        Image i= i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
       image.setBounds(480,0,550,500);
        add(image);
        JLabel heading1=new JLabel("Online Quiz");
        heading1.setBounds(150,60,400,45);
        heading1.setFont(new Font("Viner Hand ITC",Font.BOLD,34));
        heading1.setForeground(Color.BLUE);
        add(heading1);
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(150,130,200,45);
        name.setFont(new Font("Mongolian Biati",Font.BOLD,20));
        name.setForeground(Color.blue);
        add(name);
        textName=new JTextField();
        textName.setBounds(130,200,250,25);
        textName.setFont(new Font("New Times Roman",Font.BOLD,20));
        add(textName);
        rules=new JButton("Rules");
        rules.setBounds(90,300,100,25);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.white);
        rules.setFont(new Font("New Times Roman",Font.BOLD,18));
        rules.addActionListener(this);
        add(rules);
        back=new JButton("Start");
        back.setBounds(300,300,100,25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.setFont(new Font("New Times Roman",Font.BOLD,18));
        back.addActionListener(this);
        add(back);

        setVisible(true);
        setLocation(200,150);
        setTitle("Online Quiz Application ");

    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(back)){
            setVisible(false);
            //JOptionPane.showMessageDialog(this,"Thanks for playing an Online Quiz ");
            new Quiz();

        } else if (ae.getSource().equals(rules)) {
            setVisible(false);
           new Rules(textName.getText());

        }
    }
}
