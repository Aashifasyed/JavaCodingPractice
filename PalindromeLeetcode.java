class PalindromeLeetcode {
    public boolean isPalindrome(int x) {
        int num=0,t=x,u=x;
        int rem,n=0;
        if(x<0)
            return false;
        else{
            while(t>0){
                rem=t%10;
                t=t/10;
                num=(num*10)+rem;
            }
            if(num==x)
               return true;
            else
               return false;
        }
    }
}