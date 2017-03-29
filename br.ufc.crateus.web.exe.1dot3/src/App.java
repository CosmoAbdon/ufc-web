import entidades.Atleta;
import entidades.Equipe;
import entidades.EquipeFutebol;
import entidades.EquipeJudo;
import entidades.EquipeVolei;
import entidades.PartidaMaiorEquipeIndividual;
import entidades.PartidaMaiorIndvIndividual;

public class App {

	public static void main(String[] args) {
		
		//Partidas : Equipe - 1x1
		EquipeFutebol brasilFutebol = new EquipeFutebol("Brasil", new Atleta("Roberto1"), new Atleta("Roberto2"), new Atleta("Roberto3"), new Atleta("Roberto4"), new Atleta("Roberto5"), new Atleta("Roberto6"), new Atleta("Roberto7"), new Atleta("Roberto8"), new Atleta("Roberto9"), new Atleta("Roberto10"), new Atleta("Roberto11"));
		EquipeFutebol alemanhaFutebol = new EquipeFutebol("Alemanha", new Atleta("Robert1"), new Atleta("Robert2"), new Atleta("Robert3"), new Atleta("Robert4"), new Atleta("Robert5"), new Atleta("Robert6"), new Atleta("Robert7"), new Atleta("Robert8"), new Atleta("Robert9"), new Atleta("Robert10"), new Atleta("Robert11"));
		EquipeFutebol argentinaFutebol = new EquipeFutebol("Argentina", new Atleta("Maradona1"), new Atleta("Maradona2"), new Atleta("Maradona3"), new Atleta("Maradona4"), new Atleta("Maradona5"), new Atleta("Maradona6"), new Atleta("Maradona7"), new Atleta("Maradona8"), new Atleta("Maradona9"), new Atleta("Maradona10"), new Atleta("Maradona11"));
		PartidaMaiorEquipeIndividual partidamei1 = new PartidaMaiorEquipeIndividual();
		partidamei1.setEquipe1(brasilFutebol);
		partidamei1.setEquipe2(alemanhaFutebol);
		partidamei1.setPontose1(12);
		partidamei1.setPontose2(5);
		System.out.println(partidamei1.getResultadoPartidaEquipeIndividual());
		PartidaMaiorEquipeIndividual partidamei2 = new PartidaMaiorEquipeIndividual();
		partidamei2.setEquipe1(brasilFutebol);
		partidamei2.setEquipe2(argentinaFutebol);
		partidamei2.setPontose1(4);
		partidamei2.setPontose2(2);
		System.out.println(partidamei2.getResultadoPartidaEquipeIndividual());
		
		//Partidas : Individual - 1x1
		
		EquipeJudo brasilJudo = new EquipeJudo("Brasil", new Atleta("Roberto Espada"));
		EquipeJudo alemanhaJudo = new EquipeJudo("Alemanha",new Atleta("Roberto Schwert"));
		EquipeJudo argentinaJudo = new EquipeJudo("Argentina", new Atleta("Roberto la Espada"));
		PartidaMaiorIndvIndividual partidaII1 = new PartidaMaiorIndvIndividual();
		partidaII1.setAtleta1(brasilFutebol);
		partidaII1.setAtleta2(alemanhaJudo);
		partidaII1.setPontose1(2);
		partidaII1.setPontose2(7);
		System.out.println(partidaII1.getResultadoPartidaEquipeIndividual());
		
	}

}
