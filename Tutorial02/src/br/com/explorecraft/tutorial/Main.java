package br.com.explorecraft.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Nosso plugin esta ativado!");
		
		getLogger().info("Mensagem info");
		
		getLogger().warning("Mensagem de Aviso");
		
		
		
	}
	
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Nosso plugin está desativado!");
		
		
		
		
	}

}
