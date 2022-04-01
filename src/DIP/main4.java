package DIP;

public class main4 {
    public static void main(String[] args) {
        Toy t = new Lego();
        Kid k = new Kid();
        k.setToy(t);
        k.play();
    }
}
