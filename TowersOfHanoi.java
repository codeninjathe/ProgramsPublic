import java.util.*;
//Code made by codeninjathe on github
public class TowerOfHanoi {
	private static ArrayList<Integer> ring1 = new ArrayList<Integer>();
	private static ArrayList<Integer> ring2 = new ArrayList<Integer>();
	private static ArrayList<Integer> ring3 = new ArrayList<Integer>();
	private static int diff = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.print("Welcome to the Towers of Hanoi.\nYou will be able to chose the difficulty, where difficulty is the number of rings.\nDifficulty=>");
		diff = sc.nextInt();
		for (int c = diff; c > 0; c--)
			ring1.add(c);
		dispTowers();
		boolean finish = false;
		int turnCount = 0;
		do {
			turnCount++;
			System.out.print("move ring from ==>");
			int from = sc.nextInt();
			System.out.print("move ring to   ==>");
			int to = sc.nextInt();
			swap(from, to);
			dispTowers();
			finish = checkWin();
		} while (!finish);
		System.out
				.println("Congratulations, you finished the Towers of Hanoi with difficulty "
						+ diff + "\nin " + turnCount + " turns");
	}

	private static void swap(int from, int to) {
		int num = -1;
		boolean okay = true;
		if (from == to) {
			System.out
					.println("I believe it is somewhat redundant to switch a ring to itself");
		} else if (from > 3 || to > 3 || from <= 0 || to <= 0)
			System.out.println("Error: Out of Bounds");

		else {
			boolean invalid = false;
			switch (from) {
			case 1:
				if (ring1.size() == 0)
					invalid = true;
				break;
			case 2:
				if (ring2.size() == 0)
					invalid = true;
				break;
			case 3:
				if (ring3.size() == 0)
					invalid = true;
				break;
			}
			if (invalid)
				System.out
						.println("You're trying to move from an empty ring...");
			else
				switch (from) {
				case 1:
					num = ring1.remove(ring1.size() - 1);
					switch (to) {
					case 1:
						if (ring1.size() == 0)
							ring1.add(num);
						else if (ring1.get(ring1.size() - 1) < num) {
							{
								System.out.println("Error, invalid move");
								okay = false;
							}
						} else
							ring1.add(num);
						break;
					case 2:
						if (ring2.size() == 0)
							ring2.add(num);
						else if (ring2.get(ring2.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring2.add(num);
						break;
					case 3:
						if (ring3.size() == 0)
							ring3.add(num);
						else if (ring3.get(ring3.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring3.add(num);
						break;
					default:
					}
					if (!okay)
						ring1.add(num);
					break;
				case 2:
					num = ring2.remove(ring2.size() - 1);
					switch (to) {
					case 1:
						if (ring1.size() == 0)
							ring1.add(num);
						else if (ring1.get(ring1.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring1.add(num);
						break;
					case 2:
						if (ring2.size() == 0)
							ring2.add(num);
						else if (ring2.get(ring2.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring2.add(num);
						break;
					case 3:
						if (ring3.size() == 0)
							ring3.add(num);
						else if (ring3.get(ring3.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring3.add(num);
						break;
					default:
					}
					if (!okay)
						ring2.add(num);
					break;
				case 3:
					num = ring3.remove(ring3.size() - 1);
					switch (to) {
					case 1:
						if (ring1.size() == 0)
							ring1.add(num);
						else if (ring1.get(ring1.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring1.add(num);
						break;
					case 2:
						if (ring2.size() == 0)
							ring2.add(num);
						else if (ring2.get(ring2.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring2.add(num);
						break;
					case 3:
						if (ring3.size() == 0)
							ring3.add(num);
						else if (ring3.get(ring3.size() - 1) < num) {
							System.out.println("Error, invalid move");
							okay = false;
						} else
							ring3.add(num);
						break;
					default:
					}
					if (!okay)
						ring3.add(num);
					break;
				default:
				}
		}
	}

	private static boolean checkWin() {
		if (ring3.size() == 0)
			return false;
		else if (ring3.size() < diff)
			return false;
		for (int w = diff; w > 0; w--)
			if (!(ring3.get(diff - w) == w))
				return false;
		return true;
	}

	private static void dispTowers() {
		System.out.println("1. " + ring1 + "\n2. " + ring2 + "\n3. " + ring3);
	}
}
