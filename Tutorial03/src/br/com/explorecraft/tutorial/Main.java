package br.com.explorecraft.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Plugin Tutorial] Plugin ativado!");
		getServer().getPluginManager().registerEvents(new Eventos(), this);
		
	}
	
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Plugin Tutorial] Plugin desativado");
		
		
		
		
	}

}
