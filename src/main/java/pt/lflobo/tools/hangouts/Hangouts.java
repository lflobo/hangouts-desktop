package pt.lflobo.tools.hangouts;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;

public class Hangouts extends JFrame {

    public Hangouts() throws HeadlessException {
        super("Hangouts");

        Browser browser = new Browser();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new BrowserView(browser), BorderLayout.CENTER);
        setSize(800, 600);
        browser.loadURL("https://hangouts.google.com");
    }

    public static void main(String[] args) {
        new Hangouts().setVisible(true);
    }

}
