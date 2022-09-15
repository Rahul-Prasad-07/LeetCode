import java.util.HashSet;
import java.util.Set;

public class Remove_String_from_vowels {

    public String removeVowels(String s){

        Set<Character> vowels =  new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){

            if(!vowels.contains(c)){
                result.append(c);
            }
        }

        return result.toString();
    }
}
