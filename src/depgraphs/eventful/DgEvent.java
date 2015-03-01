/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.eventful;

import java.util.Objects;

/**
 *
 * @author Mat
 */
public class DgEvent  {
	String senderId;
	String eventId;
	Object data;
	
	public DgEvent() {}
	public DgEvent( String evName, Object sender, Object data) {
		eventId = evName;
		senderId = sender.getClass().getName();
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final DgEvent other = (DgEvent) obj;
		if (!Objects.equals(this.senderId, other.senderId)) {
			return false;
		}
		else if (!Objects.equals(this.eventId, other.eventId)) {
			return false;
		}
		else if (!Objects.equals(this.data, other.data)) {
			return false;
		}
		return true;
	}
	
}
