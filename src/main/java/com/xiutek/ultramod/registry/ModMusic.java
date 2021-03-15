package com.xiutek.ultramod.registry;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;


public class ModMusic extends MusicDiscItem {
    public ModMusic(int id, SoundEvent sound, Settings settings) {
        super(id, sound, settings);
    }
}