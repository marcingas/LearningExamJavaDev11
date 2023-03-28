public class Modify {
    private int size;
    public Modify(int size){
        this.size = size;
        System.out.println("Constructor size:" + this.size);
    }

    @Override
    public String toString() {
        return "Modify{" +
                "size=" + size +
                '}';
    }

    public static void sendHome(Modify m, int newSize){
        m = new Modify(newSize);

        m .size = 4;
    }

    public static void main(String[] args) {
        final var modify = new Modify(3);
        sendHome(modify,7);
        System.out.println(  );
    }
}


