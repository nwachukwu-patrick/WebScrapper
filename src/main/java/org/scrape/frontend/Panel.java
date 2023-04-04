package org.scrape.frontend;

import org.jsoup.select.Elements;
import org.scrape.backend.Scrapper;

import javax.lang.model.element.Element;
import javax.swing.*;

import java.awt.*;

public class Panel extends JPanel {
    JLabel textLabel = new JLabel();
    JTextArea textArea = new JTextArea();

    Scrapper scrapper;
    Panel(){
//        textLabel.
        textArea.setLineWrap(true);
scrapper = new Scrapper("http://localhost/a.html");
        this.setBackground(Color.white);
        this.setLayout(new FlowLayout());
        java.util.List <String> tagText = scrapper.getTags("div");
        for(String x : tagText){
            this.add(new JLabel(x));
        }

        this.add(textArea);

    }
    public void paintComponents(Graphics g){
        super.paintComponents(g);
    }
}
