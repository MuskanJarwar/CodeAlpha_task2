package quiz.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Question10 extends JFrame implements ActionListener {
    JRadioButton opt1,opt2,opt3,opt4;
    int count;
    JButton back,submit;
    Question10(int count){
        this.count=count;
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        setSize(1000,550);
        setLocation(200,150);
        setTitle("QUESTION 10 OF Quiz ");
        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        Image img= img1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel image1=new JLabel(i2);
        image1.setBounds(0,0,450,500);
        add(image1);
        JLabel heading1=new JLabel("Question 10");
        heading1.setBounds(650,80,200,45);
        heading1.setFont(new Font("Mongolian Biati",Font.BOLD,34));
        heading1.setForeground(Color.black);
        add(heading1);
        JLabel question10=new JLabel("What does the \"implements\" keyword indicate in Java?");
        question10.setBounds(460,150,700,25);
        question10.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        question10.setForeground(Color.black);
        add(question10);
        opt1=new JRadioButton("A. Inheritance");
        opt1.setBounds(500,200,150,25);
        opt1.setBackground(Color.pink);
        opt1.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt1.setForeground(Color.black);
        opt1.addActionListener(this);
        add(opt1);
        opt2=new JRadioButton("B. Polymorphism");
        opt2.setBounds(750,200,180,25);
        opt2.setBackground(Color.pink);
        opt2.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt2.setForeground(Color.black);
        opt2.addActionListener(this);
        add(opt2);
        opt3=new JRadioButton("C. Interface");
        opt3.setBounds(500,300,150,25);
        opt3.setBackground(Color.pink);
        opt3.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        opt3.setForeground(Color.black);
        opt3.addActionListener(this);
        add(opt3);
        opt4=new JRadioButton("D. Abstraction");
        opt4.setBounds(750,300,150,25);
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
        JButton submit=new JButton("Submit");
        submit.setBounds(700,400,100,25);
        submit.setBackground(Color.pink);
        submit.setFont(new Font("Mongolian Biati",Font.BOLD,16));
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        add(submit);
        this.back= back;
        this.submit= submit;
    }
    public static void main(String[] args) {
        new Question10(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(back)){
            setVisible(false);
            new Question9(count);
        }
        else if (e.getSource().equals(submit)){
            if(opt3.isSelected()){
                count++;
            }
            setVisible(false);
            JOptionPane.showMessageDialog(null,"Thankyou for playing the quiz... \n your total score is "+count);
        }

    }
}
