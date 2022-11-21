package lesson9;

public class NameUser {

    static void getName() {

        Name name = new Name();


        try {
            name.setName(""); // ввод имени пользователя
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Welcome" + name);
        }
    }

}
