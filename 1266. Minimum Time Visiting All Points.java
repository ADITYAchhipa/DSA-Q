//    Difficult : Easy

//    Problem

//    On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi]. Return the minimum time in seconds to visit all the points in the order given by points.
//    You can move according to these rules:
//    In 1 second, you can either:
//    move vertically by one unit,
//    move horizontally by one unit, or
//    move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
//    You have to visit the points in the same order as they appear in the array.
//    You are allowed to pass through points that appear later in the order, but these do not count as visits.



//    ✅ Approach (Chebyshev Distance)

//    To go from point A(x1, y1) to B(x2, y2):
//    Let dx = |x2 - x1| and dy = |y2 - y1|
//    In 1 second, a diagonal move reduces both dx and dy by 1.
//    So we first take min(dx, dy) diagonal moves, then the remaining moves are straight.
//    Total minimum time for that segment = max(dx, dy).
//    Sum this for every consecutive pair of points.
//    ✅ Final answer = sum of max(|dx|, |dy|) for all moves.




//    Code

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dist=0;
        for(int i=1;i<points.length;i++){
            dist+=Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        return dist;
    }
}
