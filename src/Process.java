/*
 * Name: Michael Pedersen
 * Group: 7
 * Date: 10/27/15
 */

import java.util.ArrayList;
import java.util.List;

/*
 * This class represents a process that is acquiring resources.
 */
public class Process {
	List<Resource> reservedResources;
	
	public Process(){
		reservedResources = new ArrayList<Resource>();
	}
	
	public void reserveResource(Resource r){
		if (r.isFree){
			reservedResources.add(r);
			r.reserve();
		}else{
			System.out.println("Cannot reserve resource named: " + r.name);
		}
	}
}
