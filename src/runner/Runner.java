package runner;

import sun.applet.Main;
import x.gui.MainWindow;

/**
 * Created by Denis on 05.07.2016.
 */
public class Runner {

    public static void main(String[] args) {
        try {
            MainWindow mainWindow = new MainWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
