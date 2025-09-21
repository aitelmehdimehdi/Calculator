import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    Double var;
    String op;
    JPanel firstPanel=new JPanel();
    JPanel secondPanel=new JPanel();
    JTextArea textArea=new JTextArea();
    JButton number1=new JButton("1");
    JButton number2=new JButton("2");
    JButton number3=new JButton("3");
    JButton number4=new JButton("4");
    JButton number5=new JButton("5");
    JButton number6=new JButton("6");
    JButton number7=new JButton("7");
    JButton number8=new JButton("8");
    JButton number9=new JButton("9");
    JButton number0=new JButton("0");
    JButton division=new JButton("%");
    JButton multiplication=new JButton("*");
    JButton addition=new JButton("+");
    JButton soustraction=new JButton("-");
    JButton egale=new JButton("=");
    JButton point=new JButton(".");
    public Calculator() throws HeadlessException {
        setTitle("CALCULATOR");
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        secondPanel.setLayout(new GridLayout(4,4));

        textArea.setPreferredSize(new Dimension(230,75));
        firstPanel.add(textArea);
        add(firstPanel);


        number0.addActionListener(this);
        number1.addActionListener(this);
        number2.addActionListener(this);
        number3.addActionListener(this);
        number4.addActionListener(this);
        number7.addActionListener(this);
        number5.addActionListener(this);
        number6.addActionListener(this);
        number8.addActionListener(this);
        number9.addActionListener(this);

        multiplication.addActionListener(this);
        soustraction.addActionListener(this);
        addition.addActionListener(this);
        division.addActionListener(this);
        egale.addActionListener(this);
        point.addActionListener(this);

        secondPanel.add(number7);
        secondPanel.add(number8);
        secondPanel.add(number9);
        secondPanel.add(division);
        secondPanel.add(number4);
        secondPanel.add(number5);
        secondPanel.add(number6);
        secondPanel.add(multiplication);
        secondPanel.add(number1);
        secondPanel.add(number2);
        secondPanel.add(number3);
        secondPanel.add(soustraction);
        secondPanel.add(number0);
        secondPanel.add(point);
        secondPanel.add(egale);
        secondPanel.add(addition);
        add(secondPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==soustraction)
        {
            var= Double.valueOf(textArea.getText());
            op="-";
            textArea.setText("");
        }
        if (e.getSource()==addition){
            var= Double.valueOf(textArea.getText());
            op="+";
            textArea.setText("");
        }
        if (e.getSource()==multiplication){
            var= Double.valueOf(textArea.getText());
            op="*";
            textArea.setText("");
        }
        if (e.getSource()==division){
            var= Double.valueOf(textArea.getText());
            op="/";
            textArea.setText("");
        }
        Double var2 = null;
        if(e.getSource()==egale)
        {
            switch (op) {
                case "+":
                    var2= var+Double.valueOf(textArea.getText());
                    break;
                case "-":
                    var2= var-Double.valueOf(textArea.getText());
                    break;
                case "*":
                    var2= var*Double.valueOf(textArea.getText());
                    break;
                case "/":
                    var2= var/Double.valueOf(textArea.getText());
                    break;
                default:var2= (double) 0;
            }
            textArea.setText(var2.toString());
            op="";
            var=null;
        }


        if(e.getSource()==number0)
            textArea.setText(textArea.getText()+number0.getText());
        if(e.getSource()==number1)
            textArea.setText(textArea.getText()+number1.getText());
        if(e.getSource()==number2)
            textArea.setText(textArea.getText()+number2.getText());
        if(e.getSource()==number3)
            textArea.setText(textArea.getText()+number3.getText());
        if(e.getSource()==number4)
            textArea.setText(textArea.getText()+number4.getText());
        if(e.getSource()==number5)
            textArea.setText(textArea.getText()+number5.getText());
        if(e.getSource()==number6)
            textArea.setText(textArea.getText()+number6.getText());
        if(e.getSource()==number7)
            textArea.setText(textArea.getText()+number7.getText());
        if(e.getSource()==number8)
            textArea.setText(textArea.getText()+number8.getText());
        if(e.getSource()==number9)
            textArea.setText(textArea.getText()+number9.getText());
        repaint();
    }

    public static void main(String[] argv)
    {
        Calculator calculator=new Calculator();
        calculator.setSize(250,300);
        calculator.setVisible(true);
    }
}
