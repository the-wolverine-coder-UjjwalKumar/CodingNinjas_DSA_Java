package course_2_DSA_Java.backTracking;

public class RatInAMazePrintAllPossiblePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		ratInAMaze(maze);

	}

	public static void ratInAMaze(int maze[][]) {

		int n = maze.length;
		int[][] path = new int[n][n];

		printAllPath(maze, 0, 0, path);
		return;

	}

	public static void printAllPath(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;

		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
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
				// System.out.println();
			}

			System.out.println();
			// Backtrack the destination
			path[i][j] = 0;

			return;
		}

		// left
		printAllPath(maze, i, j - 1, path);

		// down
		printAllPath(maze, i + 1, j, path);

		// top
		printAllPath(maze, i - 1, j, path);

		// right
		printAllPath(maze, i, j + 1, path);

		// BackTrack the current cell that may be included in future paths
		path[i][j] = 0;
		return;
	}
	
	
	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
        
        // path created
        int[][] path = new int[n][n];
        
        printAllPaths(maze, 0, 0, path, n);
	}
    
    
    static void printAllPaths(int[][] maze, int i, int j, int[][] path, int n){
        
        
        // Goal
        if(i == n-1 && j == n-1){
            path[i][j] = 1;
            for(int r = 0; r < n; r++) {
            	for(int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            return;
        }
        
        // abandoned
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1)
            return;

        // visited
        path[i][j] = 1;
        
        
        // top
        printAllPaths(maze, i - 1, j, path, n);
        
        // bottum
        printAllPaths(maze, i + 1, j, path, n);  

        // left
        printAllPaths(maze, i, j - 1, path, n);
        
        // right
        printAllPaths(maze, i, j + 1, path, n);  
        
        // going back
        path[i][j] = 0;
    }

}
