package just.Justyce;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public static Main plugin;
	private static final Logger log = Logger.getLogger("Minecraft");
	public String name= "[iBuild]";
	public String build =" BUILD #7 ";
	
	public void onDisable() {
		log.info(name+build+"has been disabled");
		
	}
	
	public void onEnable() {
    	  log.info(name+build+"has been enabled");
		}
	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    	Player p=((Player)sender);
	    	if(commandLabel.equalsIgnoreCase("build") && p!= null){
	    		if(args.length==2)
	    		{
	    		Location loc =p.getLocation();
	    		World w =p.getWorld();
	    		String cmd1 = args[2];
	        			House.BuildaHouse(loc, w);
	        			p.sendMessage("Succesfully build a house !");
	    		return true;
	    		 }
	    	return true;
	    	}
	    return false;
	    	

	    }
		
	
}
