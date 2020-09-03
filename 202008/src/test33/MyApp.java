package test33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 */
public class MyApp {


    public static void main(String[] args) throws IOException {
        MyWin myWin = new MyWin();
        //设置默认关闭操作
        myWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MyWin extends JFrame implements ActionListener {

    JButton butt = new JButton("连接");
    JTextField text1 = new JTextField(10);
    JTextField text2 = new JTextField(10);
    JTextField text3 = new JTextField(10);

    MyWin() {
        super("Test33");
        Container con = getContentPane();
        //设置布局 -- 网格布局
        con.setLayout(new GridLayout(1, 3));
        //设置首选大小
        con.setPreferredSize(new Dimension(600, 50));
        con.add(text1);
        con.add(text2);
        con.add(butt);
        con.add(text3);
        //添加动作监听器
        butt.addActionListener(this);
        pack();
        //设置可见
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String a, b, c;
        a = text1.getText();
        b = text2.getText();
        c = a + b;
        if ("".equals(c)) {
            text3.setText("NULL");
        } else {
            text3.setText(c);
        }


    }
}