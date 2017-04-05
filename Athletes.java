package OzlympicGame;

public abstract class Athletes {
  //private instance variables
  private String id;
  private String name;
  private int age;
  private String state;
  private double record;
  private int points;
  //The constructor
  public Athletes(String id, String name, int age, String state, double record, int points){
	  this.id = id;
	  this.name = name;
	  this.age = age;
	  this.state = state;
	  this.record = record;
	  this.points = points;
  }
  
  
  //methods
  public String getId(){
	  return this.id;
  }
  public String getName(){
	  return this.name;
  }
  public int getAge(){
	  return this.age;
  }
  public String getState(){
	  return this.state;
  }
  public double getRecord(){
	  return this.record;
  }

  public void setRecord(double record){
	  this.record = record;
  }
  public int getPoint(){
	  return this.points;
  }
  public abstract void Compete();
  
  public int randomRecord(int Min, int Max){
	  if(Min != 0)
		  return (Min + (int)(Math.random() * ((Max - Min))));
	  else
		  return 0;

  }
}