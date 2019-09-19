package grafo;

import java.io.IOException;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import org.gephi.graph.api.*;
import org.gephi.io.processor.plugin.DefaultProcessor;
import org.gephi.preview.api.PreviewController;
import org.gephi.preview.api.PreviewModel;
import org.gephi.preview.api.PreviewProperty;
import org.gephi.preview.api.RenderTarget;
import org.gephi.preview.types.DependantOriginalColor;
import org.gephi.project.api.ProjectController;
import org.gephi.project.api.Workspace;
import org.openide.util.Lookup;

public class Main {

	
	public static void main(String[] args) throws IOException {
	/*	Grafo g = new Grafo();
                
                       


		g.lerArquivo("grafo-01.txt");
		int [][] matriz = new int [g.getNumVertices()][g.getNumVertices()];
		System.out.println(g);
                
                System.out.println("Matriz zerada");
                g.exibe(matriz);
                System.out.println("----------");
                g.matrizAdj(matriz);
                System.out.println("Matriz adjacente");
                g.exibe(matriz);
                System.out.println("Lista adjacente");
                g.listaAdj(matriz);
                System.out.println(g);
                
                int [] grau;
                
                grau = g.grauDoVertice();
                
                g.exibeVetor(grau);
                
                int grauMinimo;
                int grauMaximo;
                
                grauMinimo = g.grauMinimo(grau);
                System.out.println("O grau minimo e = "+grauMinimo);
                
                grauMaximo = g.grauMaximo(grau);
                System.out.println("O grau maximo e = "+grauMaximo);
                
                int grauImpar;
                int grauPar;
                
                grauImpar = g.grausImpar(grau);
                System.out.println("No grafo tem "+grauImpar+" graus ímpares");
                
                grauPar = g.grauPar(grau);
                System.out.println("No grafo tem "+grauPar+" graus Pares");*/
        
        
                 GraphModel graphModel = Lookup.getDefault().lookup(GraphController.class).getGraphModel();
                  Node n0 = graphModel.factory().newNode("n0");
                
   

                
	}

}
