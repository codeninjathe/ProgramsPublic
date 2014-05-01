package brilliant.org;

import java.util.*;

public class PackedCheckers {

	/**
	 * Link is here
	 * https://brilliant.org/profile/calvin-8u8hog/sets/calvins-picks-level-5-challenges-5/39598/community-problem/packed-checkers/?group=QSIPMOsIgSny
	 */
	public static void main(String[] args) {
		boolean[][] board = new boolean[8][8];
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				board[w][x] = false;
			}
		}
		for(int w =0 ; w < 8; w++){
			board[0][w] = true;
			board[w][0] = true;
			board[w][7] = true;
			board[7][w] = true;
		}
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		for(int w = 1; w < 7; w++){
			for(int x = 1; x < 7; x++){
				int a = 0;
				if(board[w-1][x])
					a++;
				if(board[w+1][x])
					a++;
				if(board[w][x-1])
					a++;
				if(board[w][x+1])
					a++;
				if(a>=3)
					board[w][x] = false;
				else
					board[w][x] = true;
			}
		}
		/*
		 * Okay, I decided to do this thing thrice for safe measures. I just kind of derped with total = 0 instead of total = 1
		 */
		System.out.println();
		System.out.println();
		System.out.println();
		
		int total = 0;
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
					total++;
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		for(int w = 1; w < 7; w++){
			for(int x = 1; x < 7; x++){
				int a = 0;
				if(board[w-1][x])
					a++;
				if(board[w+1][x])
					a++;
				if(board[w][x-1])
					a++;
				if(board[w][x+1])
					a++;
				if(a>=3)
					board[w][x] = false;
				else
					board[w][x] = true;
			}
		}
		System.out.println();
		System.out.println();
		total = 1; //I had total = 0;
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
					total++;
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		System.out.println(total);
	}
}
package brilliant.org;

import java.util.*;

public class PackedCheckers {

	/**
	 * Link is here
	 * https://brilliant.org/profile/calvin-8u8hog/sets/calvins-picks-level-5-challenges-5/39598/community-problem/packed-checkers/?group=QSIPMOsIgSny
	 */
	public static void main(String[] args) {
		boolean[][] board = new boolean[8][8];
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				board[w][x] = false;
			}
		}
		for(int w =0 ; w < 8; w++){
			board[0][w] = true;
			board[w][0] = true;
			board[w][7] = true;
			board[7][w] = true;
		}
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		for(int w = 1; w < 7; w++){
			for(int x = 1; x < 7; x++){
				int a = 0;
				if(board[w-1][x])
					a++;
				if(board[w+1][x])
					a++;
				if(board[w][x-1])
					a++;
				if(board[w][x+1])
					a++;
				if(a>=3)
					board[w][x] = false;
				else
					board[w][x] = true;
			}
		}
		/*
		 * Okay, I decided to do this thing thrice for safe measures. I just kind of derped with total = 0 instead of total = 1
		 */
		System.out.println();
		System.out.println();
		System.out.println();
		
		int total = 0;
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
					total++;
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		for(int w = 1; w < 7; w++){
			for(int x = 1; x < 7; x++){
				int a = 0;
				if(board[w-1][x])
					a++;
				if(board[w+1][x])
					a++;
				if(board[w][x-1])
					a++;
				if(board[w][x+1])
					a++;
				if(a>=3)
					board[w][x] = false;
				else
					board[w][x] = true;
			}
		}
		System.out.println();
		System.out.println();
		total = 1; //I had total = 0;
		for(int w = 0; w < 8; w++){
			for(int x = 0; x < 8; x++){
				if(board[w][x]){
					System.out.print(board[w][x] + "  ");
					total++;
				}
				else
					System.out.print(board[w][x] + " ");
			}
			System.out.println();
		}
		System.out.println(total);
	}
}
