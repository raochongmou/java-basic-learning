public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("张三", 100);

        Role role2 = new Role("王五", 100);

        // 开始格斗
        while(true) {
            role1.attack(role2);
            if(role2.getBlood() == 0) {
                System.out.println(role2.getRoleName() + "被击败，game over!");
                break;
            }
            role2.attack(role1);
            if(role1.getBlood() == 0) {
                System.out.println(role1.getRoleName() + "被击败，game over!");
                break;
            }
        }
    }
}
