package it.aadeg.gigabroadcast;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdExecutor implements CommandExecutor{

	public static List<String> help = new ArrayList<String>();
	
	static {
		help.add("GigaBroadcast v. 1.0");
		help.add("<>: required parameter; []: optional parameter");
		help.add("- /bc <message>   Sends a broadcast message");
		help.add("- /bc list   Shows all the auto broadcast messages");
		help.add("- /bc add [multipler] <message>   Adds a message in the auto broadcast queue");
		help.add("- /bc remove <id>   Removes the specified message");
		help.add("- /bc disable   Disables auto broadcast");
		help.add("- /bc disable <id>   Disables the specified message");
		help.add("- /bc multipler <id> <multipler>   Changes the multipler of a message");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (args.length < 1){
			
		}
		
		return false;
	}

}
