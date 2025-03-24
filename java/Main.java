class Main {
    public static void main(String[] args) {
        String a="bhagyashri";
        String b="Bamane";
        String c=a+"@"+b;
        System.out.println(c.length());
        for(int i=0; i<c.length(); i++){
            //System.out.println(c.charAt(i));
        }
        String str="abcd";
        String  str1="abbcd";
        if(str.compareTo(str1)==0){
            System.out.println("equals");
        }
        else{
            System.out.println("not");
        }
    }
}