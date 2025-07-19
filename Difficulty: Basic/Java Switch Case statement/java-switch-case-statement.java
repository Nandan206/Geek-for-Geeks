// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        double area = 0;
        
        switch(choice){
            case 1:{
                double radius = arr.get(0);
                area = Math.PI * radius * radius;
                break;
            }
                
            case 2:{
                double length = arr.get(0);
                double breadth = arr.get(1);
                area = length * breadth;
                break;
            }
            
        }
        return area;
    }
}