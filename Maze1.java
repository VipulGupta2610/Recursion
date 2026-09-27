package pkg;

import java.util.ArrayList;
import java.util.List;

public class Maze1 {
    public static void main(String[] args) {
        // int ans = count(3, 3);
        // System.out.println(ans);
        // path("", 3, 3);
        // List<String> ans = patRet("", 3, 3);
        // System.out.println(ans);
        // pathDiag("", 3, 3);
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // pathRest("", board, 0, 0);
        allPath("", board, 0, 0);
    }

    

    static void allPath(String p, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }
        maze[r][c] = true;
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int ans1 = count(r - 1, c);
        int ans2 = count(r, c - 1);
        return ans1 + ans2;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static void pathRest(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        if (r < maze.length - 1) {
            pathRest(p + 'D', maze, r + 1, c);
        }
        if (c < maze[r].length - 1) {
            pathRest(p + 'R', maze, r, c + 1);
        }
    }

    static void pathDiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1) {
            path(p + 'D', r - 1, c - 1);
        }
        if (r > 1) {
            path(p + 'V', r - 1, c);
        }
        if (c > 1) {
            path(p + 'H', r, c - 1);
        }
    }

    static List<String> patRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> inner = new ArrayList<>();
        if (r > 1) {
            List<String> left = patRet(p + 'D', r - 1, c);
            inner.addAll(left);
        }
        if (c > 1) {
            List<String> right = patRet(p + 'R', r, c - 1);
            inner.addAll(right);
        }
        return inner;
    }
}
