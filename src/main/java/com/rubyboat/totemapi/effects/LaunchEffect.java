package com.rubyboat.totemapi.effects;

import com.rubyboat.totemapi.effects.TotemEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LaunchEffect extends TotemEffect {
    double velocity;

    public LaunchEffect(double velocity)
    {
        this.velocity = velocity;
    }


    @Override
    public void onDeath(LivingEntity user, World world, ItemStack stack) {
        super.onDeath(user, world, stack);
        user.addVelocity(0,velocity,0);
    }

    @Override
    public String getTooltip() {
        return "launches you with a force of " + velocity;
    }
}
