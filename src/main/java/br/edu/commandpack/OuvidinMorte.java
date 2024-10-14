package br.edu.commandpack;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OuvidinMorte implements Listener {
    @EventHandler
    public void morreu(PlayerDeathEvent e) {
        Player jogador = e.getEntity();
        Location localDeMorte = jogador.getLocation();
        ComandoVoltarLocalMorte.locais.put(jogador.getUniqueId(), localDeMorte);
    }
}
