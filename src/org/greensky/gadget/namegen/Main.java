package org.greensky.gadget.namegen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPNameGenerator gen = new JPNameGenerator();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(gen.getRandomName() + "、");
			}
			System.out.println();

		}
	}

}
