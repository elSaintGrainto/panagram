public class Panagram {
    public static void main(String args[]) {
        
        
        String strToTest="The quick brown fox jumps o he lazy dog";//another = Pack my box with five dozen liquor jugs
        char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int albLen=alphabet.length;
        int cont=0;
        String notFounded="";
        System.out.println("Check if a Phrase is a Panagram");
        System.out.println("let's check the phrase:" + strToTest);
        
        for(char c:alphabet){
          if(strToTest.toLowerCase().contains(c + "" )){
             cont++; 
          }else notFounded+=c;
        }
        
        if(cont==albLen) System.out.println("WOW is a Panagram");
        else System.out.println("Is not a Panagram");
        
        System.out.println("must encounter : " + albLen +" characters and encounter : " + cont);
        
        if(notFounded.length()>0)System.out.println("these letters was not founded : "+notFounded.toUpperCase());
      
    }
}
