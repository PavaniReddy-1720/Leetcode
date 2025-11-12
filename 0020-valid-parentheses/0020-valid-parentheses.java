class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        //means:Go through each character c in the string s one by one.”
        // toCharArray()->That’s it 
        for (char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='[')
                stack.push(']');   
            else if(c=='{')
                stack.push('}');
            
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
}

//think to remeber: when i gave "(" it gave an error....so use '('


/*
2. What is a char[] (Character Array)?
A char[] is an array of characters — basically, it stores multiple characters together, like a string but in array form.
Example:
char[] arr = {'h', 'e', 'l', 'l', 'o'};

Each element can be accessed with an index:
System.out.println(arr[0]); // prints 'h'

Short form (what you wrote):
for (char c : s.toCharArray()) {
    // use c here
}

Full form (expanded version):
char[] arr = s.toCharArray();   // convert string to char array

for (int i = 0; i < arr.length; i++) {
    char c = arr[i];            // take each character one by one
    // use c here
}

*/