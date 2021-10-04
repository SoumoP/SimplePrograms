class Armstrong {
    public static void main(String args[]){    
        for(int i = 1; i < 1000; i++){
            int nod = (int) (Math.log10(i)) +1;
            int x = i, sum = 0;
            while(x > 0){
                int t = x%10;
                sum += Math.pow(t, nod);
                x = x/10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }  
    
}