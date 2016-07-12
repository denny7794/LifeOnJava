package x.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denis on 12.07.2016.
 */
public class MainWindow extends JFrame{

    public MainWindow() throws Exception{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(50, 50, 500, 500);

        this.add(new Map());

        setVisible(true);
    }



}
