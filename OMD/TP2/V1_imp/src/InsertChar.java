public class InsertChar implements Command {
    private Command m_delete;

    public InsertChar() {
        m_delete = new Delete();
    }

    @Override
    /**
     * Insere un caractere
     */
    public void Execute() {
        m_delete.Execute();
        
    }
}
