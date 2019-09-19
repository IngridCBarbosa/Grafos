package grafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Grafo {
	private ArrayList<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	public Grafo() {
		this.adj = new ArrayList[0];
	}
	
	public int getNumVertices() {
		return adj.length;
	}
	
	public List<Integer> getAdjacentes(int v) {
		return adj[v]; 
	}
	
	@SuppressWarnings("unchecked")
	public void lerArquivo(String nomeArquivo) throws IOException {
		BufferedReader inputFile = new BufferedReader(new FileReader(nomeArquivo));
		StringTokenizer tokenizer;
		
		String line;
		int numVertices;
		
		line = inputFile.readLine();
		numVertices = Integer.parseInt(line.trim());
		this.adj = new ArrayList[numVertices];

		String sucessorStr;
		int sucessor;
		
		for (int v = 0; v < numVertices; v ++) {
			this.adj[v] = new ArrayList();
			
			line = inputFile.readLine();
			tokenizer = new StringTokenizer(line);
			
			while (tokenizer.hasMoreTokens()) {
				sucessorStr = tokenizer.nextToken();
				sucessor = Integer.parseInt(sucessorStr.trim());
				
				if (sucessor != -1) {
					this.insereAresta(v, sucessor);
				}
			}
		}
	}
	
	
	private void insereAresta(int v, int u) {
		adj[v].add(u);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < adj.length; i ++) {
			builder.append("Adj[");
			builder.append(i);
			builder.append("] = ");
			builder.append(adj[i].toString().replace('[', '{').replace(']', '}'));
			builder.append("\n");
		}
		
		return builder.toString();
	}
        
    public void matrizAdj(int[][] m) {
        int j;
        List<Integer> aux;
        for (j = 0; j < getNumVertices(); j++) {
            aux = getAdjacentes(j);//pega a lista na posição j do vetor
            for (Integer i : aux) {// iteração com a lista e não com vetor
                m[i][j] = 1;
            }
        }
    }
        
    public void exibe(int[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.print("\n");
        }
    }
        
    public void listaAdj(int[][] m) {
        int i, j = 0;
        for (i = 0; i < getNumVertices(); i++) {
            if (m[i][j] != 0) {
                insereAresta(i, j);
            }
            j++;
        }
    }
    
    public int[] grauDoVertice(){
        int i,cont = 0;
        List<Integer> aux;
        int [] grau = new int [getNumVertices()];
        for(i = 0; i < getNumVertices(); i++){
            aux = getAdjacentes(i);
            cont = 0;
            for(Integer obj: aux){
                cont++;
            }
            grau[i] = cont;
        }
        return grau;
    }
    
    public void exibeVetor(int []v){
        int i;
        
        for( i = 0; i < v.length; i++){
            System.out.println("Grau["+i+"]= "+v[i]);
        }
    }
    
    public int grauMinimo(int [] v){
        int i;
        int minimo = v[0];
        
        for(i = 0; i < v.length; i++){
            if(v[i] < minimo){
                minimo = v[i];
            }
        }
        return minimo;
    }
    
    public int grauMaximo(int [] v){
        int i;
        int maximo = v[0];
        
        for(i = 0; i < v.length; i++){
            if(v[i]> maximo){
                maximo = v[i];
            }
        }
        return maximo;
    }
    public int grausImpar(int [] v){
        int i;
        int cont = 0;
        for( i = 0; i < v.length;i++){
            if(v[i]% 2 != 0){
                cont++;
            }
        }
        return cont;
    }
    
    public int grauPar(int [] v){
        int i;
        int cont = 0;
        for(i = 0; i <v.length; i++){
            if(v[i]%2 ==0){
                cont++;
            }
        }
        return cont;
    }
    
    /*public boolean temCaminho(){
        int i;
        List<Integer> aux;
        int saida = 0,dv;
        int []vetorAux = new int [adj.length];
        dv = getNumVertices() - 1;
        for(i = 0; i < adj.length;i++){
            aux = adj[i];
            if(aux == null){
                saida = i;
            }
            else{
                vetorAux[aux.get(i)]++;
            }
        }
        for( i = 0; i < adj.length; i++){
            if(vetorAux[i] == dv && vetorAux[i] == saida){
                return true;
            }
        }
        return false;
    }*/
}
