public class ReverseEachWordAndSentance {
    public static void main(String args[]) {
    String sentance = "My Name is Rohan Barai";
    String words [] = sentance.split(" ");
    String revWords="";
    String word="";
    for(int j = words.length-1; j >= 0 ; j --) {
        word = words[j];
        String revword="";
        for(int i = word.length() -1 ; i >= 0 ; i--) {
            revword+=word.charAt(i);
        }
        revWords+=revword+" ";
    }
    System.out.println(revWords);

    }
    
}
