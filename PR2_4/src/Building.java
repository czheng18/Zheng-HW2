
public class Building {
	private String building_name;
	private String address;
	
	public Building(String bn, String a){
		building_name = bn;
		address = a;
	}
	
	public void setname(String newname){
		building_name = newname;
	}
	public void setaddress(String newadress){
		address = newadress;
	}
	public String getname(){
		return building_name;
	}
	public String getaddress(){
		return address;
	}
}
