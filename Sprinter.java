package OzlympicGame;

public class Sprinter extends Athletes{
  public Sprinter(String id, String name, int age, String state, double record, int points){
	  super(id, name, age, state, record, points);
  }
  
  public void Compete(){
	  //Random a record here
	  int Min = 10;
	  int Max = 20;
	  super.setRecord(super.randomRecord(Min, Max));
  };
}
