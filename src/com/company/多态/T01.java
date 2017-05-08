package com.company.多态;
class Glyph{
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyth() before draw()");
        draw();
        System.out.println("Glyth() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        super();
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
    }
    void draw(){
        System.out.println("RondGlyph.draw() , radius = "+ radius);
    }
}
class PolyConstructors{
    public static void main(String args[]) {
        new RoundGlyph(5);
    }
}
public class T01 {

}
