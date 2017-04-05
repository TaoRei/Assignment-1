package OzlympicGame;

public class Cyclist extends Athletes{
	public Cyclist(String id, String name, int age, String state, double record, int points){
		  super(id, name, age, state, record, points);
	  }
	  
	  public void Compete(){
		  //Random a record here
		  int Min = 500;
		  int Max = 800;
		  super.setRecord(super.randomRecord(Min, Max));
	  };
}
