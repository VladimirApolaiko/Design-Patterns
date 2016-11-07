package facade;

class Memory {

    private byte[] memory = new byte[10_000];

    public void load(long position, byte[] data) {
        for (int memoryCounter = (int) position, dataCounter = 0;
             dataCounter < data.length; memoryCounter++, dataCounter++) {
            memory[memoryCounter] = data[dataCounter];
        }
    }
}