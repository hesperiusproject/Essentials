package it.hesperius.ess;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class CancelTpEvent extends Event{


    private final Player player;

    public CancelTpEvent(Player player){
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}