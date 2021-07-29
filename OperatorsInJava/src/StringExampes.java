public class StringExampes {
    public static void main(String[] args) {

        String welcom = " Welcom to fouad land ";
        System.out.println(welcom.length());
        System.out.println(welcom.charAt(0));
        System.out.println(welcom.indexOf("f"));
        System.out.println(welcom.indexOf("a",14));
        System.out.println(welcom.lastIndexOf("to"));
        String  SubText = welcom.substring(10);
        System.out.println(SubText);
        System.out.println(welcom.substring(10));
        System.out.println(welcom.substring(10,15));
        System.out.println(welcom.replace("a","X"));
        System.out.println(welcom.replaceFirst("a","X"));
        System.out.println(welcom.toUpperCase());
        System.out.println(welcom.toLowerCase());
        // welcom = welcom.toUpperCase();
        //System.out.println(welcom);
        System.out.println(welcom.trim());
        System.out.println(welcom.contains("fouad"));
        System.out.println(welcom.startsWith(" "));
        System.out.println(welcom.endsWith(" "));

    }
}
