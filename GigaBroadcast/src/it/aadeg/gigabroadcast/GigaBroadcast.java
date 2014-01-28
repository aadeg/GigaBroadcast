package it.aadeg.gigabroadcast;

import org.bukkit.plugin.java.JavaPlugin;

public class GigaBroadcast extends JavaPlugin{
		
	@Override
	public void onEnable(){
		this.saveDefaultConfig();
		this.getCommand("bc").setExecutor(new CmdExecutor());
	}
	
	@Override
	public void onDisable(){
		
	}

}
