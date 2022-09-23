public class Main{
	public static void main(String args[]){
		Btree a = new Btree();
		
		a.add(5);
		a.add(8);
		a.add(7);
		a.add(2);
		a.add(3);
		a.add(1);
    a.add(6);
    a.add(5);
		
		a.show(); // apresentar os valores da árvore
    System.out.println("\n");
    System.out.println(a.qtdNodes());
    System.out.println("\n");
    a.folhas();
    System.out.println("\n");
    a.nodeLevel();
    System.out.println("\n");
    a.porNivel();
    System.out.println("\n");
    System.out.println(a.existe(10));
    System.out.println(a.existe(5));
    System.out.println("\n");
    a.niveis(5);
    System.out.println("\n");
    System.out.println(a.filhos());
    System.out.println("\n");
    System.out.println(a.nivel());
	}
}