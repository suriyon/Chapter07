package prepare;

public class Singer implements Entertainer, Musician {

	@Override
	public void playPiano() {
		// TODO Auto-generated method stub
		System.out.println("Singer can play piano");
	}
	@Override
	public void playGuitar() {
		// TODO Auto-generated method stub
		System.out.println("Singer can play guitar");
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Singer can sing a song");
	}
	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Singer can dance");
	}

}
