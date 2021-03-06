import java.awt.image. BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
/**
 * this is a class that load a image in to the project
 *
 * @author Hao Chen
 * @version 7/24/2019
 */
public class ImageLoader
{
    /**
     * load the image. 
     * @param path the path refer to the image.
     * @return the image
     */
    public static BufferedImage loadImage(String path){
        try {
		return ImageIO.read(ImageLoader.class.getResource(path));
	} catch (IOException e) {
		e.printStackTrace();
		System.exit(1);
	}
	return null;
    }
}
