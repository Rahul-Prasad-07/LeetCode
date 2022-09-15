package Array;

public class StringCompression {

    public static void main(String[] args) {
        String[] array =  new String[]{"a", "a", "b", "b", "c", "c", "c"};
       
    }

        public static int compress(char[] chars) {
            int index = 0;
            int i =0;                                    //pointer that walk through entier string array
            while(i < chars.length) {

                int j = i;                               // second pointer that compare to i

                while (j < chars.length && chars[j] == chars[i]) {
                    j++;
                }

                chars[index++] = chars[i];             //where two chars are same , reacord the char

                if(j-i > 1 ){                            // if we saw the char >1  then we have to compressed it.

                    String count = j - i + " ";           // j - i int is converted into string

                    for ( char c : count.toCharArray()){

                        chars[index++] = c;
                    }
                }

                i = j ;                                    // update i = j
            }

            return index;

        }
    }

