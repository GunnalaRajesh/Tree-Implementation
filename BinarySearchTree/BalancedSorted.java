// Inserting the sorted ordered elements in to BST directly then it will become sewed Binary tree
// with time complexity O(n) hence it loses its balancing capacity so instead directly inserting
// we can use Binary search method (dividing into 2 halves and insert mid-value to tree) this gives O(log(n))


package Trees.BinarySearchTree;
public class BalancedSorted {
    public static void main(String[] args) {
        BinarySearchTrees trees = new BinarySearchTrees();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        sortedPopulate(arr,0,arr.length-1,trees);
        trees.display();

    }
    public static void sortedPopulate(int[] arr, int start, int end, BinarySearchTrees trees){
        if(start > end){
            return;
        }
        int mid = start+(end-start)/2;
        trees.insert(arr[mid]);
        sortedPopulate(arr,start,mid-1,trees);
        sortedPopulate(arr,mid+1,end,trees);
    }

}
