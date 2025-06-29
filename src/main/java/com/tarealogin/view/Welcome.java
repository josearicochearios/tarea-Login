package com.tarealogin.view;

import javax.swing.*;
import java.awt.*;

public class Welcome extends JFrame {

    private JPanel contentPanel;
    private JLabel greetingLabel, nameLabel;

    public Welcome() {
        components();
        setLocationRelativeTo(null);
    }

    private void components() {

        contentPanel = new JPanel();
        greetingLabel = new JLabel();
        nameLabel = new JLabel();

        greetingLabel.setFont(new Font("Segoe UI", 1, 24));
        greetingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        greetingLabel.setText("BIENVENIDO");
        greetingLabel.setAutoscrolls(true);

        nameLabel.setFont(new Font("Segoe UI", 0, 36));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(greetingLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
                                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(66,66,66)
                                .addComponent(greetingLabel)
                                .addGap(93,93,93)
                                .addComponent(nameLabel)
                                .addContainerGap(225,Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();

    }

    public void setNameLabel(String name) {
        nameLabel.setText(name);
    }

}
