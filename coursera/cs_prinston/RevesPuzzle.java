public class RevesPuzzle {
    
    // Write a program RevesPuzzle.java that takes an integer command-line 
    // argument n and prints a solution to Reve’s puzzle. 
    // Assume that the the discs are labeled in increasing order of size 
    // from 1 to n and that the poles are labeled A, B, C, and D, 
    // with A representing the starting pole and D representing the destination pole

    public static String move(int h, int l, String from, String mid, String to) {

        if (h < l) return "";
        String output = "";
        output += move(h - 1, l, from, to, mid);
        output += "Move disc " + h + " from " + from + " to " + to + "\n";
        output += move(h - 1, l, mid, from, to);
        return output;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
        String output = "";
        output += move(k, 1, "A", "C", "B");
        output += move(n, n - k + 1, "A", "C", "D");
        output += move(k, 1, "B", "C", "D");
        StdOut.print(output);
    }   
}
