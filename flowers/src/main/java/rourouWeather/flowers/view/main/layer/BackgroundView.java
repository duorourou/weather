package rourouWeather.flowers.view.main.layer;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;

import static java.awt.BorderLayout.*;

/**
 * Created by xchou on 11/10/15.
 */
public class BackgroundView extends JPanel {
    private Image image = null;

    private JLabel left;
    private JLabel right;
    private BackgroundView bgView = this;

    public BackgroundView(Color bgColor, String bgImage) {
        initAll(bgColor, bgImage);
    }

    private void initAll(Color bgColor, String bgImage) {
        initView(bgColor, bgImage);
        initListeners();
    }

    private void initView(Color bgColor, String bgImage) {
        if (bgImage != null) {
            this.image = new ImageIcon(BackgroundView.class.getResource("/").getPath() + "images/" + bgImage).getImage();
        } else {
            this.setBackground(bgColor);
        }
        initWeatherPanel();
    }

    private void initWeatherPanel(){
        left = new JLabel("LEFT");
        left.setPreferredSize(new Dimension(100 , 105));
        left.setBorder(new LineBorder(Color.red,4));
        left.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showConfirmDialog(null,  bgView.getWidth() , "len", JOptionPane.YES_NO_OPTION);
            }
        });
        right = new JLabel("RIGHTRIGHTRIGHTRIGHTRIGHTRIGHT");
        right.setPreferredSize(new Dimension(300 , 105));
        right.setBorder(new LineBorder(Color.BLUE,6));
        this.setLayout(new FlowLayout(0 , 0 , 0));
        this.add(left);
        this.add(right);
    }

    private void initListeners() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}