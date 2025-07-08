
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        String token = Config.get("BOT_TOKEN");
        JDABuilder.createDefault(token)
            .addEventListeners(new Main())
            .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();
        if (msg.equalsIgnoreCase("!مساعدة")) {
            event.getChannel().sendMessage("🧾 أوامر بوت TRo LAND:\n!هوية، !حقيبة، !رحلة، !موارد، !أسلحة، !بنك، !تفعيل، !مهام، !استدعاء، !نقاط، !مساعدة").queue();
        }
    }
}
