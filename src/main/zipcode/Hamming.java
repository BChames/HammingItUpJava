package zipcode;


public class Hamming {

    String s;
    String s1;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        if(s.length() != s1.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance(){


        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(s1);
        int notEqual = 0;

        for (int i = 0; i < s.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                notEqual++;
            }
        }
        return notEqual;

    }
}
