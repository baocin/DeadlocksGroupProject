/*
 * Name: Michael Pedersen
 * Group: 7
 * Date: 10/27/15
 */

/*
 * This class represents a process that is acquiring resources.
 */
public class Resource {
	String name;
	public boolean isFree = true;
	
	//represents a resource locked by a process
	public void reserve(){
		isFree = false;
	}
	
	//to represent a process being freed from a process
	public void free(){
		isFree = true;
	}
	
}
