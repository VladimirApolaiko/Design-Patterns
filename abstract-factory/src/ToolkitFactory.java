import java.util.NoSuchElementException;


public class ToolkitFactory {
    public static ToolkitFactory toolkitFactory = new ToolkitFactory();

    private ToolkitFactory() {

    }

    public ArchitectureToolkitIF getToolkitFactory(String architecture) throws NoSuchElementException {
        switch (architecture) {
            case "Ember":
                return new EmberToolkit();
            case "Engiola":
                return new EngiolaToolkit();
            default:
                throw new NoSuchElementException();
        }
    }
}
