package com.tarealogin.view;

import com.tarealogin.controller.PersonController;
import com.tarealogin.controller.UserController;
import com.tarealogin.model.PersonEntity;
import com.tarealogin.model.UserEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

    // componentes
    private JPanel contentPane, barPane;
    private JPanel panelButtonClose, panelButtonLogin;
    private JSeparator userSeparatpr, passwordSeparator;
    private JLabel userLabel, passwordLabel, titleLabel, loginLabel, closeLabel, dummyFocus;
    private JTextField userTextField;
    private JPasswordField passwordField;

    // variable
    private int xMouse, yMouse;

    private UserController userCtrl;
    private PersonController personCtrl;


    public Login() {
        userCtrl = new UserController();
        personCtrl = new PersonController();
        components();
        setLocationRelativeTo(null);
    }

    private void components() {
        contentPane = new JPanel();
        barPane = new JPanel();

        panelButtonClose = new JPanel();
        panelButtonLogin = new JPanel();

        userSeparatpr = new JSeparator();
        passwordSeparator = new JSeparator();

        userLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        titleLabel = new JLabel("BIENVENIDO");
        loginLabel = new JLabel("Iniciar Sesion");
        closeLabel = new JLabel("X");
        dummyFocus = new JLabel();

        userTextField = new JTextField();
        passwordField = new JPasswordField();

        ///
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        // design
        dummyFocus.setFocusable(true);
        contentPane.add(dummyFocus);
        dummyFocus.requestFocusInWindow();

        contentPane.setBackground(new Color(255, 255, 255));
        panelButtonLogin.setBackground(new Color(66, 165, 245));

        loginLabel.setForeground(new Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        userTextField.setForeground(new Color(204, 204, 204));
        userTextField.setHorizontalAlignment(JTextField.CENTER);
        userTextField.setText("Ingrese su usuario");
        userTextField.setBorder(null);

        passwordField.setForeground(new Color(204, 204, 204));
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        passwordField.setText("*****************");
        passwordField.setBorder(null);

        userLabel.setHorizontalAlignment(SwingConstants.CENTER);

        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);

        titleLabel.setFont(new Font("Gill Sans MT", 0, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        barPane.setBackground(new Color(66, 165, 245));

        panelButtonClose.setBackground(null);

        closeLabel.setFont(new Font("Segoe UI", 0, 18));
        closeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        closeLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        GroupLayout panelButtonLoginLayout = new GroupLayout(panelButtonLogin);
        panelButtonLogin.setLayout(panelButtonLoginLayout);
        panelButtonLoginLayout.setHorizontalGroup(panelButtonLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE));
        panelButtonLoginLayout.setVerticalGroup(panelButtonLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 27,Short.MAX_VALUE));

        GroupLayout panelButtonCloseLayout = new GroupLayout(panelButtonClose);
        panelButtonClose.setLayout(panelButtonCloseLayout);
        panelButtonCloseLayout.setHorizontalGroup(panelButtonCloseLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(closeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE));
        panelButtonCloseLayout.setVerticalGroup(panelButtonCloseLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(closeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE));

        GroupLayout barPaneLayout = new GroupLayout(barPane);
        barPane.setLayout(barPaneLayout);
        barPaneLayout.setHorizontalGroup(barPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, barPaneLayout.createSequentialGroup().addGap(0,0,Short.MAX_VALUE).addComponent(panelButtonClose, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
        barPaneLayout.setVerticalGroup(barPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panelButtonClose, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(75,75,75)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(panelButtonLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordField)
                                        .addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordSeparator, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userSeparatpr, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(84, Short.MAX_VALUE))
                        .addComponent(barPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contentPaneLayout.setVerticalGroup(
          contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                  .addGroup(GroupLayout.Alignment.TRAILING,contentPaneLayout.createSequentialGroup()
                          .addComponent(barPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                          .addComponent(titleLabel)
                          .addGap(69, 69, 69)
                          .addComponent(userLabel)
                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                          .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                          .addComponent(userSeparatpr, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                          .addGap(11,11,11)
                          .addComponent(passwordLabel)
                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                          .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                          .addComponent(passwordSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                          .addGap(31,31,31)
                          .addComponent(panelButtonLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                          .addGap(95,95,95))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(contentPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(contentPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();

        // related metod with compenent

        loginLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                loginLabelMouseCLicked(e);
            }
            public void mouseEntered(MouseEvent e) {
                loginLabelMouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                loginLabelMouseExited(e);
            }
        });

        closeLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                closeLabelMouseClicked(e);
            }
            public void mouseEntered(MouseEvent e) {
                closeLabelMouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                closeLabelMouseExited(e);
            }
        });

        userTextField.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                userLabelMousePressed(e);
            }
        });

        passwordField.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                passwordFielsMousePressed(e);
            }
        });

        barPane.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                barPanelMousePressed(e);
            }
        });

        barPane.addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                barPanelMouseDragged(e);
            }
        });


    }

    private void loginLabelMouseEntered(MouseEvent e) {
        loginLabel.setFont(loginLabel.getFont().deriveFont(Font.BOLD));
        panelButtonLogin.setBackground(new Color(52, 152, 219));
    }

    private void loginLabelMouseExited(MouseEvent e) {
        loginLabel.setFont(loginLabel.getFont().deriveFont(Font.PLAIN));
        panelButtonLogin.setBackground(new Color(66, 165, 245));
    }

    private void loginLabelMouseCLicked(MouseEvent e) {

        Welcome welcome = new Welcome();

        String user = userTextField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (user.equals("Ingrese su usuario") || password.equals("*****************")) {
            JOptionPane.showMessageDialog(null,"Ingrese sus credenciales por  favor");
        } else {
            try {
                UserEntity userEntity = userCtrl.verifyCredential(user, password);
                if (userEntity != null) {
                    PersonEntity personEntity = personCtrl.getPersonById(userEntity.getId());

                    if (personEntity != null) {
                        String fullName = personEntity.getName() + " " + personEntity.getLast_name();

                        welcome.setNameLabel(fullName);
                    }

                    welcome.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al verificar las credenciales");
            }
        }

    }

    private void closeLabelMouseEntered(MouseEvent e) {
        panelButtonClose.setBackground(Color.red);
        closeLabel.setForeground(Color.white);
    }

    private void closeLabelMouseExited(MouseEvent e) {
        panelButtonClose.setBackground(null);
        closeLabel.setForeground(Color.black);
    }

    private void closeLabelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void userLabelMousePressed(MouseEvent e) {
        if (userTextField.getText().equals("Ingrese su usuario")) {
            userTextField.setText("");
            userTextField.setForeground(Color.black);
        }

        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("*****************");
            passwordField.setForeground(Color.gray);
        }
    }

    private void passwordFielsMousePressed(MouseEvent e) {
        if (String.valueOf(passwordField.getPassword()).equals("*****************")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }

        if (userTextField.getText().isEmpty()) {
            userTextField.setText("Ingrese su usuario");
            userTextField.setForeground(Color.gray);
        }
    }

    private void barPanelMousePressed(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }

    private void barPanelMouseDragged(MouseEvent e) {
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

}
