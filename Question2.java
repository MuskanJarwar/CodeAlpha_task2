package quiz.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Question2 extends JFrame implements ActionListener{
    JRadioButton opt1,opt2,opt3,opt4;
    int count;
    JButton backbutton,nextbutton;
    Question2(int count){
        this.count=count;
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setSize(1000,550);
        setLocation(200,150);
        setTitle("QUESTION 2 OF Quiz ");
        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        Image img= img1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel image1=new JLabel(i2);
        image1.setBounds(0,0,450,500);
        add(image1);
        JLabel heading1=new JLabel("Question 2");
        heading1.setBounds(650,50,200,45);
        heading1.setFont(new Font("Mongolian Biati",Font.BOLD,34));
        heading1.setForeground(Color.black);
        add(heading1);
        JLabel question2=new JLabel(" Which keyword is used to refer to the current instance of a class in Java?");
        question2.setBounds(400,130,700,25);
        question2.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        question2.setForeground(Color.black);
        add(question2);
        opt1=new JRadioButton("A. Self");
        opt1.setBounds(500,200,90,25);
        opt1.setBackground(Color.pink);
        opt1.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt1.setForeground(Color.black);
        opt1.addActionListener(this);
        add(opt1);
        opt2=new JRadioButton("B. this");
        opt2.setBounds(750,200,80,25);
        opt2.setBackground(Color.pink);
        opt2.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt2.setForeground(Color.black);
        opt2.addActionListener(this);
        add(opt2);
        opt3=new JRadioButton("C. Current");
        opt3.setBounds(500,300,120,25);
        opt3.setBackground(Color.pink);
        opt3.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt3.setForeground(Color.black);
        opt3.addActionListener(this);
        add(opt3);
        opt4=new JRadioButton("D. Here");
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
        JButton backbutton=new JButton("Back");
        backbutton.setBounds(550,400,100,25);
        backbutton.setBackground(Color.pink);
        backbutton.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        backbutton.setForeground(Color.black);
        backbutton.addActionListener(this);
        add(backbutton);
        JButton nextbutton=new JButton("Next");
        nextbutton.setBounds(700,400,100,25);
        nextbutton.setBackground(Color.pink);
        nextbutton.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        nextbutton.setForeground(Color.black);
        nextbutton.addActionListener(this);
        add(nextbutton);
        this.backbutton = backbutton;
        this.nextbutton = nextbutton;
    }

    public static void main(String[] args) {
          new Question2(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(backbutton)){
            setVisible(false);
            new Quiz();
        }
        else if (e.getSource().equals(nextbutton)){
            if(opt2.isSelected()){
                count++;
            }
            setVisible(false);
            new Question3(count);
        }
    }
}
