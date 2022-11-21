package lesson9;

public class Name {
    private String name;

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) throws MyException {
        if (name.equals("Admin")) {
            throw new MyException("user name is invalid");
        } else if (name.equals("User")) {
            throw new MyException("enter your real name");
        } else if (name.equals("")) {
            throw new MyException("the name field cannot be empty");
        } else if (name.equals(" ")) {
            throw new MyException("the name field cannot be empty");
        }
        this.name = name;
    }
}
