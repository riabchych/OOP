public class User extends Entity {
    private int age;
    private String name;
    private String email;

    private String password;

    public User() {
        super();
        this.age = 0;
        this.name = "";
        this.email = "";
        this.password = "";
    }

    public User(int age, String name, String email, String password) {
        super();
        this.age = age;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.save();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        super.save();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.save();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.save();
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("Объект User успешно удалён!");
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Объект User успешно изменён!");
    }
}
