package sample_game;

public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("Joe", "Sword", 100);
//		System.out.println(player.getName());
//		System.out.println(player.getWeapon());
//		System.out.println(player.getHealth());
		
		player.damagedByGun1();
		player.damagedByGun1();
		player.heal();
	}

}
