public class occurence {
    public static void main(String[] args) {
            String str = "aabba";
            int count[] = new int[str.length()];
            
            for(int i = 0; i < str.length(); i++) {
                for(int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)) {
                        count[i]++;
                    }
                }
                System.out.print(count[i]);
            }
        }
    }

