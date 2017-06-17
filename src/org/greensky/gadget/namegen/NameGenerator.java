package org.greensky.gadget.namegen;

import java.util.ArrayList;
import java.util.Random;

public class NameGenerator {
	protected ArrayList<String> surnames;
	protected ArrayList<String> givenNames;
	protected boolean isSurnameFirst;
	protected boolean hasSpace = true;

	public NameGenerator(ArrayList<String> surnames, ArrayList<String> givenNames, boolean isSurnameFirst) {
		this.surnames = surnames;
		this.givenNames = givenNames;
		this.isSurnameFirst = isSurnameFirst;
	}

	public String getRandomName() {
		Random ran = new Random();
		String surname = surnames.get(ran.nextInt(surnames.size()));
		String givenName = givenNames.get(ran.nextInt(givenNames.size()));
		String name;
		if (isSurnameFirst)
			name = hasSpace ? surname + " " + givenName : surname + givenName;
		else
			name = hasSpace ? givenName + " " + surname : givenName + surname;
		return name;
	}
}
