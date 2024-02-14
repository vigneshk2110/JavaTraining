import java.util.ArrayList;
import java.util.Arrays;

public class ReservedWords {

    public static void main(String[] args) {

        String dataTypeKeywords = "boolean byte char double float int long short";
        String [] dataTypeString = dataTypeKeywords.split(" ");

        System.out.println("Data type keywords in Java");

        for (String word : dataTypeString) {
            System.out.println(word);
        }

        System.out.println("---------------------------------------------------");

        String modifierKeyword = "abstract final native private protected public static strictfp synchronized transient volatile";
        String[] modifierKeywordString = modifierKeyword.split(" ");

        System.out.println("Modifier keywords in Java");
        for (String word : modifierKeywordString) {
            System.out.println(word);
        }

        System.out.println("---------------------------------------------------");
        
        String controlFlowKeyword = "break case continue default do else for if goto return switch while";
        String[] controlFlowKeywordString = controlFlowKeyword.split(" ");
        
        System.out.println("Control Flow keywords in Java");
        for (String word : controlFlowKeywordString) {
            System.out.println(word);
        }

        System.out.println("---------------------------------------------------");

        String exceptionKeyword = "catch finally throw throws";
        String[] exceptionKeywordString = exceptionKeyword.split(" ");

        System.out.println("Exception keywords in Java");
        for (String word : exceptionKeywordString) {
            System.out.println(word);
        }

        System.out.println("---------------------------------------------------");

        String otherKeyword = "class const enum extends implements import interface new package super this void";
        String[] otherKeywordString = otherKeyword.split(" ");

        System.out.println("Other keywords in Java");
        for (String word : otherKeywordString) {
            System.out.println(word);
        }

    }
}