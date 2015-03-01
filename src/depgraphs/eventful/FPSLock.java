/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.eventful;

/**
 *
 * @author Mat
 */
public final class FPSLock {
	Integer fps;
	long delay;
	long lastTime;
	public FPSLock( int fps ) {
		this.fps = fps;
		delay = (long)Math.floor( 1000.0 / fps );
		ping();
	}
	
	public boolean ping() {
		if( System.currentTimeMillis() - lastTime >= delay ) {
			lastTime = System.currentTimeMillis();
			return true;
		}
		return false;
	}
	
}
