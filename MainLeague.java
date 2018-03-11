package Generics11Homwork;

import java.util.ArrayList;
import java.util.List;

public class MainLeague {

	public static void main(String[] args) {
		League<Team<Footballplayers>> footballLeague = new League<>("European Football League");
		Team<Footballplayers> Chelsea = new Team<>("chelsea");
		Team<Footballplayers> Manu = new Team<>("Manchester United");
		Team<Footballplayers> Barsa = new Team<>("Barsilona");
		
		footballLeague.addTeam(Chelsea);
		footballLeague.addTeam(Manu);
		footballLeague.addTeam(Barsa);
		
		//Team<BaseballPlayers> MM = new Team<>("Maiami Merlins");
		List<League<Team<Footballplayers>>> leagues = new ArrayList<>();
		leagues.add(footballLeague);

		for (League<Team<Footballplayers>> l : leagues) {
			/*l.addTeam(Chelsea);
			l.addTeam(Manu);
			
			l.addTeam(Barsa);*/
			System.out.println("The "+l.getName()+ " Teams are : "+l.getLeague());
			
			//int i = 0;
			
			// System.out.println(l.setName("Chelsea"));

			
			// FootballLeague.addTeam(MM);

		}

		// if want add all kindes of player
		// Team<Players>playerTeam=new Team<>("My Player Team");
		// Team<Footballplayers>RM=new Team<>("Real Madrid");
		// playerTeam.addPlayer(new Footballplayers("Real Madrid"));
		// playerTeam.addPlayer(new BaseballPlayers("Miami Merlins"));

	}
}
