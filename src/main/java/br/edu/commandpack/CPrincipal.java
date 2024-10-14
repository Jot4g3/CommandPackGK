package br.edu.commandpack;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class CPrincipal extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands(){
        getCommand("generateFlower").setExecutor(new ComandoFlor());
        getCommand("backDeathLoc").setExecutor(new ComandoVoltarLocalMorte());
        getCommand("home").setExecutor(new ComandoCasa());
        getCommand("camping").setExecutor(new ComandoAcampamento());
    }

    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new OuvidinMorte(), this);
        getServer().getPluginManager().registerEvents(new OuvidinCama(), this);
    }
}
