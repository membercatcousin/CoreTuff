package org.voxelware.coretuff.procedures;

import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Entity; // You were missing this import!
import org.bukkit.ChatColor;

public class InvincibleLogicProcedure {
    public static void execute(Entity entity) {
        // Water's Advice: Safety check so the plugin doesn't crash
        if (entity == null) return;

        if (entity instanceof LivingEntity _entity) {
            // TOGGLE LOGIC
            if (_entity.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)) {
                _entity.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
                _entity.sendMessage(ChatColor.GOLD + "Invincibility " + ChatColor.RED + "disabled" + ChatColor.GOLD + ".");
            } else {
                // RAW METHOD - RESISTANCE 255
                _entity.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 255, false, false));
                _entity.sendMessage(ChatColor.GOLD + "Invincibility " + ChatColor.GREEN + "enabled" + ChatColor.GOLD + ".");
            }
        }
    }
}
