// A non-empty array A of length n is called on array of all possibilities 
// if it contains all numbers between 0 and A.length-1 inclusive. Write a method
// named isAllPossibilities that accepts an integer array and returns 1 if the array 
// is an array of all possiblities, otherwise it returns 0.
package question2;

public class Question2 {

    public static int isAllPossibilities(int a[]) {
        if (a.length == 0) {
            return 0;
        } else {
            for(int i=0;i<a.length-1;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        return 0;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= a.length || a[i] < 0) {
                    return 0;
                }
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        int a[] = {0,1,2,4,4};
        int x = isAllPossibilities(a);
        System.out.println(x);

    }

}
