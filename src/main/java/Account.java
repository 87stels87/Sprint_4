public class Account {

    private String name;

    public Account(String name) {
        this.name = name;
    }
    public Account() {
    }

    public boolean checkNameToEmboss() {
        if (name.length() > 19 || name.length() < 3) {
            return false;
        }
        if (!name.trim().contains(" ")) {
            return false;
        }
        if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
            return false;
        }
        if (name.trim().split(" ").length > 2) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }
}
