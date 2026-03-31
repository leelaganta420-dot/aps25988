class Solution {
        public List<Integer> findAnagrams(String s, String p) {
                // brute force approach
                        // TC:- O(n*klogk) // not optimised approach

                                //List<Integer>res=new ArrayList<>();
                                        // int left=0;
                                                // char[] arr=p.toCharArray();
                                                        // Arrays.sort(arr);
                                                                // for(int i=0;i<=s.length();i++){
                                                                        //     char[] str=s.substring(left,i).toCharArray();
                                                                                //     Arrays.sort(str);
                                                                                        //     if(Arrays.equals(str,arr)) res.add(left);
                                                                                                //     while(i-left+1>p.length()){
                                                                                                        //         left++;
                                                                                                                //     }
                                                                                                                        // }
                                                                                                                                // return res;


                                                                                                                                        //OPTIMISED APPROACH
                                                                                                                                                //TC:-O(n*k)//k=26 because we are checking each character freq with Arrays.equals()

                                                                                                                                                        List<Integer>res=new ArrayList<>();
                                                                                                                                                                int[] pfreq=new int[26];
                                                                                                                                                                        int[] sfreq=new int[26];
                                                                                                                                                                                for(char ch:p.toCharArray()){
                                                                                                                                                                                            pfreq[ch-'a']++;
                                                                                                                                                                                                    }
                                                                                                                                                                                                            int left=0;
                                                                                                                                                                                                                    for(int i=0;i<s.length();i++){
                                                                                                                                                                                                                                char ch=s.charAt(i);
                                                                                                                                                                                                                                            sfreq[ch-'a']++;
                                                                                                                                                                                                                                                        while(i-left+1>p.length()){
                                                                                                                                                                                                                                                                        sfreq[s.charAt(left)-'a']--;
                                                                                                                                                                                                                                                                                        left++;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                if(Arrays.equals(pfreq,sfreq)) res.add(left);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                return res;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    
}