package Test;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil extends Frame
{
	public static Image GetImage(String path) {
		URL u = GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);
		} catch (Exception e) {
		}
		return img;
	}
}
