import cpu.CPU;
import mmu.MMU;

// Factory interface (abstraction)
public interface ArchitectureToolkitIF {
    CPU createCPU();
    MMU createMMU();
}

