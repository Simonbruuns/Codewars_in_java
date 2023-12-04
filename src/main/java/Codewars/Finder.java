package Codewars;

public class Finder {
    static boolean pathFinder(String maze){
        String[] rows = maze.split("\n");
        char[][] mazeArray = new char[rows.length][rows[0].length()];
        for (int i = 0; i < rows.length; i++) {
            mazeArray[i] = rows[i].toCharArray();
        }
        int n = mazeArray.length;
        int m = mazeArray[0].length;
        // Check if the start and exit positions are unreachable (blocked)
        if (mazeArray[0][0] == 'W' || mazeArray[mazeArray.length - 1][mazeArray[0].length - 1] == 'W') {
            return false;
        }

        // Use DFS to explore the maze
        boolean[][] visited = new boolean[n][m];
        return dfs(mazeArray, visited, 0, 0);
    }
    private static boolean dfs(char[][] maze,boolean[][] visited, int x, int y){
        if(x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == 'W' || visited[x][y]){
            return false;

        }

        if(x == maze.length - 1 && y == maze[0].length-1){
            return true;
        }

        visited[x][y] = true;


        boolean canReachExit = dfs(maze, visited, x + 1, y) ||
                dfs(maze, visited, x - 1, y) ||
                dfs(maze, visited, x, y + 1) ||
                dfs(maze, visited, x, y - 1);

        return canReachExit;

    }

    public static void main(String[] args) {
        String maze = ".W.\n" +
                ".W.\n" +
                "...";

        boolean result = pathFinder(maze);
        System.out.println(result); // Output: true
    }



}


