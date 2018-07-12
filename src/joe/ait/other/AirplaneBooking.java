package joe.ait.other;

public class AirplaneBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] seats = new int[10][10];
		
		int[][] seats = {{0,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		
		// i = row, j = col
		showSeats(seats);
	}
	
	static void bookSeats(int numSeats) {
		
	}

	static void showSeats(int[][] seats) {
		for (int i = 0; i < 10; i++) {
			for (int j=0;j<10;j++) {
				if (seats[i][j] == 0) {
					if (j==2 || j==6)
						System.out.print("E ");
					else 
						System.out.print("E");
				} else {
					if (j==2 || j==6)
						System.out.print("X ");
					else 
						System.out.print("X");
				}
			}
			System.out.println();
		}
	}
}
