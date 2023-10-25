package javaClass2;

public class Stringhomework {
    public static void main(String[] args){
        String name = "kulwinder";
        String lastName ="takhar";
        System.out.println(name);
        System.out.println(lastName);


        System.out.println("Q2");
        String a = "  i love java  ";
        System.out.println(a.trim());


        System.out.println("Q3");
        String b = "i love java";
        String c = b.replace("i love","we love");
        System.out.println(c);


        System.out.println("Q4");
        String d = "i love java";
        int length = d.length();
        System.out.println("length of the sentence: " + length);



        System.out.println("Q5");
        String e = "i love java";
        String f = "i dream java";
        String g = e + " " + f;
        System.out.println(g);



        System.out.println("Q6");
        String h = "i@love@java";
        String i = "we love java";
        String j = h.replace(h,i);
        System.out.println(j);


        System.out.println("Q7");
        String k = "kulwinder takhar";
        String l = k.toUpperCase();
        System.out.println(l);



        System.out.println("Q8");
        String m = "I LOVE JAVA";
        String n = m.toLowerCase();
        System.out.println(n);




    }
}
