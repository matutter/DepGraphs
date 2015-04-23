/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.Eventful;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Optional;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mat
 */
public final class IconBtn extends Btn {

	private final static String ALT_TEXT = "_alt";
	private final static Dimension icon16x16 = new Dimension(16,16);
	
	Optional<ImageIcon> ico = Optional.empty();
	Optional<ImageIcon> alt = Optional.empty();
	private boolean autoToggle = true;
	private boolean active = true;
	
	public IconBtn(String id, String s, Eventful parent) {
		super(id, s, parent);
		
		ico = getIco(s);
		if( id != null )
			alt = getIco(s.replace(".", ALT_TEXT+".")); 
		
		ico.ifPresent(this::setIcon);
		
		setSize( icon16x16 );
	}
	
	@Override
	public void setText(String text) {}
	
	@Override
	public void altSwap() {
		if( autoToggle )
			doSwap();
	}
	
	public void setActive(boolean b) {
		if( active != b )
			doSwap();
	}
	
	private void doSwap() {
		alt.ifPresent(ico2->{
			alt = ico;
			ico = Optional.of( ico2 );
		});
		ico.ifPresent(this::setIcon);
		active = !active;
	}
	
	public Optional<ImageIcon> getIco(String s) {
		ImageIcon icon = null;
		try {
			URL en = ClassLoader.getSystemResource("depgraphs/ui/style/"+s);
			icon = new ImageIcon( en );
		} catch( Exception ex ){
			System.err.println("Cannot find "+s);
		}
		return Optional.ofNullable(icon);
	}

	IconBtn setAutoToggle(boolean b) {
		this.autoToggle = b;
		return this;
	}
	
}
