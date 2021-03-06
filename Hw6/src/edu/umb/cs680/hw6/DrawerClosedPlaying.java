package edu.umb.cs680.hw6;

public class DrawerClosedPlaying implements State{

	private static DrawerClosedPlaying drawerClosedPlaying;
	
	private DrawerClosedPlaying() {};
	
	public static DrawerClosedPlaying getInstance(){
		if(drawerClosedPlaying==null)
			drawerClosedPlaying = new DrawerClosedPlaying ();
		return drawerClosedPlaying;
	}
	
	@Override
	public void openCloseButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.stop();
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}

	@Override
	public void playButtonPushed() {};

	@Override
	public void stopButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.stop();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}

	public static void main(String[] args) {
		System.out.println("DrawerClosedPlaying Class Successfully Run!!");
	}
}
