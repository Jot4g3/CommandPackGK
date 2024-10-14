package br.edu.commandpack;

import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ComandoVoltarLocalMorte implements CommandExecutor {
    public static Map<UUID, Location> locais = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player jogador = (Player) sender;

            Location posicao = locais.get(jogador.getUniqueId());
            jogador.teleport(posicao);
            jogador.sendMessage("Teleportou! Feito por Kauã e JG.");
        }

        return true;
    }
}
