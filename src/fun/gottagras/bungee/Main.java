package fun.gottagras.bungee;

import fun.gottagras.bungee.commands.lobby;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin
{
    @Override
    public void onEnable()
    {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new lobby(this));
    }
}
