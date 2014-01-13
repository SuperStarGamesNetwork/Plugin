package com.gmail.cloudcraftplaysmc;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SuperStarGames extends JavaPlugin{
    @Override
    public void onEnable(){
    	
    
for (Player player : this.getServer().getOnlinePlayers()) {
playerList.put(player, playerData(player));
    	}
    }
 


	@Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked!");
    }
      	
}
