package login;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class login extends JFrame implements ActionListener{

JTextField username = new JTextField("username",15);

JPasswordField password = new JPasswordField("password" ,15);

JTextField captcha = new JTextField("Türkiye'nin Başkenti",15);

JButton login = new JButton("Login");

JLabel status = new JLabel("Status:Not logged in");

public login(){

super("Login:");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setSize(500,500);

GridBagLayout g = new GridBagLayout();

GridBagConstraints c = new GridBagConstraints();

setLayout(g);

c.gridx = 0;

c.gridy = 0;

add(username,c);

c.gridx = 0;

c.gridy = 1;

add(password,c);

c.gridx = 0;

c.gridy = 2;

add(captcha,c);

c.gridx = 0;

c.gridy = 3;

add(login,c);

c.gridx = 0;

c.gridy = 4;

add(status,c);

login.addActionListener(this);

setVisible(true);

}

public void actionPerformed(ActionEvent e) {

String user = username.getText();

String pass = password.getText();

String capt = captcha.getText();

if(user.equals("CemYucel") && pass.equals("1234") && capt.equals("ankara")){ status.setText("Status:Logged in");

}

else{ status.setText("Status:Password or Username is incorrect or blank");

}

}

public static void main(String[] args){

login l = new login();

}

}


