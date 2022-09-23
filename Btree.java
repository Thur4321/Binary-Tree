public class Btree{
	private Bnode raiz;
	
	public Btree(){
		raiz = null;
	}
	
	public void add(int valor){
		if(raiz != null){
			raiz.add(valor);
		} else{
			raiz = new Bnode(valor);
		}
	}
	
	public void show(){
		if(raiz != null) raiz.show();
	}

  public int qtdNodes(){
		if(raiz != null) return raiz.qtdNodes();
		else return 0;
	}

  public void folhas(){
    if(raiz != null) raiz.folhas();
  }

	public void nodeLevel(){
    if(raiz != null) raiz.nodeLevel(1);
  }

  public void porNivel(){
    if(raiz != null) raiz.nodePorNivel();
  }

  public boolean existe(int valor){
    if(raiz != null) return raiz.existe2(valor);
    else return false;
  }

  public void niveis(int valor){
    if(raiz != null) raiz.niveis(valor, 1);
  }

  public int filhos(){
		if(raiz != null) return raiz.filhos();
		else return 0;
	}

  public int nivel(){
    if(raiz != null) return raiz.nivel(1);
    else return 0;
  }
}