package View;

import raster.RasterBufferedImage;

import javax.swing.*;
import java.awt.*;
import raster.Raster;

public class Panel extends JPanel {

    private final Raster raster;

    public Panel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        raster = new RasterBufferedImage(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.drawImage(raster, 0, 0, null)
        ((RasterBufferedImage)raster).paint(g);
    }

    public Raster getRaster() {
        return raster;
    }

    public void clear(){
        raster.clear();
    }
}
