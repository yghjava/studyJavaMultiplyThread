package second_class.practce.test;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import practice.StatisticTool;
import practice.createFile.CreateWordHelper;
import practice.createFile.QueryBannedWord;

public class FindWordAppearTimeTest {

	@Test
	public void testStatisticWord() {
		String text = "用工荒jav用工荒asd用工荒sd用工dsddsdawqwqdJavaJavadsdjaveweeJavajava";
		String regex = "用工荒";
		int times = StatisticTool.statistic(text, regex);
		System.out.println(times);
	}

	/**
	 * 随机生成一个汉字
	 */
	@Test
	public void testCreateChinesRandom() {
		for (int i = 0; i < 100; i++) {
			char ch = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00)));
			System.out.println(ch);
		}
	}

	@Test
	public void testCreateWordRandom() {
		for (int i = 0; i < 20; i++) {
			String str = CreateWordHelper.createRandomEnglishWord();
			System.out.println(str);
		}
	}

	@Test
	public void testAddLineBetweenWord() {
		for (int i = 0; i < 20; i++) {
			String str = CreateWordHelper.createRandomEnglishWord();
			System.out.println(CreateWordHelper.addLineBetweenWord(str));
		}
	}
	
	@Test
	public void testGetRandomNumber() {
		Random random = new Random();
		for(int i=0;i<100;i++) {
			if(random.nextInt(10)>10) {
				System.out.println("yes");
			}
		}
	}
	
	@Test
	public void testGetRandomBannedWordList() {
		List<String> bannedWordList = QueryBannedWord.getRandomBannedWordList();
		System.out.println(bannedWordList.size());
		System.out.println(bannedWordList.toString());
	}
	
	@Test
	public void testCreateWordHelper() {
		CreateWordHelper helper = new CreateWordHelper();
		String str = helper.createTargetFileWord();
		System.out.println(str);
	}
	
	/**
	 * /project/studyJavaMultiply/workspace/second_class/target/test-classes/
	 */
	@Test
	public void testFindClasspathRoot() {
		String path = this.getClass().getResource("/test.txt").getPath();
		System.out.println(path);
	}
}
