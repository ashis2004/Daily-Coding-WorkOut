class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long temp = 1;
        for(int i=1,up=r,down=1;i<=r;i++,up--, down++){
            temp=temp*up/down;
            ans.add((int)temp);
        }
        return ans;
        // int row []= new int[];
        // if(row<0){
        //     return row;
        // }
        // row.push(1);

        // for(int i=1;i<=r;i++){
        //     for(int j=r.length-1;j>0;j--){
        //         r[j]=r[j-1]+r[j];

        //     }
        //     row.push(1);
        // }
        // return r;
    }
}

