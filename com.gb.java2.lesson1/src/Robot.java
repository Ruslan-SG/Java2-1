public class Cat implements Compititors {
    private String name;

    @Override
    public void run() {
        System.out.println(name + " run");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
    }
}
