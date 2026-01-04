class JavaApplication{
	public static void execute(){

		//dependency injection-by constructor
		Engine engine=new Engine(1200,4,1000);
		Car car=new Car("Hyundai-Creta","India",1278453,"Crimson",engine);


		MediaPlayer mediaPlayer=new MediaPlayer("Boat","India",234535.9836);
		car.dissplayCarInfo();
		car.getEngine().displayEngineInfo();

		//dependency injection-by setter method
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerInfo();

	}

}