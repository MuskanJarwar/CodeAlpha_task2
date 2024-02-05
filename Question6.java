package quiz.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Question6 extends JFrame implements ActionListener {
    JRadioButton opt1,opt2,opt3,opt4;
    int count;
    JButton back,next;
    Question6(int count){
        this.count=count;
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setSize(1000,550);
        setLocation(200,150);
        setTitle("QUESTION 6 OF Quiz ");
        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        Image img= img1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel image1=new JLabel(i2);
        image1.setBounds(0,0,450,500);
        add(image1);
        JLabel heading1=new JLabel("Question 6 ");
        heading1.setBounds(650,80,200,45);
        heading1.setFont(new Font("Mongolian Biati",Font.BOLD,34));
        heading1.setForeground(Color.black);
        add(heading1);
        JLabel question6=new JLabel("What keyword is used to call the superclass constructor in Java?");
        question6.setBounds(460,150,700,25);
        question6.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        question6.setForeground(Color.black);
        add(question6);
        opt1=new JRadioButton("A. Super");
        opt1.setBounds(500,200,120,25);
        opt1.setBackground(Color.pink);
        opt1.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt1.setForeground(Color.black);
        opt1.addActionListener(this);
        add(opt1);
        opt2=new JRadioButton("B. This");
        opt2.setBounds(750,200,90,25);
        opt2.setBackground(Color.pink);
        opt2.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt2.setForeground(Color.black);
        opt2.addActionListener(this);
        add(opt2);
        opt3=new JRadioButton("C. Extends");
        opt3.setBounds(500,300,110,25);
        opt3.setBackground(Color.pink);
        opt3.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt3.setForeground(Color.black);
        opt3.addActionListener(this);
        add(opt3);
        opt4=new JRadioButton("D. Parent");
        opt4.setBounds(750,300,100,25);
        opt4.setBackground(Color.pink);
        opt4.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt4.setForeground(Color.black);
        opt4.addActionListener(this);
        add(opt4);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(opt1);
        buttonGroup.add(opt2);
        buttonGroup.add(opt3);
        buttonGroup.add(opt4);
        JButton back=new JButton("Back");
        back.setBounds(550,400,100,25);
        back.setBackground(Color.pink);
        back.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);
        JButton next=new JButton("Next");
        next.setBounds(700,400,100,25);
        next.setBackground(Color.pink);
        next.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);
        this.back= back;
        this.next= next;
    }
    public static void main(String[] args) {
        new Question6(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(back)){
            setVisible(false);
            new Question5(count);
        }
        else if (e.getSource().equals(next)){
            if(opt1.isSelected()){
                count++;
            }
            setVisible(false);
            new Question7(count);
        }

    }
}
