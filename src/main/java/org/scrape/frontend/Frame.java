package org.scrape.frontend;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Frame(){
        this.setTitle("WebScrapper");
        this.add(new Panel());
        this.setSize(this.getMaximumSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
