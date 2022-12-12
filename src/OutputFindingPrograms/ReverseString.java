package OutputFindingPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str="Capgemini";
        String nstr="";
        char ch;
        for(int i=0;i<str.length()-1;i++)
        {
            ch =str.charAt(i);
         nstr=ch+nstr;


        }
        System.out.println(nstr);

    }
}
