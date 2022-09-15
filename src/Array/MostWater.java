package Array;

public class MostWater {
    public static void main(String[] args) {
        int height [] ={1,1};
       maxAreaCal(height);

    }
    public static int  maxAreaCal(int height[]) {
        int maxArea = -1;
        int start =0;
        int end = height.length -1;

        while (start<end){
            if (height[start] <height[end]){
                maxArea = Math.max(maxArea,height[start]*(end -start));
                System.out.println(maxArea);
                start ++;

            }
            else{
                maxArea = Math.max(maxArea, height[end]*(end-start));
                System.out.println(maxArea);
                end--;
            }
        }
        return maxArea;

    }
}

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
