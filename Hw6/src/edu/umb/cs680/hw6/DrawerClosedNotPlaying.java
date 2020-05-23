package edu.umb.cs680.hw6;

public class DrawerClosedNotPlaying implements State {
	
	private static DrawerClosedNotPlaying drawerClosedNotPlaying;
	
	private DrawerClosedNotPlaying() {};
	
	public static DrawerClosedNotPlaying getInstance(){
		if(drawerClosedNotPlaying==null)
			drawerClosedNotPlaying = new DrawerClosedNotPlaying ();
		return drawerClosedNotPlaying;
	}
	
	@Override
	public void openCloseButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}

	@Override
	public void playButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.play();
		player.changeState(DrawerClosedPlaying.getInstance());
	}

	@Override
	public void stopButtonPushed() {};
	
	public static void main(String[] args) {
		System.out.println("DrawerClosedNotPlaying Class Successfully Run!!");
	}
}
