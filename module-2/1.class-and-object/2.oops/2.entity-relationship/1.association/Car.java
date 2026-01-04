public class Car{

	private String brand;
	private String madeIn;
	private double price;
	private String color;



	//Car HAS-A Engine

	//this is also dependency injection-by constructor but it is informal way
	// private Engine engine = new Engine(1200,4,1200);

////this is also dependency injection-by constructor but it is formal way
	private Engine engine;
		public Car(String brand,String madeIn,double price,String color,Engine engine){
		this.brand=brand;
		this.madeIn=madeIn;
		this.price=price;
		this.color=color;
		this.engine=engine;

	}

	//Car HAS-A Media Playe
	private MediaPlayer mediaPlayer;

	public String getBrand(){
		return brand;
	}
	

	public String getMadeIn(){
		return madeIn;
	}
	

	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
    
    public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
   
   //Read Only
	public Engine getEngine(){
		return engine;
	}

    //read only
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}

    public void dissplayCarInfo(){
    	System.out.println("Brand is: "+getBrand());
    	System.out.println("Made in: "+getMadeIn());
    	System.out.println("Price is: "+getPrice());
    	System.out.println("Color is: "+getColor());

    }
}