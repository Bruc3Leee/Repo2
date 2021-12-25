package Lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm() throws HeadlessException {
        super.setTitle("Calculator v 1.0");
        setBounds(1650, 20, 250, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH);
        add(createButton(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        menu.add(new JMenuItem("Clear"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());

        return menuBar;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        return top;
    }

    private JPanel createButton() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        //DIGITS
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));
        ActionListener buttonListener = new ButtonListener(inputField);

        for (int i = 1; i <= 10; i++) {
            String buttonTitle = (i == 10) ? "0" : String.valueOf(i);
            JButton btn = new JButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new JButton("=");
        String one = "10+15*20-5/5";
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

        calc.addActionListener(e -> {
            try {
                scriptEngine.eval(inputField.getText());
            } catch (ScriptException ex) {
                //
            }
        });
        digitsPanel.add(calc);

        JButton clear = new JButton("C");
        clear.addActionListener(e -> inputField.setText(""));
        digitsPanel.add(clear);

        bottom.add(digitsPanel, BorderLayout.CENTER);
        //OPERATORS

        JPanel advPanel = new JPanel();
        advPanel.setLayout(new GridLayout(4, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        advPanel.add(plus);

        JButton split = new JButton("/");
        split.addActionListener(buttonListener);
        advPanel.add(split);

        JButton mlp = new JButton("*");
        mlp.addActionListener(buttonListener);
        advPanel.add(mlp);

        bottom.add(advPanel, BorderLayout.WEST);


        return bottom;


    }
}
