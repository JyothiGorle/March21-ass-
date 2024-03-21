package com.Jyothi.p1;
import com.Jyothi.cls.Shape;
import java.util.*;
/*Pojo Equality: Create a Pojo(Plain Old Java Object) Shape. Create a HashSet and store the 
 * unique Pojo in the application. Use Override methods to do this.
 */

/*@author:Jyothi
 * 
 */
public class Jyothi_Prog1 {
	public static void main(String[] args) {
		HashSet<Shape>hs=new HashSet<>(); 
		hs.add(new Shape("square"));
		hs.add(new Shape("rectangle"));
		hs.add(new Shape("rectangle"));	
		hs.add(new Shape("Triangle"));
		hs.add(new Shape("square"));
		for(Shape ob:hs)
		{
			System.out.println(ob.getShapename());
		}
	}
}
