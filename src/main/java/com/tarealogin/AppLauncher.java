package com.tarealogin;

import com.tarealogin.view.Login;

import java.awt.*;

public class AppLauncher {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
            KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
        });
    }
}