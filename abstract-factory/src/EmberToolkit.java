import cpu.CPU;
import cpu.impl.EmberCPU;
import mmu.MMU;
import mmu.impl.EmberMMU;

/**
 * Created by Vladimir on 17.12.2015.
 */
public class EmberToolkit implements ArchitectureToolkitIF {
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
