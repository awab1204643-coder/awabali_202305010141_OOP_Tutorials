<<<<<<< HEAD

import java.awt.event.*;
import javax.swing.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    // to initialize the class, but what class?
    Questions question = new Questions();

=======
import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

>>>>>>> e2e2c8b (week1 done)
    JLabel lblQuestion;
    JLabel lblResult;

    JButton btn1;
    JButton btn2;

<<<<<<< HEAD
    public QuizBattleGUI() {

        // name appropriate title
        setTitle("Programming Quiz Battle");

        // set the size, find out the suitable size
        setSize(400, 250);

        setLayout(null);

        // by default set to close method
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(30, 20, 320, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 80, 120, 40);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 80, 120, 40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 150, 300, 30);
=======
    Questions question;

    public QuizBattleGUI() {

        question = new Questions(
                "Which keyword creates an object?",
                "new",
                "class",
                "new"
        );

        setTitle("Programming Quiz Battle");
        setSize(400,250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(60,30,300,20);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(70,80,100,40);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(220,80,100,40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(100,160,250,20);
>>>>>>> e2e2c8b (week1 done)

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

<<<<<<< HEAD
        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {

            lblResult.setText("Correct! You defeated the Code Boss!");

        } else {

            lblResult.setText("Wrong! Try Again!");
        }
    }

    // the main entry point to open the app, what is it?
    public static void main(String[] args) {

        new QuizBattleGUI();
    }
}
=======
        JButton button = (JButton)e.getSource();

        if(question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }

    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}
>>>>>>> e2e2c8b (week1 done)
