import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Insertion {
	
	public static int lista[] = new int[100];
	public static int listaOrdenada[] = new int[100];
	public static int listaInversa [] = new int [100];
	
	public static void main(String[] args) {
		apresentaOpcoes();
	}
	
	public static void apresentarListaOriginal() {
		String original = "";
		for (int i = 0; i < lista.length; i++) {
			original += lista[i] + " ";
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();
	}
	
	public static void apresentarListaOrdenada() {
		String original = "";
		for (int i = 0; i < listaOrdenada.length; i++) {
			original += listaOrdenada[i] + " ";
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();
	}
	
	public static void preencherLista() {
		List<Integer> elementos = new ArrayList<>();
        int[] valores = {
            432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 
            890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 
            712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 
            561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 
            886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 
            692, 993, 183, 553, 846, 24, 954, 286, 647, 129
        };

        // Preenchendo a lista com os valores do array
        for (int valor : valores) {
            elementos.add(valor);
        }
        for(int i = 0; i < lista.length; i++){
            lista [i] = elementos.get(i);
        }
		
		
		apresentaOpcoes();
	}
	
	public static void ordenarLista() {
		List<Integer> elementos = new ArrayList<>();
        int[] valores = {
            432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 
            890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 
            712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 
            561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 
            886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 
            692, 993, 183, 553, 846, 24, 954, 286, 647, 129
        };

        // Preenchendo a lista com os valores do array
        for (int valor : valores) {
            elementos.add(valor);
        }
        for(int i = 0; i < listaOrdenada.length; i++){
            listaOrdenada [i] = elementos.get(i);
        }
		int aux, j;
		for(int i = 1; i < listaOrdenada.length; i++){
			aux = listaOrdenada[i];
			j = i -1;
			while (j >= 0 && listaOrdenada[j] > aux) {
				listaOrdenada[j + 1] = listaOrdenada[j];
				j--;
			}
			listaOrdenada[j + 1 ] = aux;
		}
		apresentaOpcoes();
	}
	public static void apresentarlistainversa(){
		List<Integer> elementos = new ArrayList<>();
        int[] valores = {
            432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 
            890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 
            712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 
            561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 
            886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 
            692, 993, 183, 553, 846, 24, 954, 286, 647, 129
        };

        // Preenchendo a lista com os valores do array
        for (int valor : valores) {
            elementos.add(valor);
        }
        for(int i = 0; i < listaInversa.length; i++){
            listaInversa [i] = elementos.get(i);
        }
		Arrays.sort(listaInversa);
		for (int i = 0; i < listaInversa.length / 2; i++) {
            int t = listaInversa[i];
            listaInversa[i] = listaInversa[listaInversa.length - 1 - i];
            listaInversa[listaInversa.length - 1 - i] = t;
		}
		String original = "";
		for (int i = 0; i < listaInversa.length; i++) {
			original += listaInversa[i] + " ";
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();	
	}
	public static void apresentarlistainversaOriginal(){
		List<Integer> elementos = new ArrayList<>();
        int[] valores = {
            432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 
            890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 
            712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 
            561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 
            886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 
            692, 993, 183, 553, 846, 24, 954, 286, 647, 129
        };

        // Preenchendo a lista com os valores do array
        for (int valor : valores) {
            elementos.add(valor);
        }
        for(int i = 0; i < listaInversa.length; i++){
            listaInversa [i] = elementos.get(i);
        }
		for (int i = 0; i < listaInversa.length / 2; i++) {
            int t = listaInversa[i];
            listaInversa[i] = listaInversa[listaInversa.length - 1 - i];
            listaInversa[listaInversa.length - 1 - i] = t;
		}
		String original = "";
		for (int i = 0; i < listaInversa.length; i++) {
			original += listaInversa[i] + " ";
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();
	}
	public static void tempoExec(){
		long tempo = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, tempo);
		apresentaOpcoes();
	}
	
	public static void apresentaOpcoes() {
		String opcao = JOptionPane.showInputDialog(
			" 1 - Preencher lista \n" +
			" 2 - Ordenar lista \n" +
			" 3 - Apresentar lista ordenda \n" +
			" 4 - Apresentar lista original \n" +
			" 5 - Sair \n" +
			" 6 - Tempo de execução do melhor caso \n"+
			"7 - Apresentar Lista Inversa Ordenada \n"+
			"8 - Apresentar Lista Inversa Original\n"
		);
		
		if(opcao.equals("1")) {
			preencherLista();
		} else if (opcao.equals("2")) {
			ordenarLista();
		} else if (opcao.equals("3")) {
			apresentarListaOrdenada();
		} else if (opcao.equals("4")) {
			apresentarListaOriginal();
		} else if (opcao.equals("5")){
			System.exit(0);
		} else if (opcao.equals("6")) {
			tempoExec();
		} else if (opcao.equals("7")){
			apresentarlistainversa();
		} else if (opcao.equals("8")){
			apresentarlistainversaOriginal();
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}

}


