package edu.umb.cs680.hw6;

public class DVDPlayer {

	private static DVDPlayer player = null;
	private State state= null;
	private boolean drawerOpen = false;
	private boolean drawerPlaying = false;
	
	private DVDPlayer() {
		state = DrawerClosedNotPlaying.getInstance();
	}
	
	public static DVDPlayer getInstance(){
		if(player==null)
			player = new DVDPlayer ();
		return player;
	}
	
	public State getState() {
		return state;
	}

	public boolean isDrawerOpen() {
		return drawerOpen;
	}

	public boolean isDrawerPlaying() {
		return drawerPlaying;
	}

	public void changeState(State state) {
		this.state = state;
	}
	
	public void openCloseButtonPushed() {
		state.openCloseButtonPushed();
	}

	public void playButtonPushed() {
		state.playButtonPushed();
	}

	public void stopButtonPushed() {
		state.stopButtonPushed();
	}
	
	public void open() {
		if(drawerOpen)
			throw new IllegalStateException("Drawer in wrong open state!!");
		drawerOpen = true;
	}
	
	public void close() {
		if(!drawerOpen)
			throw new IllegalStateException("Drawer in wrong close state!!");
		drawerOpen = false;
	}
	
	public void play() {
		if(drawerPlaying)
			throw new IllegalStateException("Drawer in wrong playing state!!");
		drawerPlaying = true;
	}
	
	public void stop() {
		if(!drawerPlaying)
			throw new IllegalStateException("Drawer in wrong stop state!!");
		drawerPlaying = false;
	}
	
	public static void main(String[] args) {
		System.out.println("DVDPlayer Class Successfully Run!!");
	}
}
