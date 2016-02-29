import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class WcTest{
	WcLib wordCount;
	String sample1, sample2, sample3, sample4, sample5;
	@Before
	public void initialiseWc(){
		sample1 = "This class inherits from the InputStreamReader class"
		+" FileReader is      alsfjk       \t\t\t\t\t \n\n\n     å  used for reading\r\n streams of characters";
		sample2 = "abd bb";
		sample3= "";
		wordCount = new WcLib();
	};

	@Test
	public void countLines_should_count_lines_in_given_text(){
		assertEquals(1, wordCount.countLines(sample1));
	};

	@Test
	public void countLines_should_give_0_if_given_text_has_only_one_character(){
		assertEquals(0, wordCount.countLines(sample2));
	};

	@Test
	public void countLines_should_give_0_if_given_text_is_empty(){
		assertEquals(0, wordCount.countLines(sample3));
	};

	@Test
	public void countWords_should_count_all_words_of_given_text(){
		assertEquals(17, wordCount.countWords(sample1));
	};

	@Test
	public void countWords_should_give_one_if_given_text_has_only_one_character(){
		assertEquals(2, wordCount.countWords(sample2));
	};

	@Test
	public void countWords_should_give_0_if_given_text_is_empty(){
		assertEquals(0, wordCount.countWords(sample3));
	};

	@Test
	public void countCharacters_should_giv_count_of_characters_in_given_text(){
		assertEquals(142, wordCount.countCharacters(sample1));
	};

	@Test
	public void countCharacters_should_give_0_if_given_text_is_empty(){
		assertEquals(0, wordCount.countCharacters(sample3));
	};

	@Test
	public void countAll_should_give_count_of_lines_words_and_characters(){
		assertEquals(wordCount.countAll(sample1), "1	17	142");
	};

	@Test

	public void refinecommands_should_filter_commands(){
		
	}
}