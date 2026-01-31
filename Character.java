package zyuzyu_gacha;

public class Character {
//	private String rank;
	private String name;
	private Rarity rareRank;
	private String word;
	
	Character(String name, Rarity rareRank, String word){
		this.name = name;
		this.rareRank = rareRank;
		this.word = word;
	}
	
	public String getName() {
	    return name;
	}

	public Rarity getRarity() {
	    return rareRank;
	}

	public String getWord() {
	    return word;
	}
}
