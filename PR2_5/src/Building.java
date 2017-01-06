import java.util.ArrayList;
public class Building {
	private ArrayList<String> buildings = new ArrayList<String>();
	
	public void addBuilding(String name){
		buildings.add(name);
	}
	
	public void showBuilding(){
		for(String b:buildings)
			System.out.printf("%s\n", b);
	}
}
