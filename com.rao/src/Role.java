import java.util.Random;

public class Role {
    private String roleName;
    private int blood;

    public Role() {
    }

    public Role(String roleName, int blood) {
        this.roleName = roleName;
        this.blood = blood;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        // 随机攻击伤害
        Random random = new Random();
        // 生成1-20点伤害
        int hurt = random.nextInt(20) + 1;
        // 剩余血量
        int remainBlood = role.getBlood() - hurt;
        if(remainBlood < 0) {
            remainBlood = 0;
        }
        role.setBlood(remainBlood);
        System.out.println(this.getRoleName() + "攻击了" + role.getRoleName() + "一次，造成了" + hurt + "点伤害，" + role.getRoleName() + "还剩下" + remainBlood);
    }
}
