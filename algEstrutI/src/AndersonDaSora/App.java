package AndersonDaSora;


public class App {
    public static void main(String[] args) {
        AnderssonTreeOfInteger a = new AnderssonTreeOfInteger();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        //a.remove(0);
        //a.remove(3);
        //a.remove(1);
        //a.remove(5);
        //a.remove(4);
        //a.remove(2);
        //a.remove(6);
        System.out.println("Altura: " + a.height());
        System.out.println(a.positionsPos().toString());
        System.out.println("Raiz: " + a.getRoot());
        System.out.println("Qnt de Folhas: " + a.contaNumeroFolhas());
        System.out.println("Count: "+ a.getCount());
        System.out.println("M�dia dos valores:" + a.calculaMedia());
        
        AnderssonTreeOfInteger b = a.clone();        
        System.out.println("Arvore b: "+ b.positionsPos().toString()+"\n Final");
        System.out.println("Altura: " + b.height());        
        System.out.println("Raiz: " + b.getRoot());
        System.out.println("Qnt de Folhas: " + b.contaNumeroFolhas());
        System.out.println("Count: "+ b.getCount());
        System.out.println("M�dia dos valores:" + b.calculaMedia());
    }
}
