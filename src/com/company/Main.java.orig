package com.company;

<<<<<<< HEAD
import project1.Dbms;
import com.company.antlr4.MyRulesBaseListener;
import com.company.antlr4.rulesLexer;
import com.company.antlr4.rulesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/project1/input.txt");
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() != 0) { lines.add(line); }
        }
        for (String line : lines) {
            CharStream charStream = CharStreams.fromString(line);
            rulesLexer lexer = new rulesLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            rulesParser parser = new rulesParser(commonTokenStream);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            rulesParser.ProgramContext programContext = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyRulesBaseListener listener = new MyRulesBaseListener();
            walker.walk(listener, programContext);
        }
        System.out.println(Dbms.terminalNodes.size());
=======
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DBMS database = new DBMS(); // OPEN
        Movie movie1 = new Movie(1, "Spiderman", 2002, "Action"); //INSERT INTO movies VALUES...
        Movie movie2 = new Movie(2, "Batman", 2008, "Action"); //INSERT INTO...
        Movie movie3 = new Movie(3, "Superman", 2012, "Action"); // INSERT INTO
        database.addMovie(movie1); // INSERT INTO..
        database.addMovie(movie2);// INSERT INTO
        database.addMovie(movie3); // INSERT INTO
        System.out.println(database.movies); // SHOW
        ArrayList<Movie> spidey = database.getMoviesByYear(">", 2008);
        System.out.println(spidey);
        /*Person person1 = new CastMember(0, "Taylor", "Lead");
        Person person2 = new CrewMember(1, "Nick", "Director");
        movie1.addPerson(person1);
        movie1.addPerson(person2);
        movie1.printCastAndCrew();
        movie1.removePerson(0);*/
>>>>>>> 2ca24eff47779d6706e04219841e267fd7d34d92
    }
}
