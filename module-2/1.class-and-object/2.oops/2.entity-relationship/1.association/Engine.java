public class Engine{
	private double cc;
	private int cylinderCount;
	private int hp;

	Engine(double cc,int cylinderCount, int hp){
        this.cc=cc;
        this.cylinderCount=cylinderCount;
        this.hp=hp;
	}

	public double getCc(){
		return cc;
	}

	public int getCylinderCount(){
		return cylinderCount;
	}

	public int getHp(){
		return hp;
	}

	public void displayEngineInfo(){
		System.out.println("Engine Details");
		System.out.println("---------------------");
		System.out.println("CC of Engine is: "+getCc());
		System.out.println("Engine Cylinder Count: "+getCylinderCount());
		System.out.println("Engine Horse Power is: "+getHp());
		System.out.println();
	}
}
