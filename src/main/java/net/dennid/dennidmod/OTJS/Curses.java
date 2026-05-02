package net.dennid.dennidmod.OTJS;

import net.dennid.dennidmod.item.ChiselItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class Curses {
    public static void o(PlayerEntity a){
        System.out.println(a + "is" + ChiselItem.i);
        if(ChiselItem.i > 300){

            a.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE , 9999, 1, true, true));
        }
    if(ChiselItem.i > 500){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 9999, 2, true, true) );
    }
    if(ChiselItem.i < 90){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 9999, 1, true, true));
    }
    if(ChiselItem.i < 50){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS));
    }
    if(ChiselItem.i < 10){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 9999, 5, true, true));
    }
    if(ChiselItem.i == 0){
        a.kill();
    }
    if(ChiselItem.i > 1000){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 9999, 3, true, true));
    }
    if(ChiselItem.i > 1500){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9999, 3, true, true));
    }
    if(ChiselItem.i > 10000){
        a.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 999999999, 5, true, true));
    }



    }

}
