
class Bush extends Plant{
    String type = "bush";

    @Override
     public int make() {
        return 1;
    }
}
public class Plant {
    String type = "Plant";
    public int make(){
        return 2;
    }

    public static void main(String[] args) {
        Plant w1 = new Bush();
        Bush w2 = new Bush();
        Plant w3 = new Plant();
        System.out.println(w1.type+ " " + w2.type + " " + w3.type);
        System.out.println(w1.make());
        w1.make();
        w2.make();
        System.out.println(w3.make());
    }

}
