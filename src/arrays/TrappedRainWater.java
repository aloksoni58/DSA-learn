package arrays;

public class TrappedRainWater {

	public static void trappedRainWater(int[] height) {
		int[] leftMax = new int[height.length];
		int[] rightMax = new int[height.length];
		
		//Calculate left max boundry - array
		leftMax[0] = height[0];
		for(int i = 1; i < height.length; i++) {
			if(height[i] > leftMax[i-1]) {
				leftMax[i] = height[i];
			} else {
				leftMax[i] = leftMax[i-1];
			}
		}
		
		//Calculate right max boundry - array
		rightMax[height.length-1] = height[height.length-1];
		for(int i = height.length-2; i >= 0; i--) {
			if(height[i] > rightMax[i+1]) {
				rightMax[i] = height[i];
			} else {
				rightMax[i] = rightMax[i+1];
			}
		}
		
		//loop
		int trappedWater = 0;
		for(int i = 0; i < height.length; i++) {
			// waterLevel = min(leftMaxBoundry, rightMaxBoundry)
			int waterLevel = Math.min(leftMax[i], rightMax[i]);
			//trappedWater = waterLevel - height[i]
			trappedWater += waterLevel - height[i];
		}	
		System.out.println("Trapeed water is: " + trappedWater);
	}
}
