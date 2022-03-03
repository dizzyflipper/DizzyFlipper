package me.dizzy.dizzyflipper.commands.subcommands;

import me.dizzy.dizzyflipper.Main;
import net.minecraft.command.ICommandSender;

public class Help implements Subcommand {
    @Override
    public String getCommandName() {
        return "help";
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public String getCommandUsage() {
        return "";
    }

    @Override
    public String getCommandDescription() {
        return "Sends the help message";
    }

    @Override
    public boolean processCommand(ICommandSender sender, String[] args) {
        Main.commandManager.sendHelp(sender);
        return true;
    }
}
