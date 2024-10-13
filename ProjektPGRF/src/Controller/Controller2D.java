package Controller;

import Models.BoldLine;
import Models.Line;
import Rasterize.LineRasterizer;
import Rasterize.LineRasterizerTrivial;
import View.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller2D {
    private final Panel panel;
    private LineRasterizer lineRasterizer;
    private Line line;
    private Point start;

    public Controller2D(Panel panel) {
        this.panel = panel;


        lineRasterizer = new LineRasterizerTrivial(panel.getRaster());

        initListeners();

        line = new Line(10,10,100,100);

        lineRasterizer.drawLine(line);

        for(int i = 50; i < 301; i ++){
            if(i%2==0) {
                panel.getRaster().setPixel(i, 50, 0xff0000);
            }else{
                panel.getRaster().setPixel(i, 50, 0x00ff00);
            }
            }


        panel.repaint();
        }

        private void initListeners(){

        // Listener pro první stisk v obou případech pro zapsání startovacího bodu
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                panel.clear();
                System.out.println("mousepressed");
                start = e.getPoint();
                lineRasterizer.drawLine(new Line(start.x,start.y,start.x,start.y));
                panel.repaint();
            }
        });

        // Listener pro levé tlačítko na nakreslení tenké čáry
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                panel.clear();
                Point p = e.getPoint();
                System.out.println(p);
                lineRasterizer.drawLine(new Line(start.x,start.y,p.x,p.y));
                panel.repaint();
                }
            }
        });

        // Listener pro pravé tlačítko pro vykreslení tlusté čáry
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                panel.clear();
                Point p = e.getPoint();
                lineRasterizer.drawBoldLine(new BoldLine(start.x,start.y,p.x,p.y));
                panel.repaint();
                }
            }
        });

        // Listener pro tlačítko C pro smazaní plátna
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_C){
                    panel.clear();
                    panel.repaint();
                }
            }
        });
        }
    }
