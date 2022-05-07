// **************************************************
// Klasse gegeben, also nicht bewerten!
// **************************************************

public class GameEngine {

	public static Brick[] generateWalls(int width, int height) {
		Brick[] wall = new Brick[(2 * width + 2 * height - 3) + width - 6 + width - 5 + height - 5 + height - 5 + 17
				+ (4 * ((width / 7) * (width / 7))) + 64 + 15 + 14 + 13 + 9 + 6 + 15 + 15];
		int wi = 0;
		for (int x = 0; x < width; x++) {
			wall[wi++] = new Brick(x, 0);
			wall[wi++] = new Brick(x, height - 1);
		}

		for (int y = 1; y < height - 1; y++) {
			wall[wi++] = new Brick(0, y);
			wall[wi++] = new Brick(width - 1, y);
		}

		// inside Wall
		for (int i = 2; i < width - 2; i++) {
			if (i != width / 2) {
				wall[wi++] = new Brick(i, 2);
			}
		}

		for (int i = 2; i < width - 2; i++) {
			if (i != width / 2) {
				wall[wi++] = new Brick(i, height - 3);
			}
		}

		for (int i = 2; i < height - 2; i++) {
			if (i != height / 2) {
				wall[wi++] = new Brick(2, i);
			}
		}

		for (int i = 2; i < height - 2; i++) {
			if (i != height / 2) {
				wall[wi++] = new Brick(width - 3, i);
			}
		}

		wall[wi++] = new Brick((width / 2) - 3, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 2, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 1, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2), (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 1, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 2, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 3, (height / 2) + 2);

		wall[wi++] = new Brick((width / 2) - 3, (height / 2) - 2);
		wall[wi++] = new Brick((width / 2) - 2, (height / 2) - 2);
		wall[wi++] = new Brick((width / 2) + 2, (height / 2) - 2);
		wall[wi++] = new Brick((width / 2) + 3, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) - 3, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) - 3, (height / 2));
		wall[wi++] = new Brick((width / 2) - 3, (height / 2) + 1);

		wall[wi++] = new Brick((width / 2) + 3, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) + 3, (height / 2));
		wall[wi++] = new Brick((width / 2) + 3, (height / 2) + 1);

		for (int i = 0; i < ((width / 7)); i++) {
			for (int j = 0; j < ((width / 7)); j++) {
				wall[wi++] = new Brick(i + 4, j + 4);

			}
		}

		for (int i = 0; i < ((width / 7)); i++) {
			for (int j = 0; j < ((width / 7)); j++) {
				wall[wi++] = new Brick(i + width - 9, j + height - 9);

			}
		}

		for (int i = 0; i < ((width / 7)); i++) {
			for (int j = 0; j < ((width / 7)); j++) {
				wall[wi++] = new Brick(i + 4, j + height - 9);

			}
		}

		for (int i = 0; i < ((width / 7)); i++) {
			for (int j = 0; j < ((width / 7)); j++) {
				wall[wi++] = new Brick(i + width - 9, j + 4);

			}
		}

		for (int i = 0; i < 17; i++) {
			if (i != 8) {
				wall[wi++] = new Brick((width / 2) - 8 + i, (height / 2) + 4);
				wall[wi++] = new Brick((width / 2) - 8 + i, (height / 2) + 5);
				wall[wi++] = new Brick((width / 2) - 8 + i, (height / 2) - 6);
				wall[wi++] = new Brick((width / 2) - 8 + i, (height / 2) - 7);
			}
		}

		for (int i = 0; i < 19; i++) {

			if (i != 5 && i != 6 && i != 12 && i != 13) {
				wall[wi++] = new Brick(width / 2 - 9 + i, height / 2 + 9);
			}

		}

		for (int i = 0; i < 17; i++) {
			if (i != 7 && i != 8 && i != 9) {
				wall[wi++] = new Brick(width / 2 - 8 + i, height / 2 + 7);
			}

		}

		for (int i = 0; i < 13; i++) {
			wall[wi++] = new Brick(width / 2 - 6 + i, height / 2 - 9);
		}

		for (int i = 0; i < 3; i++) {
			wall[wi++] = new Brick(width / 2 - 8 + i, height / 2 - 2);
			wall[wi++] = new Brick(width / 2 - 8 + i, height / 2);
			wall[wi++] = new Brick(width / 2 - 8 + i, height / 2 + 2);
		}

		for (int i = 0; i < 8; i++) {
			if (i != 2 && i != 5) {
				wall[wi++] = new Brick(width / 2 + 6, height / 2 - 4 + i);
			}

		}

		wall[wi++] = new Brick((width / 2) - 10, (height / 2) + 1);
		wall[wi++] = new Brick((width / 2) - 10, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 10, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) - 10, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) - 11, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 11, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) - 12, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 12, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) - 13, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 13, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) - 14, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) - 14, (height / 2) + 1);
		wall[wi++] = new Brick((width / 2) - 14, (height / 2));
		wall[wi++] = new Brick((width / 2) - 14, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) - 14, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) + 10, (height / 2) + 1);
		wall[wi++] = new Brick((width / 2) + 10, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 10, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) + 10, (height / 2));
		wall[wi++] = new Brick((width / 2) + 10, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) + 11, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 11, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) + 12, (height / 2) + 2);

		wall[wi++] = new Brick((width / 2) + 13, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 13, (height / 2) - 2);

		wall[wi++] = new Brick((width / 2) + 14, (height / 2) + 2);
		wall[wi++] = new Brick((width / 2) + 14, (height / 2) + 1);
		wall[wi++] = new Brick((width / 2) + 14, (height / 2));
		wall[wi++] = new Brick((width / 2) + 14, (height / 2) - 1);
		wall[wi++] = new Brick((width / 2) + 14, (height / 2) - 2);

		return wall;
	}

	public static Enemy[] generateEnemies(int width, int height) {
		return new Enemy[] { new Enemy(width / 2 - 5, height / 2 + 6), new Enemy(width / 2 - 10, height / 2 - 1),
				new Enemy(width / 2 + 8, height / 2 + 3), new Enemy(width / 2 + 15, height / 2 - 4),
				new Enemy(width / 2, height / 2 - 1) };
	}

}
