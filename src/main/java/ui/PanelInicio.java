package ui;
import dao.ActivityDAO;
import dao.ReservaDAO;
import domain.Actividad;
import domain.Reserva;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 * Clase para crear el panel que se implementará en la ventana de Login
 */
public class PanelInicio extends JPanel{

    private Dimension dimension = new Dimension(VentanaLogin.WINDOW_WIDTH, VentanaLogin.WINDOW_HEIGTH);
    public PanelInicio(){
        this.init();
    }

    public void init(){
        this.setBackground(new Color(30,46,64));
        this.setVisible(true);
        this.setPreferredSize(dimension);
        this.setLayout(null);
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRoundRect(100,100,800,500,50,50);


        try {
            Image img =  ImageIO.read(new File("src/main/java/resources/moneda.png"));
            g.drawImage(img,400,30,196,185,null);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}