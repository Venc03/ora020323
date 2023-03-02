package ciklusok;
public class Szamok {
    public static void main(String[] args) {
        kiiras1();
    }

    private static void kiiras1() {
        for (int r = 2; r <= 3; r++){
            for (int x = 2; x <= 4; x++){
                for (int i = 2; i <= 4; i++){
                    System.out.println(r + "" + x + "" + i);
                }
            }
        }
    }
    
}
