/* Made by - Shreyansh vyas
 *  This is my frist java working program
 * that is i have made, i see the tutorials
 * and i've made this calculator.
 */
package calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(2, 10);

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclear = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();

    double number1,number2,result;
    int addc=0,mulc=0,divc=0,subc=0;


    public calculator() {
        frame.setSize(340, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("shimpis calculator");

        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.BLUE, 4);


        textArea.setBackground(Color.BLACK);
        Border tborder = BorderFactory.createLineBorder(Color.YELLOW, 3);
        textArea.setBorder(tborder);
        Font font = new Font("arial", Font.BOLD, 30);
        textArea.setFont(font);
        textArea.setForeground(Color.WHITE);
        panel.add(textArea);

        textArea.setPreferredSize(new Dimension(2, 10));
        textArea.setLineWrap(true);

        button1.setPreferredSize(new Dimension(100, 40));
        button1.setIcon(new ImageIcon("./Png.calculator/button1.png"));

        button2.setPreferredSize(new Dimension(100, 40));
        button2.setIcon(new ImageIcon("./Png.calculator/button2.png"));

        button3.setPreferredSize(new Dimension(100, 40));
        button3.setIcon(new ImageIcon("./Png.calculator/button3.png"));

        button4.setPreferredSize(new Dimension(100, 40));
        button4.setIcon(new ImageIcon("./Png.calculator/button4.png"));

        button5.setPreferredSize(new Dimension(100, 40));
        button5.setIcon(new ImageIcon("./Png.calculator/button5.png"));

        button6.setPreferredSize(new Dimension(100, 40));
        button6.setIcon(new ImageIcon("./Png.calculator/button6.png"));

        button7.setPreferredSize(new Dimension(100, 40));
        button7.setIcon(new ImageIcon("./Png.calculator/button7.png"));

        button8.setPreferredSize(new Dimension(100, 40));
        button8.setIcon(new ImageIcon("./Png.calculator/button8.png"));

        button9.setPreferredSize(new Dimension(100, 40));
        button9.setIcon(new ImageIcon("./Png.calculator/button9.png"));

        button0.setPreferredSize(new Dimension(100, 40));
        button0.setIcon(new ImageIcon("./Png.calculator/button0.png"));

        buttonadd.setPreferredSize(new Dimension(100, 40));
        buttonadd.setIcon(new ImageIcon("./Png.calculator/buttonadd.png"));

        buttonsub.setPreferredSize(new Dimension(100, 40));
        buttonsub.setIcon(new ImageIcon("./Png.calculator/buttonsub.png"));

        buttondot.setPreferredSize(new Dimension(100, 40));
        buttondot.setIcon(new ImageIcon("./Png.calculator/buttondot.png"));

        buttondiv.setPreferredSize(new Dimension(100, 40));
        buttondiv.setIcon(new ImageIcon("./Png.calculator/buttondiv.png"));

        buttonequal.setPreferredSize(new Dimension(100, 40));
        buttonequal.setIcon(new ImageIcon("./Png.calculator/buttonequal.png"));

        buttonmul.setPreferredSize(new Dimension(100, 40));
        buttonmul.setIcon(new ImageIcon("./Png.calculator/buttonmul.png"));

        buttonclear.setPreferredSize(new Dimension(100, 40));
        buttonclear.setIcon(new ImageIcon("./Png.calculator/buttonclear.png"));

        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        buttonadd.addActionListener((ActionListener) this);
        buttonsub.addActionListener((ActionListener) this);
        buttonmul.addActionListener((ActionListener) this);
        buttondiv.addActionListener((ActionListener) this);
        buttondot.addActionListener((ActionListener) this);
        buttonclear.addActionListener((ActionListener) this);
        buttonequal.addActionListener((ActionListener) this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(buttondot);
        panel.add(buttondiv);
        panel.add(buttonequal);
        panel.add(buttonclear);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonclear) {
            number1 = 0.0;
            number2 = 0.0;
            textArea.setText("");
        }
        if (source == button1) {
            textArea.append("1");
        }
        if (source == button2) {
            textArea.append("2");
        }
        if (source == button3) {
            textArea.append("3");
        }
        if (source == button4) {
            textArea.append("4");
        }
        if (source == button5) {
            textArea.append("5");
        }
        if (source == button6) {
            textArea.append("6");
        }
        if (source == button7) {
            textArea.append("7");
        }
        if (source == button8) {
            textArea.append("8");
        }
        if (source == button9) {
            textArea.append("9");
        }
        if (source == button0) {
            textArea.append("0");
        }
        if (source == buttondot) {
            textArea.append(".");
        }
        if (source == buttonadd) {
            number1 = number_reader();
            textArea.setText("+");
            addc = 1;
            subc = 0;
            mulc = 0;
            divc = 0;
        }
        if (source == buttonsub) {
            number1 = number_reader();
            textArea.setText("");
            addc = 0;
            subc = 1;
            mulc = 0;
            divc = 0;
        }
        if (source == buttonmul) {
            number1 = number_reader();
            textArea.setText("");
            addc = 0;
            subc = 0;
            mulc = 1;
            divc = 0;
        }
        if (source == buttondiv) {
            number1 = number_reader();
            textArea.setText("");
            addc = 0;
            subc = 0;
            mulc = 0;
            divc = 1;
        }
        if (source == buttonequal) {
            number2 = number_reader();
            if (addc > 0) {
                result = number1 + number2;
                textArea.setText(Double.toString(result));
            }
            if (subc > 0) {
                result = number1 - number2;
                textArea.setText(Double.toString(result));
            }
            if (mulc > 0) {
                result = number1 * number2;
                textArea.setText(Double.toString(result));
            }
            if (divc > 0) {
                result = number1 / number2;
                textArea.setText(Double.toString(result));
            }
        }
    }

    public double number_reader() {
        double num1;
        String s = textArea.getText();
        if ( s != null && s.length() > 0 ) {
            num1 = Double.valueOf(s);
            return num1;

        }

        return 0;


    }
}