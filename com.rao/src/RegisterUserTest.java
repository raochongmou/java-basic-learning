public class RegisterUserTest {
    public static void main(String[] args) {
        RegisterUser ru = new RegisterUser();
        ru.setAge(19);
        ru.setEmail("1040948@qq.com");
        ru.setGender('男');
        ru.setPassword("19990000002233");
        ru.setUsername("张三");
        System.out.println(ru.getUsername() + " " + ru.getGender() + " " + ru.getAge() + " " + ru.getEmail() + " " + ru.getPassword());
    }
}
