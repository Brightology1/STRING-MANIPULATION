public class StringContainsIntegers {
    public static void main(String[] args) {
        String str = "123456AA789";
        //System.out.println(str.matches("\\d+"));
//        char [] y = str.toCharArray();
//        for(int i = 0; i < y.length; i++) {
//            if(y[i] >= '0' && y[i] <= '9') {
//                i++;
//            }
//            else {
//                System.out.println("IT IS NOT A STRING INTEGER");
//                System.exit(0);
//            }
//        }
//        System.out.println("IT IS A STRING INTEGER");
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                i++;
            }
            else {
                System.out.println("IT IS NOT A STRING INTEGER");
                System.exit(0);
            }
        }
        System.out.println("IT IS A STRING INTEGER");
    }
}
