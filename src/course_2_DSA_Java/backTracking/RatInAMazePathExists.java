package course_2_DSA_Java.backTracking;

public class RatInAMazePathExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
		System.out.println(ratInAMaze(maze));

	}

	public static boolean ratInAMaze(int maze[][]) {

		int n = maze.length;
		int[][] path = new int[n][n];

		return ratMazePath(maze, 0, 0, path);

	}

	public static boolean ratMazePath(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;

		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}

		// Marking Path
		path[i][j] = 1;

		// Destination cell
		if (i == n - 1 && j == n - 1) {
			return true;
		}

		// left
		if (ratMazePath(maze, i, j - 1, path)) {
			return true;
		}

		// top
		if (ratMazePath(maze, i - 1, j, path)) {
			return true;
		}

		// right
		if (ratMazePath(maze, i, j + 1, path)) {
			return true;
		}

		// down
		if (ratMazePath(maze, i + 1, j, path)) {
			return true;
		}

		return false;
	}

}
