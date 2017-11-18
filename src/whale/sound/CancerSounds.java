package whale.sound;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class CancerSounds{
	
	private String mp3Url; 
	
	public CancerSounds(String mp3String) {
		
		mp3Url = mp3String;		
	}
	
	
	public void play(){
		
		try {
			URL url = new URL(mp3Url);
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			
			Player player = new Player(is);
			
			player.play();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}