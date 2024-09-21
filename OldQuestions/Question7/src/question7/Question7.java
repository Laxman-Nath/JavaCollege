package question7;
// odd -> even hunuvayena
// mid -> sabai element mid vanda thulo hunupryo (mid lai compare nagarne)
// -> euta element pani mid vanda syano vaye pugyo(fail garauna)
// greater -> equal to or smaller.
public class Question7 {

    static int Centered(int a[]) {
        if (a.length % 2 == 0) {
            return 0;
        } else {
            int mid = a[a.length / 2];
            int midIndex = a.length / 2;
            for (int i = 0; i < a.length; i++) {
                if (i!=midIndex) { 
                    if (a[i] <= mid) {
                        return 0;
                    }
                }
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int a[] = {10, 9, 8, 8, 12};
        System.out.println(Centered(a));
//      System.out.println(a.length);
    }

}
