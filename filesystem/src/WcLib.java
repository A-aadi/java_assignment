import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class WcLib{

	public int countLines(String text){
		return text.split("\r\n").length -1 ;
	};	

	public int countWords(String text){
		if(text.length() ==0)
			return 0;
		return text.replaceAll("\\s+"," ").split(" ").length;
	};

	public int countCharacters(String text){
		return text.length();
	};
	public String countAll(String text){
		return countLines(text) + "\t" + countWords(text)+ "\t" + countCharacters(text);
	};

	protected ArrayList refineCommands(String [] commandLineArgs){
		ArrayList<String> commands = new ArrayList<String> (commandLineArgs.length);
		Pattern p = Pattern.compile("-l|-w|-m|-c");
		for(int i = 0; i<commandLineArgs.length; i++){
			if(p.matcher(commandLineArgs[i]).matches() && commands.indexOf(commandLineArgs[i]) == -1)
				commands.add(commandLineArgs[i]);
		};
		return commands;
	};

	protected void filterFiles(String[] commandLineArgs){
		ArrayList filteredCommands = refineCommands(commandLineArgs);
		// System.out.println(filteredCommands.get(filteredCommands.size()-1));
		// char last = filteredCommands.get(filteredCommands.size()-1);
		// return filteredCommands.subList()
		// System.out.println(filteredCommands.get(filteredCommands.size()-1));
		// return Arrays.copyOfRange(filteredCommands.indexOf(last_command, commandLineArgs.length));
		// return filteredCommands;
	}

	}
}
