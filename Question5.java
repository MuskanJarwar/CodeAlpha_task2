package quiz.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Question5 extends JFrame implements ActionListener {
    JRadioButton opt1,opt2,opt3,opt4;
    int count;
    JButton back,next;
    Question5(int count){
        this.count=count;
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setSize(1000,550);
        setLocation(200,150);
        setTitle("QUESTION 3 OF Quiz ");
        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        Image img= img1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel image1=new JLabel(i2);
        image1.setBounds(0,0,450,500);
        add(image1);
        JLabel heading1=new JLabel("Question 5 ");
        heading1.setBounds(650,50,200,45);
        heading1.setFont(new Font("Mongolian Biati",Font.BOLD,34));
        heading1.setForeground(Color.black);
        add(heading1);
        JLabel question5=new JLabel(" What is the default value of a boolean variable in Java if not explicitly initialized?");
        question5.setBounds(380,120,700,25);
        question5.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        question5.setForeground(Color.black);
        add(question5);
        opt1=new JRadioButton("A. True");
        opt1.setBounds(500,200,120,25);
        opt1.setBackground(Color.pink);
        opt1.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt1.setForeground(Color.black);
        opt1.addActionListener(this);
        add(opt1);
        opt2=new JRadioButton("B. False");
        opt2.setBounds(750,200,90,25);
        opt2.setBackground(Color.pink);
        opt2.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt2.setForeground(Color.black);
        opt2.addActionListener(this);
        add(opt2);
        opt3=new JRadioButton("C. null");
        opt3.setBounds(500,300,90,25);
        opt3.setBackground(Color.pink);
        opt3.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt3.setForeground(Color.black);
        opt3.addActionListener(this);
        add(opt3);
        opt4=new JRadioButton("D. 0");
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
        new Question5(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(back)){
            setVisible(false);
            new Question4(count);
        }
        else if (e.getSource().equals(next)){
            if(opt2.isSelected()){
                count++;
            }
            setVisible(false);
            new Question6(count);
        }

    }
}
