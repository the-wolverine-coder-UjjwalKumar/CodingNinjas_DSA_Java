package course_2_DSA_Java.backTracking;

public class RatInAMazePrintOnePossiblePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
		System.out.println(ratInAMaze(maze));

	}

	public static boolean ratInAMaze(int maze[][]) {

		int n = maze.length;
		int[][] path = new int[n][n];

		return printOnePath(maze, 0, 0, path);

	}

	public static boolean printOnePath(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;

		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}

		// Marking Path
		path[i][j] = 1;

		// Destination cell
		if (i == n - 1 && j == n - 1) {

			// when we reach destination then we have one possible solution
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println();
			}
			return true;
		}

		// top
		if (printOnePath(maze, i - 1, j, path)) {
			return true;
		}

		// right
		if (printOnePath(maze, i, j + 1, path)) {
			return true;
		}

		// down
		if (printOnePath(maze, i + 1, j, path)) {
			return true;
		}

		// left
		if (printOnePath(maze, i, j - 1, path)) {
			return true;
		}

		return false;
	}

}
