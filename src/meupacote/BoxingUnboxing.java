package meupacote;

public class BoxingUnboxing {
    public static void main(String[] args) {

        int x = 20;
        Object obj = x;             //Passando variável do Stack para a Heap
        System.out.println(obj);

        int y = (int) obj;          //Passando objeto da Heap para variável Stack, com Casting
        System.out.println(y);

        //Aplicando Wrapper classes

        Integer i = 35;
        System.out.println(i);

        int k = i * 5;
        System.out.println(k);
    }
}
