package OzlympicGame;

public class SuperAthlete extends Athletes{
	private int game;
	public SuperAthlete(String id, String name, int age, String state, double record, int points,int game){
		  super(id, name, age, state, record, points);
		  this.game = game;
	  }
	  
	
	  public void Compete(){
		  //Random a record here
		  int Min,Max;
		  switch(this.game){
		  	case 1:
		  		Min = 10;
		  		Max = 20;
		  		break;
		  	case 2:
		  		Min = 100;
		  		Max = 200;
		  		break;
		  	case 3:
		  		Min = 500;
		  		Max = 800;
		  		break;
		  	default:
		  		Min = 0;
		  		Max = 0;
		  		break;
		  }
			  
		  super.setRecord(super.randomRecord(Min, Max));
	  };
}
