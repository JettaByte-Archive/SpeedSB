package jettabyte.speedsbnip;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BlockEvent extends JavaPlugin implements Listener{

    int breaknom = 0;

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        breaknom =+ 1;
        Player p = e.getPlayer();
        System.out.println(ChatColor.GOLD + "블럭 이벤트 감지");
        p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 99999, breaknom));
        System.out.println(ChatColor.GOLD + "정상적으로 포션 효과 지급 완료.");
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        breaknom =+ 1;
        Player p = e.getPlayer();
        System.out.println(ChatColor.GOLD + "블럭 이벤트 감지");
        p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 99999, breaknom));
        System.out.println(ChatColor.GOLD + "정상적으로 포션 효과 지급 완료.");
    }

}
