package fr.kaplone.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import app.Main_SITM_GDX;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "test GDX";
	    config.width = 620;
	    config.height = 395;
	    
	    System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");
	    
		new LwjglApplication(new Main_SITM_GDX(), config);
	}
}
