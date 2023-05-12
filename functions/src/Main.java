public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main mainobj = new Main();
        int x= 10;
        int y = 20;

       int ans = getArea(x,y);
        System.out.println(ans);
    }

     static int getArea(int l , int b){
        return l*b;

    }
}