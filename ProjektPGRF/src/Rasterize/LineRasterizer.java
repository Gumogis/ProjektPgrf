package Rasterize;

import Models.BoldLine;
import Models.Line;

import raster.Raster;

public abstract class LineRasterizer {
    protected final Raster raster;
    protected int color;

    public LineRasterizer(Raster raster) {
        this.raster = raster;
        color = 0xff0000;
    }

    public LineRasterizer(Raster raster, int color) {
        this.raster = raster;
        this.color = color;
    }

    public void drawLine(Line line){ System.out.println("New line"); }

    public void drawBoldLine(BoldLine line) { System.out.println("new BoldLine");}
}
