package xyz;

import java.util.*;

public class BFS {

	public static void main(String[] args) {
		Map<String,List<String>> house=new HashMap<>();
		
		house.put("Living Room", Arrays.asList("kitchen","bedroom","study room"));
		
		house.put("kitchen",Arrays.asList ("bathroom"));
		
		house.put("bedroom",Arrays.asList ("balcony"));
		
		house.put("study room", new ArrayList <>());
		
		house.put("bathroom",new ArrayList <>());
		
		house.put("balcony",new ArrayList <>());
		
		System.out.println("exploring the house using BFS starting from Living room:");
		bfs(house,"Living Room");
		
	  }
	public static void bfs(Map<String,List<String>>house,String startRoom) {
		Queue<String>queue=new LinkedList<>();
		Set<String> visited= new HashSet<>();
	
        queue.add(startRoom);
        visited.add(startRoom);
        
		while(!queue.isEmpty()){
			String currentRoom=queue.poll();
			System.out.println("visited"+currentRoom);
			
			for(String neighbor:house.get(currentRoom)) {
				if(!visited.contains(neighbor)) {
					 queue.add(neighbor);
				      visited.add(neighbor);
				      
				      
				   
					
				}
			}
			
		}
	}


}