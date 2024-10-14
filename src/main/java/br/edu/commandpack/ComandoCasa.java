package br.edu.commandpack;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoCasa implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player){
            Player jogador = (Player) sender;
            World mundo = jogador.getWorld();

            Location casa = new Location(mundo, 680,71,463);
            jogador.teleport(casa);
            jogador.sendMessage("Prontinho, em casa! Feito por JG.");
        }

        return true;
    }
}
