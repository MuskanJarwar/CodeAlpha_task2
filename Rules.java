package quiz.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
    JButton backButton,start;
    String name;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocation(300,100);
        setLayout(null);
        setTitle("Rules for quiz");
        setSize(800,650);
        JLabel welcomeHeading=new JLabel("Welcome "+ name+ " to Online Quiz");
        welcomeHeading.setBounds(70,20,700,30);
        welcomeHeading.setFont(new Font("Viner Hand ITC",Font.BOLD,34));
        welcomeHeading.setForeground(Color.BLUE);
        add(welcomeHeading);
        JLabel rulesLabel=new JLabel("<html>"+
                "1:Answer all questions within the given time limit. <br>"+
                "2:Each question has a specified point value; ensure to understand the scoring system. <br>"+
                "3:Choose the most appropriate answer for each question. <br>"+
                "4:Once submitted, you cannot change your answers. <br >"+
                "5:Be cautious with spelling and grammar; answers are case-sensitive"+
                "6: Do not use any external resources or aids during the quiz."+
                "7:Respect the time constraints; late submissions may not be accepted.<br>"+
                "8: Ensure a stable internet connection to avoid any disruptions.<br>"+
                "9: Any form of cheating will result in disqualification. <br>"+
                "10:Enjoy the quiz and good luck! <br>"+
                "</html>");
        rulesLabel.setBounds(100,70,500,350);
        rulesLabel.setFont(new Font("Times New Roman ",Font.BOLD,18));
        add(rulesLabel);
        start=new JButton("Start ");
        start.setBounds(350,500,100,25);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        start.setFont(new Font("New Times Roman",Font.BOLD,18));
        start.addActionListener(this);
        add(start);
        backButton=new JButton("Back ");
        backButton.setBounds(150,500,100,25);
        backButton.setBackground(Color.blue);
        backButton.setForeground(Color.white);
        backButton.setFont(new Font("New Times Roman",Font.BOLD,18));
        backButton.addActionListener(this);
        add(backButton);
    }
    public static void main(String[] args) {
        new Rules("null");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(backButton)){
            setVisible(false);
            new Login();
        } else if (e.getSource().equals(start)) {
         setVisible(false);
         new Quiz();
        }
    }
}
