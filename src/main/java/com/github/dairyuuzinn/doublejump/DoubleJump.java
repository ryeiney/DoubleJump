package com.github.dairyuuzinn.doublejump;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DoubleJump  extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new MoveListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
