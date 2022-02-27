
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaBinaria {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(32);
		lista.add(4);
		lista.add(1);
		lista.add(20);
		lista.add(53);
		lista.add(32);
		lista.add(324);
		lista.add(3);
		lista.add(3324);
		lista.add(20);
		lista.add(534);
		lista.add(352);
		lista.add(3824);
		lista.add(13);
		lista.add(433244);
		lista.add(332);
		lista.add(491);
		lista.add(18);
		lista.add(69);
		lista.add(953);
		lista.add(3072);
		lista.add(74);
		lista.add(55);
		lista.add(352);
		lista.add(4);
		lista.add(2231);
		lista.add(2320);
		lista.add(253);
		lista.add(532);
		lista.add(1324);
		lista.add(33);
		lista.add(37324);
		lista.add(270);
		lista.add(5434);
		lista.add(9352);
		lista.add(3824);
		lista.add(613);
		lista.add(4633244);
		lista.add(33462);
		lista.add(4491);
		lista.add(118);
		lista.add(619);
		lista.add(9353);

//		teste(lista, 1111);//Nao existe
//		teste(lista, 1);//primeiro da lista
		teste(lista, 352);//meio da lista
	}

	public static void teste(List<Integer> lista, int nota) {
		Collections.sort(lista);
		int meio = lista.size();
		System.out.println(meio);
		if (lista.isEmpty()) {
			System.out.println("Nao Encontrado");
			return;

		} else {
			meio = meio / 2;
			int notaA = lista.get(meio);
			if (notaA == nota) {
				System.out.println( "-, "  +notaA);
			} else {
				if (notaA < nota) {
			
					lista.remove(meio);
					List<Integer> novaLista = lista.subList(meio, lista.size());
					teste(novaLista, nota);
				} else {
					lista.remove(meio);

					List<Integer> novaLista = lista.subList(0, meio);
					teste(novaLista, nota);
				}
			}
		}
	}
}
