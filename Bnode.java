public class Bnode{
	private int v;
	private Bnode esq, dir;
	
	public Bnode(int valor){
		v = valor;
		esq = dir = null;
	}
	
	public void add(int valor){
		if(valor <= v){
			if(esq != null) esq.add(valor);
			else esq = new Bnode(valor);
		}
		else{
			if(dir != null) dir.add(valor);
			else dir = new Bnode(valor);
		}
	}
	
	public void show(){
		
		if(esq != null) esq.show();
		System.out.println(v);
		if(dir != null) dir.show();
		
	}

  public int qtdNodes(){
		int e=0, d=0; 
		
		if(esq != null) e = esq.qtdNodes();
		if(dir != null) d = dir.qtdNodes();
		
		return 1 + e + d;
	}

  public void folhas(){
    if(esq != null) esq.folhas();
    if(dir != null) dir.folhas();
    if(esq == null && dir == null) System.out.println(v);
  }

  public void nodeLevel(int nivel){
    if(esq != null) esq.nodeLevel(nivel+1);
		System.out.print("Nível: " + nivel + "; Valor: ");
		System.out.println(v);
		if(dir != null) dir.nodeLevel(nivel+1);
		
  }

  public void porNivel(int nivel, int nivelDoNo){
		if(nivel == nivelDoNo) System.out.println("Nível: " + nivel + "; Valor: " + v);
    if(esq != null) esq.porNivel(nivel, nivelDoNo + 1);
    if(dir != null) dir.porNivel(nivel, nivelDoNo + 1);
  }

  public void nodePorNivel(){
    for(int i = 1; i <= nivel(1); i++){
      porNivel(i, 1);
    }
  }

  public boolean existe1(int valor){
    boolean x = false;
    if(v == valor) x = true;
    else{
      if(esq != null){
        if(esq.existe1(valor)) x = true;
      }
      if(dir != null){
        if(dir.existe1(valor)) x = true;
      }
    }
    return x;
  }

  public boolean existe2(int valor){
    if(v == valor) return true;
    else{
      if(valor < v){
        if(esq != null) return esq.existe2(valor);
        else return false;
      }
      else{
        if(dir != null) return dir.existe2(valor);
        else return false;
      }
    }
  }

  public void niveis(int valor, int nivel){
    if(esq != null) esq.niveis(valor, nivel+1);
		if(v == valor) System.out.println(nivel);
		if(dir != null) dir.niveis(valor, nivel+1);
		
  }

  public int filhos(){
		if(esq == dir) return 0;
    else if(esq != null && dir != null) return esq.filhos() + dir.filhos();
    else if(esq != null && dir == null) return 1 + esq.filhos();
    else if(esq == null && dir != null) return 1 + dir.filhos();
    else return 0;
	}

  public int nivel(int nivel){
    int alturaEsq = 0;
    int alturaDir = 0;
    int altura = 0;
    if(esq != null){
      if(nivel > esq.nivel(nivel+1)) alturaEsq = nivel + 1;
      else alturaEsq = esq.nivel(nivel+1);
    }
    if(dir != null) {
      if(nivel > dir.nivel(nivel+1)) alturaDir = nivel + 1;
      else alturaDir = dir.nivel(nivel+1);
    }
    if(alturaDir > alturaEsq) altura = alturaDir;
    else altura = alturaEsq;

    return altura;
  }
}