package net.snapecraft.customserverutil_v3;

import net.snapecraft.customserverutil_v3.commands.*;
import org.bukkit.plugin.java.JavaPlugin;
import sun.security.provider.Sun;

public class CustomServerUtilv3 extends JavaPlugin {

    public static String getPrefix() {
        return prefix;
    }

    public static final String prefix = "§7[§3Server§7]§5 > §r";

    public static String getNoPerm() {
        return noPerm;
    }

    public static final String noPerm = prefix + "§cDu hast nicht die nötige Berechtigung, um diesen Command auszuführen!";

    @Override
    public void onEnable() {
        System.out.println("\n\n\n                _                  _       _     _                 _____ \n" +
                "               | |                | |     | |   | |               |____ |\n" +
                "  ___ _   _ ___| |_ ___  _ __ ___ | | ___ | |__ | |__  _   ___   __   / /\n" +
                " / __| | | / __| __/ _ \\| '_ ` _ \\| |/ _ \\| '_ \\| '_ \\| | | \\ \\ / /   \\ \\\n" +
                "| (__| |_| \\__ \\ || (_) | | | | | | | (_) | |_) | |_) | |_| |\\ V /.___/ /\n" +
                " \\___|\\__,_|___/\\__\\___/|_| |_| |_|_|\\___/|_.__/|_.__/ \\__, | \\_/ \\____/ \n" +
                "                                                        __/ |            \n" +
                "                                                       |___/             \n\n\n");

        registerCommands();
        registerListeners();

        super.onEnable();
    }


    private void registerCommands() {

        getCommand("tpa").setExecutor(new SendTpaCMD());
        getCommand("tpaccept").setExecutor(new AcceptTpaCMD());
        getCommand("tpdecline").setExecutor(new DeclineTpaCMD());

        getCommand("home").setExecutor(new HomeCMD());
        getCommand("sethome").setExecutor(new HomeCMD());

        getCommand("s").setExecutor(new GameModeCMD());
        getCommand("c").setExecutor(new GameModeCMD());
        getCommand("sp").setExecutor(new GameModeCMD());

//        getCommand("sun").setExecutor(new Sun());
//        getCommand("day").setExecutor(new Day());
//        getCommand("rlcfg").setExecutor(new RlCFGCMD());
//
//        getCommand("server").setExecutor(new ServerHandlerCMD());
//        getCommand("ban").setExecutor(new Banmanager());
//        getCommand("warn").setExecutor(new WarnHandler());
//        getCommand("pardon").setExecutor(new PardonHandler());
//        getCommand("sendmail").setExecutor(new SendMailCMD());
//        getCommand("mail").setExecutor(new MailCMD());
//        getCommand("nick").setExecutor(new Nick());
//        getCommand("ping").setExecutor(new PingCMD());
//        getCommand("warp").setExecutor(new WarpCMD());
//        getCommand("setwarp").setExecutor(new SetWarpCMD());
//        getCommand("removewarp").setExecutor(new RemoveWarpCMD());
//        getCommand("spawn").setExecutor(new SpawnCMD());
//        getCommand("tpa").setExecutor(new SendTpaCMD());
//        getCommand("tpaccept").setExecutor(new AcceptTpaCMD());
//        getCommand("tpdecline").setExecutor(new DeclineTpaCMD());
//        getCommand("report").setExecutor(new reportAdminCMD());
//        getCommand("spectateplayer").setExecutor(new SpectateThatPlayerCMD());
//        getCommand("build").setExecutor(new BuildModeCMD());
//        getCommand("friend").setExecutor(new friendsCMD());
//        getCommand("v").setExecutor(new Vanish());
//        getCommand("lobby").setExecutor(new LobbyCMD());
//        getCommand("money").setExecutor(new GetMoneyCMD());
//        getCommand("setmoney").setExecutor(new SetMoneyCMD());
//        getCommand("transfer").setExecutor(new MoneyTransfer());
//        getCommand("msg").setExecutor(new MsgCMD());
//        getCommand("r").setExecutor(new ReplyCMD());
//        getCommand("sell").setExecutor(new SellCMD());
//        getCommand("ddos").setExecutor(new DdosCmd());
//        getCommand("setlang").setExecutor(new setLanguageCMD());
//        getCommand("force").setExecutor(new ForceCMD());
    }

    private void registerListeners() {

    }
}
