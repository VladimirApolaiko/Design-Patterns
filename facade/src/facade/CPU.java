package facade;

class CPU {
    public void freeze() {
        System.out.println("freezing...");
    }

    public void jump(long position) {
        System.out.println("Jump to " + position);
    }

    public void execute() {
        System.out.println("Execute programm");
    }
}