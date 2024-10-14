package br.edu.commandpack;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoAcampamento implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player){
            Player jogador = (Player) sender;
            World mundo = jogador.getWorld();

            Location acampamento = new Location(mundo, 249,66,-799);
            jogador.teleport(acampamento);
            jogador.sendMessage("Prontinho, no acampamento! Feito por JG.");
        }

        return true;
    }
}
