package com.company.多态;

/**
 * Created by OKMAN on 2017/5/8.
 */
import static net.mindview.util.Print.*;

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    private Glyph g = new Glyph();
    RoundGlyph(int r) {
        //这里可能有一个隐藏的super();
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int length = 2;
    private int width = 4;
    RectangularGlyph(int l, int w) {
        length = l;
        width = w;
        print("RectangularGlyph.RectangularGlyph(), length = "
                + length + ", width = " + width);
    }
    void draw() {
        print("RectangularGlyph.draw(), length = " + length
                + ", width = " + width);
    }
}


public class T01 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(3, 6);
    }
}
