package OzlympicGame;

public class Swimmer extends Athletes{
	public Swimmer(String id, String name, int age, String state, double record, int points){
		  super(id, name, age, state, record, points);
	  }
	  
	  public void Compete(){
		  //Random a record here
		  int Min = 100;
		  int Max = 200;
		  super.setRecord(super.randomRecord(Min, Max));
	  };
}
