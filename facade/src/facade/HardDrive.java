package facade;

import java.util.Arrays;

class HardDrive {

    private static byte[] hardDrive = new byte[1_000_000];

    public static final long BOOT_ADDRESS = 0;
    public static final long BOOT_SECTOR = 0;
    public static final int SECTOR_SIZE = 1024;

    public byte[] read(long lba, int size) {
        return Arrays.copyOfRange(hardDrive, (int) lba, size);
    }
}
