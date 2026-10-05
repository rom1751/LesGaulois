package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main() {
		Gaulois asterix;
		asterix = new Gaulois("Asterix", 8);

		Gaulois obelix = new Gaulois("Obélix", 16);

		asterix.parler("Bonjour Obelix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée");
	}
}
