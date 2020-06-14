package com.example.leetcode;

public class _695_AreaOfIsland {

//    static int[][] nums = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//            {0,0,0,0,0,0,0,1,1,1,0,0,0},
//            {0,1,1,0,1,0,0,0,0,0,0,0,0},
//            {0,1,0,0,1,1,0,0,1,0,1,0,0},
//            {0,1,0,0,1,1,0,0,1,1,1,0,0},
//            {0,0,0,0,0,0,0,0,0,0,1,0,0},
//            {0,0,0,0,0,0,0,1,1,1,0,0,0},
//            {0,0,0,0,0,0,0,1,1,0,0,0,0}};
static int[][] nums = {{0,1},{1,1}};

    public static void main(String[] args) {
        int result = maxAreaOfIsland(nums);
        System.out.println(result);
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int i = 0 ;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++) {
                int area = getArea(grid,i,j);
                result = Math.max(result,area);
            }

        }
        return result;
    }

    public static int getArea(int[][] grid,int i,int j){

            int area = 0;

            if(grid[i][j] == 1){
                area ++;
                grid[i][j] = 0;
                if(j > 0){
                    //left
                    area += getArea(grid,i,j-1);
                }

                if(j <  grid[i].length - 1){
                    //right
                    area += getArea(grid,i,j+1);
                }

                if( i > 0){
                    //top
                    area += getArea(grid,i-1,j);
                }

                if( i < grid.length - 1){
                    //bottom
                    area += getArea(grid,i+1,j);
                }









            }

            return area;
        }
    }
