package ARRAY;

public class Reverse {
    void everse(){
        int re []={2,4,6,8};
        int reb=0;
        for(int i=0;i<re.length;i++){

            reb+=i;
        }
        System.out.println(reb);
    }

    public static void main(String[] args) {
        Reverse d= new Reverse();
        d.everse();
    }
}
