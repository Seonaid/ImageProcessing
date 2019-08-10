import edu.duke.*;
/**
 * Imports a collection of images, converts each to grayscale and outputs new images
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrayScaleConverter {
    // import an image (inImage)
    public ImageResource makeGray(ImageResource inImage){
    // Make a blank image the same size for output
    ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
    // For each pixel in the outImage
    for (Pixel pixel : outImage.pixels()){
        // look at corresponding pixel in inImage
        Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
        // compute average of the RGB pixel intensity
        int averageIntensity = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
        // set all three RGB pixels to the average of the three pixels
    }
    return outImage;    
    } 
}
