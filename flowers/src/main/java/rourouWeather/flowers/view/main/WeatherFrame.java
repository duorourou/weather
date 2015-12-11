package rourouWeather.flowers.view.main;

import rourouWeather.flowers.view.main.layer.BackgroundView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by xchou on 11/9/15.
 */
public class WeatherFrame extends JFrame {

    private Color bgColor;

    public WeatherFrame(String title, Color color, int width, int height) {
        super(title);
        bgColor = color;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.init();
    }

    private void init(){
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addPanel(JPanel panel, Object container){
        this.getContentPane().add(panel, container);
    }

    public static void main(String[] args) {

        WeatherFrame weatherFrame = new WeatherFrame("Weather", Color.LIGHT_GRAY, 400 , 120);

        BackgroundView bgView = new BackgroundView(null , "background_img.jpg");

        weatherFrame.addPanel(bgView, BorderLayout.CENTER);

        weatherFrame.setVisible(true);
    }

}
