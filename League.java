package Generics11Homwork;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	public String name;

	public League(String name) {
		this.name = name;
	}

	private ArrayList<T> league = new ArrayList<T>();

	public boolean addTeam(T team) {
		if (league.contains(team)) {
			return false;
		} else
			league.add(team);

		return true;
	}

	// public void showLeagueTable(){
	// Collections.sort(league);
	// for(T t:league){
	// System.out.println(t.getName()+": "+t.ranking());

	public ArrayList<T> getLeague() {
		return league;
	}

	public void setLeague(ArrayList<T> league) {
		this.league = league;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
