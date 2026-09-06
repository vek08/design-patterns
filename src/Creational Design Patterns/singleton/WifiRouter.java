package singleton;

public class WifiRouter {
    private String name;
    private static final WifiRouter instance = new WifiRouter();
    private WifiRouter(){};

    public static WifiRouter getInstance(){
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        WifiRouter TV = WifiRouter.getInstance();
        WifiRouter mobile = WifiRouter.getInstance();

        TV.setName("singleton.WifiRouter-Home");
        System.out.println(mobile.getName());

    }
}
