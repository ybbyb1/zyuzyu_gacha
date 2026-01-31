package zyuzyu_gacha;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepository {
	static List<Character> getAll(){
		List<Character> list = new ArrayList<>();
		
		//追加はaddと思う、他よくある使い方調べる
		list.add(new Character("張⚪︎", Rarity.SSR, "全力でお兄ちゃんを遂⚪︎する"));
		list.add(new Character("五⚪︎", Rarity.SSR, "大丈夫、僕最⚪︎だから"));
        list.add(new Character("宿⚪︎", Rarity.SSR, "誇れ、お前は⚪︎い"));
        list.add(new Character("七⚪︎", Rarity.SR, "労働は⚪︎ソです"));
        list.add(new Character("虎⚪︎", Rarity.R, "生き様で後悔はし⚪︎くない"));
        list.add(new Character("伏⚪︎", Rarity.R, ""));
        
        	return list;
	}
}
