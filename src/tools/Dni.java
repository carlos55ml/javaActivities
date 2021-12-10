package tools;

public class Dni {

    private char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Dni(){
    }

    public boolean checkDni(String d) {
        int number = 0, res = 0;
        char letter;
        if (d.length() == 9) {
            try {
                d = d.toUpperCase();
                letter = d.charAt(8); // 00000000Z <-
                number = Integer.parseInt(d.substring(0,d.length()-1));
            } catch (Exception e) {
                System.out.print("\nEl DNI \""+d+"\" NO ES VALIDO.");
                return false;
            }

            res = number%23;

            if (letter == letters[res]) {
                return true;
            } else {
                System.out.print("\nEl DNI \""+d+"\" NO ES VALIDO .");
                return false;
            }
        } else {
            System.out.print("\nEl DNI \""+d+"\" NO ES VALIDO.");
            return false;
        }
    }

}
