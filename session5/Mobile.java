package session5;

//This program shows implementation of the interface
interface Mobile {
    public String unlock();

    public String call(String mobileNumber);

    public String openApp(String appName);

}

class Samsung implements Mobile {
    public String unlock() {
        return ("Samsung: Unlocked");
    }

    public String call(String mobileNumber) {
        return ("Samsung: calling " + mobileNumber);
    }

    public String openApp(String appName) {
        return ("Samsung: opening " + appName);
    }
}

class Mobile1 {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        System.out.println(samsung.unlock());
        System.out.println(samsung.call("1234567890"));
        System.out.println(samsung.openApp("Gallery"));
    }
}
