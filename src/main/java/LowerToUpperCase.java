public class LowerToUpperCase {
    public static void main(String[] args) {
        String s = "hello world";
     //   System.out.println(s.toUpperCase());
        // OR
//        char []y = s.toCharArray();
//        for(int i=0;i<y.length;i++){
//            if(y[i]>='a' && y[i]<='z'){
//                y[i] = (char)(y[i]-'a'+'A');
//            }
//        }
//        System.out.println(y);
        // OR
        char []y = s.toCharArray();
        int size = y.length;
        int i=0;
        while(i != size){
            if(y[i] != ' '){
            y[i] = (char) (y[i] - 32);
            }
            i++;
        }
        System.out.println(s);
        System.out.println(y);
      }
}
