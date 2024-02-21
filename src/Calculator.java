import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
    JFrame jf;
    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(400, 300);

        JLabel displayLabel=new JLabel("fathimma");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.LIGHT_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.black);
        jf.add(displayLabel);

        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);
        
        JButton eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);
        
        JButton nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);
        
        JButton fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);
        
        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);
        
        JButton sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);

        JButton oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);
        
        JButton twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);
        
        JButton threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);
        
        JButton dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(dotButton);
        
        JButton zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroButton);
        
        JButton equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalButton);
        
        JButton divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divButton);
        
        JButton multiButton=new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(multiButton);
        
        JButton minusButton=new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minusButton);

        JButton plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(plusButton);
        
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main (String[] arg){
        new Calculator();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jf.getContentPane().setBackground(Color.blue);
        
    }
    
}
