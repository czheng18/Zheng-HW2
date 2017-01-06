import java.util.ArrayList;
public class Building {
	private ArrayList<String>buildings = new ArrayList<String>();
	public void addBuildings(String name){
		buildings.add(name);
	}
	public void showbuidlings(){
		for(String b:buildings)
			System.out.printf("%s\n",b);
	}
}
