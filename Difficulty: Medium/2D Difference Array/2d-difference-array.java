class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int[] op : opr){
            int v=op[0], r1=op[1], c1=op[2], r2=op[3], c2=op[4];
            for(int i=r1;i<=r2;i++){
                for(int j=c1;j<=c2;j++){
                    mat[i][j] += v;
                }
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(mat[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}