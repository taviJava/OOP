package JoculHero;

public class MainJocHero {
    public static void main(String[] args) {
Hero hero1=new Hero();
Enemy enemy1=new Enemy();
hero1.setViata(100);
enemy1.setViata(100);
hero1.setPutereDeAtac(10);
enemy1.setPutereDeAtac(2);
        System.out.println("Hero life is: "+hero1.getViata());
        System.out.println("Enemy life is: "+enemy1.getViata());

 enemy1.attack(hero1);
        System.out.println("Hero life is: "+hero1.getViata());
 hero1.attack(enemy1);
        System.out.println("Enemy life is: "+enemy1.getViata());
    }
}
