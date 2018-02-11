package br.com.explorecraft.tutorial;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.md_5.bungee.api.ChatColor;


public class Eventos implements Listener{
	
	
	@EventHandler
	public void onBlockBreak (BlockBreakEvent e) {		
		
		Player p = e.getPlayer();
		
		p.sendMessage(ChatColor.AQUA + "Você quebrou um bloco !");
		
		
		
	}
	
	
	

}
