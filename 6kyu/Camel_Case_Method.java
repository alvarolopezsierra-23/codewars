// Write a method (or function, depending on the language) that converts a string to camelCase, that is, all words must have their first letter capitalized and spaces must be removed.

// Examples (input --> output):
// "hello case" --> "HelloCase"
// "camel case word" --> "CamelCaseWord"

public class Camel_Case_Method {

    public static String solution(String str) {
    boolean camel = true;
    String[] dvdWrd = str.split("");
    String result = "";
    for(int i=0; i<dvdWrd.length; i++){
        if(dvdWrd[i].equals(" ")) {camel = true;}
        else {
            if(camel){
                result += dvdWrd[i].toUpperCase();
                camel = false;
            } else {result += dvdWrd[i];}
        }
    }
    return result;
  }

}
