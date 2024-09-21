// An array is called balanced if it's even numbered elements (a[0], a[2], etc.) 
// are even and its odd numbered elements (a[1], a[3],etc.) are Odd.
// Write a function named is Balanced that accepts an array of integers and returns 1 
// if the array is balanced otherwise it returns 0
package question3;

/**
 *
 * @author Saitech
 */
public class Question3 {
    public static int isBalanced(int [] a){
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                if(a[i]%2!=0){
                    return 0;
                }
            }
            else{
                if(a[i]%2==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a[]={2,5,10,3,2,3,4};
        System.out.println(isBalanced(a));
    }
    
}
