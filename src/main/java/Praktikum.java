public class Praktikum {
    public static void main(String[] args) {
        String name = "Фамилия Имя";
        Account account = new Account(name);
        System.out.println(account.checkNameToEmboss());
    }
}
