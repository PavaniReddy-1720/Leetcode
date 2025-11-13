class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();

        //sorting an array
        Arrays.sort(strs);

        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();

    }
}
/**
In Java, the StringBuilder class (in java.lang package) is used to create mutable (modifiable) strings, unlike String objects which are immutable.
Method	Purpose	Example
append()	Add text at the end	sb.append("World");
insert()	Insert text at a position	sb.insert(5, " ");
delete()	Remove characters	sb.delete(2, 5);
replace()	Replace part of string	sb.replace(0, 5, "Hi");
reverse()	Reverse the string	sb.reverse();
length()	Get current length	sb.length();
charAt()	Get a character	sb.charAt(2);
setCharAt()	Change a character	sb.setCharAt(0, 'H');
toString()	Convert to String	String s = sb.toString();
 */