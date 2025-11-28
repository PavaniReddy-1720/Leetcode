class Solution {
    // Return True if the given trees are isomorphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2) {
        
        // If both roots are null => isomorphic
        if (root1 == null && root2 == null) return true;
        
        // If one is null and the other is not => not isomorphic
        if (root1 == null || root2 == null) return false;
        
        // If root values differ => not isomorphic
        if (root1.data != root2.data) return false;
        
        // Check NO-SWAP case
        boolean noSwap = isIsomorphic(root1.left, root2.left) &&
                         isIsomorphic(root1.right, root2.right);
                         
        // Check SWAP case
        boolean swap = isIsomorphic(root1.left, root2.right) &&
                       isIsomorphic(root1.right, root2.left);
                       
        // If any one case matches → trees are isomorphic
        return noSwap || swap;
    }
}
