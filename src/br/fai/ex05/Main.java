package br.fai.ex05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		for (int i = 0; i <= 5; i++) {
			switch (i) {
			case 1: {

				System.out.println("Primeira condição");
			}
			case 4: {

				System.out.println("Segunda condição");

			}
			default: {
				System.out.println("Não encontrou uma condição");
			}

			}
		}
	}
}
