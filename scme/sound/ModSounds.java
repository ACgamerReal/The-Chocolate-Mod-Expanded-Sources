package net.scme.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.scme.SCME;

public class ModSounds {

    public static SoundEvent CHOCOOLATE_DISC = registerSoundEvent("chocolate_disc");

            private static SoundEvent registerSoundEvent(String name){
                Identifier id = new Identifier(SCME.MOD_ID, name);
                return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
            }
}
