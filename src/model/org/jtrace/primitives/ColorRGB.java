package org.jtrace.primitives;
/**
 * Basic class to represent a color in RGB format.
 * 
 * @author raphaelpaiva
 * @author brunocosta
 * @author flaviocdc
 *
 */
public class ColorRGB {
	public static ColorRGB BLACK = new ColorRGB(0, 0, 0);
	public static ColorRGB RED   = new ColorRGB(255, 0, 0);
	public static ColorRGB GREEN = new ColorRGB(0, 255, 0);
	public static ColorRGB BLUE  = new ColorRGB(0, 0, 255);
	
    private int r, g, b;

    /**
     * Create a color from its components values.
     * 
     * @param r red component
     * @param g green component
     * @param b blue component
     */
    public ColorRGB(final int r, final int g, final int b) {
        super();
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public int toInt() {
    	int rgb = r;
    	rgb = (rgb << 8) + g;
    	rgb = (rgb << 8) + b;
    	
    	return rgb;
    }

    public int getR() {
        return r;
    }

    public void setR(final int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(final int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(final int b) {
        this.b = b;
    }
}