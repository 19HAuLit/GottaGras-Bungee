package fun.gottagras.bungee.commands;

import fun.gottagras.bungee.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class lobby extends Command {
    public lobby(Main main)
    {
        super("lobby", "lobby.use", "l", "hub");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings)
    {
        if (commandSender instanceof ProxiedPlayer)
        {
            ProxiedPlayer player = (ProxiedPlayer) commandSender;
            ServerInfo lobbyServer = ProxyServer.getInstance().getServerInfo("lobby");
            player.connect(lobbyServer);
        }
    }
}
