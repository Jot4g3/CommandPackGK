package br.edu.commandpack;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedEnterEvent.BedEnterResult;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class OuvidinCama implements Listener {

    @EventHandler
    public void entrouNaCama(PlayerBedEnterEvent e) {
        Player jogador = e.getPlayer();
        String nome = jogador.getName();
        World mundo = jogador.getWorld();
        long horario = mundo.getTime();

        BedEnterResult resultado = e.getBedEnterResult();

        switch (resultado) {
            case NOT_POSSIBLE_NOW:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Que pena, &a"+nome+"&r, você ainda não pode dormir! Espera mais um pouco.")));
                break;
            case NOT_SAFE:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Xiii, &a"+nome+"&r... Tem uns babaus por perto! Dá uma matada neles aí e pode ir pro soninho da beleza.")));
                break;
            case TOO_FAR_AWAY:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Ow, &a"+nome+"&r, dá uma chegada mais perto da caminha, por favor!")));
                break;
            case NOT_POSSIBLE_HERE:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Eita, &a"+nome+"&r, você não pode tirar um cochilo aqui...")));
                break;
            case OTHER_PROBLEM:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Tem algum bucho impedindo você de tirar uma pestana &a"+nome+"&r, e agora?")));
                break;
            case OK:
                jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Boa noite e bons sonhos, &a"+nome+"&r!")));
                if (temAcordados(mundo, jogador)) {
                    jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Então, &a"+nome+"&r, peça a estes amigos para dormirem também:")));
                    List<String> jogadoresAcordados = pegarAcordados(mundo, jogador);
                    for (String acordado : jogadoresAcordados) {
                        jogador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9"+acordado));
                    }
                }
                break;
            default:
                jogador.sendMessage("Algo de errado não está certo...");
                break;
        }
    }

    @EventHandler
    public void saiuDaCama(PlayerBedLeaveEvent e) {
        Player jogador = e.getPlayer();
        String nome = jogador.getName();
        World mundo = jogador.getWorld();
        long horario = mundo.getTime();

        if(isNight(horario)){
            jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Eii, &a"+nome+"&r! Ainda não é hora de se levantar, apressadim.")));
        }
        else{
            jogador.sendMessage((ChatColor.translateAlternateColorCodes('&',"Bom dia, &a"+nome+"&r! Tenha um ótimo dia.")));
        }
    }

    private boolean temAcordados(World mundo, Player p) {
        List<String> jogadoresAcordados = pegarAcordados(mundo, p);
        //Se jogadoresAcordados não está vazia, temAcordados!
        return !jogadoresAcordados.isEmpty();
    }

    private List<String> pegarAcordados(World mundo, Player p) {
        List<Player> jogadoresNoMundo = mundo.getPlayers();
        List<String> jogadoresAcordados = new ArrayList<>();

        for (Player jogador : jogadoresNoMundo) {
            if (!jogador.isSleeping() && !jogador.isDead()) {
                if (jogador.getUniqueId() != p.getUniqueId())
                    jogadoresAcordados.add(jogador.getName());
            }
        }

        return jogadoresAcordados;
    }

    private boolean isNight(long horario) {
        return horario >= 12542 && horario <= 23458;
    }
}
