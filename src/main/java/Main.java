public class Main {
    public static void main(String[] args) {
        String fam1 = "БЕРЕЗИН";
        String fam2 = "ПЕТРОВ";
        String fam3 = "ИВАНОВ";
        String fam4 = "СМИРНОВ";
        String prover = "ИВАНОВ";
        if (fam1.indexOf(prover) != -1) {
            System.out.println("ИВАНОВ есть");
        } else {
            if (fam2.indexOf(prover) != -1) {
                System.out.println("ИВАНОВ есть");
            } else {
                if (fam3.indexOf(prover) != -1) {
                    System.out.println("ИВАНОВ есть");
                } else {
                    if (fam4.indexOf(prover) != -1) {
                        System.out.println("ИВАНОВ есть");
                    } else {
                        System.out.println("ИВАНОВ нет");
                    }
                }
            }
        }
    }
}