package zyuzyu_gacha;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameStart {	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("引く回数を「1」か「2」で選んでください");
		System.out.println("1: 3連ガチャ, 2: 10連ガチャ");
		
		int choice = scanner.nextInt();//TODO
		int numberOfTimes;
		
		if (choice == 1) {
			numberOfTimes = 3;
		} else if (choice == 2) {
			numberOfTimes = 10;
		} else {
			System.out.println("不正な選択です");
			scanner.close(); //TODO
			return;//例外で良さそう
		}
		
		List<Character> characters = CharacterRepository.getAll();
		Random random = new Random();//TODO
		
		System.out.println("ガチャ結果:");
		
		for(int i = 0; i < numberOfTimes; i++) {
			Character result = characters.get(random.nextInt(characters.size()));//TODO
			
			System.out.println(result.getName() + " [" + result.getRarity() + "]");
			System.out.println(result.getWord());
			System.out.println("ゲーム終了");
		}
		scanner.close();
	}
	
}
