package me.dizzy.dizzyflipper.events;

import me.dizzy.dizzyflipper.utils.Utils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class OnTick {
    private static int ticks = 0;

    @SubscribeEvent()
    public void onTick(TickEvent.ClientTickEvent event) {
        if (ticks % 20 == 0) {
            Utils.updateSkyblockScoreboard();
        }
        ticks++;
    }
}
