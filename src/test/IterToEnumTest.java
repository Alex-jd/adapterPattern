/**
 * 
 */
package test;

import java.util.ArrayList;

import adapter.IterToEnumAdapter;

/**
 * @author alex_jd
 *
 */
public class IterToEnumTest {
	
	public static void main (String[] args) {
		ArrayList array = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			array.add(i);
		}
		
		IterToEnumAdapter enumArray = new IterToEnumAdapter(array);
		
		/*while (enumArray.hasMoreElements()) {
			//System.out.println("First while " + enumArray.nextElement());
		}*/
		
		while (enumArray.hasMoreElements()) {
			System.out.println("Second while " + enumArray.nextElement());
		}
		
		while (enumArray.hasMoreElements()) {
			Integer temp = (Integer) enumArray.nextElement(); 
			if (temp == 5 ) {
				enumArray.remove();
			}
			System.out.println(enumArray.nextElement());
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
	}

}
