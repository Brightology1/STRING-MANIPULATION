public class StringReversal {
    public static void main(String[] args){

        String aJ = "Anokwuru Jacinta Elo...";
       // StringBuffer AJ = new StringBuffer(aJ);
      //  AJ.reverse();
        StringBuilder AJ = new StringBuilder(aJ);
        AJ.reverse();

//        char e[] = aJ.toCharArray();
//        int size = e.length;
//        char a[] = new char[size];
//        int i = 0;
//        while(i != size){
//            a[size-1-i] = e[i];
//            i++;

       // }
       // System.out.println(e);
       // System.out.println(a);
        System.out.println(AJ);
    }
}
