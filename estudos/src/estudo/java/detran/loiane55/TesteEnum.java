package estudo.java.detran.loiane55;

import estudo.java.detran.loiane53.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i = 0; i < dias.length; i++){
			System.out.println(dias[i]);
		}
		
		System.out.println("-----+-----+-------+----");
		for(DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
	}

}
