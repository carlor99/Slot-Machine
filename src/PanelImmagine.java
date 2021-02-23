import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImmagine extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image[] images = new Image[5];
	int imageIndex = 0;	
	
	public void fillImages() {
		int imgIdx = 0;		
		String[] nomiImg = {"7.jpg", "arancia.jpg", "bar.jpg", "banana.jpg", "cuore.jpg"};
		
		for(int i=0; i<5; i++) {
			URL image = getClass().getResource("/" + nomiImg[i]);
			ImageIcon imgIcon = new ImageIcon(image);
			images[imgIdx++] = imgIcon.getImage();				
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		fillImages();
		Image img = images[imageIndex];
		Graphics2D g2d = (Graphics2D) g;
	    int x = (this.getWidth() - img.getWidth(null)) / 2;
	    int y = (this.getHeight() - img.getHeight(null)) / 2;		
		g.drawImage(img,x,y,null);
	}
	
	public void setImageIndex(int imageIndex) {
		this.imageIndex = imageIndex;
		repaint();
	}	
}
