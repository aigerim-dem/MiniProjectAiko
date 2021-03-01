public class Stringlesson {
    public static void main (String [] args) {
       /* String s = "Cristiano";
        for (int i=0; i<s.length(); i++){
            System.out.println(i);
        }
        String s1 = "Cristiano";
        String s2 = "Cristiano";
        if (s1.equals(s2)) System.out.println("Equal");
            else System.out.println("Not equal");
            if (s1.equalsIgnoreCase(s2)) System.out.println("Equal");
        System.out.println((s1.trim()));
        int i=9;
        String e = String.valueOf(i); //
        String h="10";
        int r =Integer.parseInt(h);


        String s3= "10.5";
        double d3= Double.parseDouble(s2);
        String s4 = "Cristiano";
        System.out.println(s4.indexOf("a"));*/


        int [] num = {6,4,2,8,5,10,7,8};
        int a = 2;
        int b=3;
        int temp = num[a];
        num [a] = num[b];
        num [b] = temp;
        for (int i = 0; i< num.length;i++)
        System.out.print(num[i] + " ");


    }
}
