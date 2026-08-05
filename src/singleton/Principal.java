package singleton;

class principalSingleton {
    private String name;
    private static final principalSingleton instance = new principalSingleton();
    private principalSingleton(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static principalSingleton getInstance(){
        return instance;
    }


}

public class Principal {
    public static void main(String[] args) {
        principalSingleton p1 = principalSingleton.getInstance();
        principalSingleton p2 = principalSingleton.getInstance();
        p1.setName("vek");
        System.out.println(p2.getName());
    }
}
