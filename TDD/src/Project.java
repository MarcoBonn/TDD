public class Project {
    String[][] eingabe;
    
    public Projekt (String[][] eingabe) {
        this.eingabe = eingabe;
    }
    
    public boolean isWellSorted(String[] inp) {
        if (inp.length < 2) return false;
        for (int i = 0; i < inp.length; i++) {

            for (String[] a : eingabeKonstruktor) {

                if (a[0].equals(inp[i])) {
                    for (int j = 0; j < i; j++) {
                        if (a[1].equals(inp[j])) return false;

                    }
                }
                if (a[1].equals(inp[i])) {
                    for (int j = i + 1; j < inp.length; j++) {
                        if (a[0].equals(inp[j])) return false;
                    }
                }
            }

            for (int j = i + 1; j < inp.length; j++) {
                if (inp[i].equals(inp[j])) return false;
            }
        }
        return true;
    }
    
}
