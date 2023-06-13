package Teste;

import java.util.*;

public class Anagramas {
	public static void main(String[] args) {
		String vetorPalavras[] = {"saco", "cosa", "asco", "suco", "analise", "socu"};
		List <String> listPalavras = new ArrayList<String>();
		listPalavras = Arrays.asList(vetorPalavras);
		Map<String, Set<String>> anagrama = new HashMap<String, Set<String>>();
		for(String auxString : listPalavras) {
			char[] palavraEmChar = auxString.toCharArray();
			Arrays.sort(palavraEmChar);
			String palavraOrdenada = String.copyValueOf(palavraEmChar);
			boolean verificado = false;
			for(String stringSet : anagrama.keySet()) {
				if(stringSet.equals(palavraOrdenada)) {
					Set<String> setExistente = anagrama.get(palavraOrdenada);
					setExistente.add(auxString);
					verificado = true;
					break;
				}
			}
			if(!verificado) {
				Set<String> setNovo = new HashSet<String>();
				setNovo.add(auxString);
				anagrama.put(palavraOrdenada, setNovo);
			}
		}
		for(Set<String> aux : anagrama.values()) {
			for(String auxString : aux) {
				System.out.println(auxString+" ");
			}
			System.out.println();
		}
	}
}
