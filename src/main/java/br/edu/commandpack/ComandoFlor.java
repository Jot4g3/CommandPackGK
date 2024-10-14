package br.edu.commandpack;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class ComandoFlor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Random gerador = new Random();

        if (sender instanceof Player) {
            Player jogador = (Player) sender;

            Block blocoOlhando = jogador.getTargetBlock(null, 5);

            Block blocoOlhandoSuperior = blocoOlhando.getRelative(BlockFace.UP);

            int intRandom = gerador.nextInt(11) + 1;

            if (blocoOlhando.getType() != Material.AIR && blocoOlhandoSuperior.getType() == Material.AIR){

                switch (intRandom) {
                    case 1:
                        blocoOlhandoSuperior.setType(Material.POPPY);
                        break;
                    case 2:
                        blocoOlhandoSuperior.setType(Material.DANDELION);
                        break;
                    case 3:
                        blocoOlhandoSuperior.setType(Material.BLUE_ORCHID);
                        break;
                    case 4:
                        blocoOlhandoSuperior.setType(Material.ALLIUM);
                        break;
                    case 5:
                        blocoOlhandoSuperior.setType(Material.AZURE_BLUET);
                        break;
                    case 6:
                        blocoOlhandoSuperior.setType(Material.RED_TULIP);
                        break;
                    case 7:
                        blocoOlhandoSuperior.setType(Material.ORANGE_TULIP);
                        break;
                    case 8:
                        blocoOlhandoSuperior.setType(Material.WHITE_TULIP);
                        break;
                    case 9:
                        blocoOlhandoSuperior.setType(Material.PINK_TULIP);
                        break;
                    case 10:
                        blocoOlhandoSuperior.setType(Material.OXEYE_DAISY);
                        break;
                    case 11:
                        blocoOlhandoSuperior.setType(Material.LILY_OF_THE_VALLEY);
                        break;
                }

                jogador.sendMessage("Uma flor para você! Feito por Kauã e JG.");

            }else{
                jogador.sendMessage("O lugar no qual você está tentando gerar uma flor é inválido, tente outra vez.");
            }


        }

        return true;
    }
}
