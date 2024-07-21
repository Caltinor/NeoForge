/*
 * Copyright (c) NeoForged and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.neoforged.neoforge.event.entity.player;

import java.util.List;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;

/**
 * This event captures when a player action enchants an item.
 */
public class PlayerEnchantItemEvent extends PlayerEvent {
    private final ItemStack enchantedItem;
    private final List<EnchantmentInstance> enchantments;

    public PlayerEnchantItemEvent(Player player, ItemStack enchantedItem, List<EnchantmentInstance> enchantments) {
        super(player);
        this.enchantedItem = enchantedItem;
        this.enchantments = enchantments;
    }

    /** {@return the {@link ItemStack} after it was enchanted} */
    public ItemStack getEnchantedItem() {
        return enchantedItem;
    }

    /** {@return the list of {@link EnchantmentInstance}s that were applied to the item for this event firing} */
    public List<EnchantmentInstance> getEnchantments() {
        return enchantments;
    }
}
