class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length()-1;

        while(i>=0 && s.charAt(i)== ' '){
            i--;
        }

        int count = 0;
        while(i>=0 && s.charAt(i)!= ' '){
            count++;
            i--;
        }

        return count;
    }

    public static void main(String ars[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String = ");
        String str = sc.nextLine();

        if(str.isBlank()){
            System.out.println("The string is empty");
            sc.close();
            return;
        }

        Solution s = new Solution();
        int result = s.lengthOfLastWord(str);
        System.out.println("The length of the last word = "+result);
        sc.close();
    }
}