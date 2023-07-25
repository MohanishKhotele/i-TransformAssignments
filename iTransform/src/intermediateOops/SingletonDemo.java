package intermediateOops;

class Singleton{
	
	private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		//Singleton st = new Singleton();
	}

}
