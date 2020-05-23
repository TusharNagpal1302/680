package edu.umb.cs680.hw6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DVDPlayerTest {

	@Test
	void checkDVDPlayer() {
		DVDPlayer player = DVDPlayer.getInstance();
		State expected = null;
		
		//Initial Instance DrawerClosedNotPlaying
		expected = DrawerClosedNotPlaying.getInstance();
		assertSame(expected, player.getState());
		
		//Change State from DrawerClosedNotPlaying to DrawerOpen
		player.openCloseButtonPushed();
		expected = DrawerOpen.getInstance();
		assertSame(expected, player.getState());
		assertEquals(true, player.isDrawerOpen());
		assertEquals(false, player.isDrawerPlaying());
		
		//Change State from DrawerOpen to DrawerClosedPlaying
		player.playButtonPushed();
		expected = DrawerClosedPlaying.getInstance();
		assertSame(expected, player.getState());
		assertEquals(false, player.isDrawerOpen());
		assertEquals(true, player.isDrawerPlaying());
		
		//Change State from DrawerClosedPlaying to DrawerClosedNotPlaying
		player.stopButtonPushed();
		expected = DrawerClosedNotPlaying.getInstance();
		assertSame(expected, player.getState());
		assertEquals(false, player.isDrawerOpen());
		assertEquals(false, player.isDrawerPlaying());
		
		//When Stop pressed in DrawerClosedNotPlaying don't change state
		player.stopButtonPushed();
		expected = DrawerClosedNotPlaying.getInstance();
		assertSame(expected, player.getState());
		
		//Change State from DrawerClosedNotPlaying - DrawerClosedPlaying - DrawerOpen
		player.playButtonPushed();
		player.openCloseButtonPushed();
		expected = DrawerOpen.getInstance();
		assertSame(expected, player.getState());
		
		//Change State from DrawerOpen - DrawerClosedPlaying - DrawerClosedNotPlaying
		player.openCloseButtonPushed();
		player.stopButtonPushed();
		expected = DrawerClosedNotPlaying.getInstance();
		assertSame(expected, player.getState());
	}

}
