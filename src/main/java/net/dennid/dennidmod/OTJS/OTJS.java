package net.dennid.dennidmod.OTJS;

import net.dennid.dennidmod.item.ChiselItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class OTJS {
    public static void o(PlayerEntity a){
        if(ChiselItem.i > 500){

            a.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE , 9999, 1, true, true));
        }}
}
