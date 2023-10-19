import java.util.ArrayList;
import java.util.List;

public class Cut implements Command {
    private List<Command> m_commands;
    
    public Cut() {
        m_commands = new ArrayList<Command>(2);
        
        m_commands.add(new Copy());
        m_commands.add(new Delete());
    }

    @Override
    /**
     * Copie la zone de texte puis la supprime
     */
    public void Execute() {
        for (Command command : m_commands) {
            command.Execute();
        }
    }
}
