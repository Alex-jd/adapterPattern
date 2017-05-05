/**
 * 
 */
package adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author alex_jd
 *
 */
public class IterToEnumAdapter implements Enumeration {
	
	Iterator array;
	
	public IterToEnumAdapter (ArrayList array) {
		this.array = array.iterator();
	}

	@Override
	public boolean hasMoreElements() {
		return array.hasNext();
	}

	@Override
	public Object nextElement() {
		return array.next();
	}
	
	public void remove() {
		array.remove();
	}

}
