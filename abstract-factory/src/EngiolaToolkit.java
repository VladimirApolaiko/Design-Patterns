import cpu.CPU;
import cpu.impl.EnginolaCPU;
import mmu.MMU;
import mmu.impl.EngiolaMMU;

/**
 * Created by Vladimir on 17.12.2015.
 */
public class EngiolaToolkit implements ArchitectureToolkitIF {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EngiolaMMU();
    }
}
