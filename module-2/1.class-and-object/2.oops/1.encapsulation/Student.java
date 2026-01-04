public class Student{
	private int id;
	private String name;

    //getter method:-it is use to access private data member(variable) indirectly to achive encapsulation
	public  int getId(){
		return id;
	}
	//setter method:-it is use to access private data member(variable) indirectly to achive encapsulation
    public void setId(int id){
    	this.id=id;

    }

    public String getName(){
    	return name;
    }

    public void setName(String name){
    	this.name=name;
    }
}