class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int s1 = s.length();
        
        for(int i=0;i<s1;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int t1 = t.length();
        
        for(int i=0;i<t1;i++)
        {
            if(!map.containsKey(t.charAt(i)))
            {
                return false;
            }
            else if(map.containsKey(t.charAt(i)))
            {
                if(map.get(t.charAt(i))==0)
                {
                    return false;
                }
                else{
                    map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
                }
            }
        }
        
        return true;
        
        
    }
}
