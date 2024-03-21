package com.Jyothi.cls;

/*@author:Jyothi
 * 
 */
public class Shape {
	private String shapename;
	public Shape(String shapename)
	{
		this.shapename=shapename;
	}
	public String getShapename() {
		return shapename;
	}

	public void setShapename(String shapename) {
		this.shapename = shapename;
	}
	@Override
	public int hashCode()
	{
		return shapename.hashCode();
	}
	public boolean equals(Object obj)
	{
		return shapename.hashCode()==((Shape)obj).hashCode();
	}
	
}
