package Generics11Homwork;

import java.util.ArrayList;

public class Team<T extends Players> {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<T> members = new ArrayList<T>();
	

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team" + this.name);
			return true;
		}
	}

	public int numberPlayer() {
		return this.members.size();
	}

	@Override
	public String toString() {
		return  name;
	}

}
