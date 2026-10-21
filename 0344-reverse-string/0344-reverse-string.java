class Solution {

    public void reverseString(char[] s) {

        int first=0;
        int last=s.length-1;
        char temp = s[0];
        while(first < last){

            temp=s[first];
            s[first]=s[last];
            s[last]=temp;

            first=first+1;
            last=last-1;
        }
    }
}