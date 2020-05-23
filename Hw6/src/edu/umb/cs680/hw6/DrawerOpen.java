package edu.umb.cs680.hw6;

public class DrawerOpen implements State{
	
	private static DrawerOpen drawerOpen;
	
	private DrawerOpen() {};
	
	public static DrawerOpen getInstance(){
		if(drawerOpen==null)
			drawerOpen = new DrawerOpen ();
		return drawerOpen;
	}

	@Override
	public void openCloseButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.close();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}

	@Override
	public void playButtonPushed() {
		DVDPlayer player = DVDPlayer.getInstance();
		player.close();
		player.play();
		player.changeState(DrawerClosedPlaying.getInstance());
	}

	@Override
	public void stopButtonPushed() {};
	
	public static void main(String[] args) {
		System.out.println("DrawerOpen Class Successfully Run!!");
	}
}
