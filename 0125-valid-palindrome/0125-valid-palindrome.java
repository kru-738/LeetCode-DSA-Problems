class Solution {
    public boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                 right--;
            }

            else{
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }    
         return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String = ");
        String s = sc.nextLine();

        if(s.isEmpty()){
            System.out.println("Invalid String!");
            sc.close();
            return;
        }

        Solution str = new Solution();
        boolean result = str.isPalindrome(s);

        sc.close();
    }
}