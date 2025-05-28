package Recursion;

import java.util.*;

public class RatInMaze {

  public static boolean isSafe(int[][] maze, int[][] v, int n, int x, int y) {

    if ((x >= 0 && x < n) && (y >= 0 && y < n) && v[x][y] == 0 && maze[x][y] == 1) {
      return true;
    }
    return false;
  }

  public static void ratInMazeHelper(int[][] maze, int[][] v, int n, ArrayList<String> ans, String output, int x,
      int y) {
    // code here
    if (x == n - 1 && y == n - 1) {
      ans.add(output);
      return;
    }

    v[x][y] = 1;

    // down
    int newX = x + 1;
    int newY = y;
    if (isSafe(maze, v, n, newX, newY)) {
      output += "D";
      ratInMazeHelper(maze, v, n, ans, output, newX, newY);
      output = output.substring(0, output.length() - 1);
    }

    // up
    newX = x - 1;
    newY = y;
    if (isSafe(maze, v, n, newX, newY)) {
      output += "U";
      ratInMazeHelper(maze, v, n, ans, output, newX, newY);
      output = output.substring(0, output.length() - 1);
    }

    // left
    newX = x;
    newY = y - 1;
    if (isSafe(maze, v, n, newX, newY)) {
      output += "L";
      ratInMazeHelper(maze, v, n, ans, output, newX, newY);
      output = output.substring(0, output.length() - 1);
    }

    // right
    newX = x;
    newY = y + 1;
    if (isSafe(maze, v, n, newX, newY)) {
      output += "R";
      ratInMazeHelper(maze, v, n, ans, output, newX, newY);
      output = output.substring(0, output.length() - 1);
    }
    v[x][y] = 0;
  }

  public static ArrayList<String> ratInMaze(int[][] maze) {
    ArrayList<String> ans = new ArrayList<>();
    if (maze[0][0] == 0) {
      return ans;
    }
    int n = maze.length;
    System.out.println(n);
    int[][] v = new int[n][n];
    for (int i = 0; i < v.length; i++) {
      for (int j = 0; j < v[0].length; j++) {
        v[i][j] = 0;
      }
    }
    String output;
    ratInMazeHelper(maze, v, n, ans, "", 0, 0);

    for (String s : ans) {
      System.out.print(s + "  ");
    }
    System.out.println();
    Collections.sort(ans);
    for (String s : ans) {
      System.out.print(s + "  ");
    }
    return ans;
  }

  public static void main(String[] args) {
    int mat[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
    int mat2[][] = { { 1, 1, 1, 0, 1 },
        { 1, 0, 1, 1, 1 },
        { 1, 0, 1, 1, 1 },
        { 1, 0, 0, 1, 1 },
        { 1, 0, 0, 0, 1 } };
    ratInMaze(mat2);
  }
}
