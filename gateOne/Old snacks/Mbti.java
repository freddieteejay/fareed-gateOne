import java.util.Scanner;
public class Mbti {
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is  your name ? ");
	String name = scanner.nextLine();
	int counter1 = 0;
	int counter2 = 0;
	int counter3 = 0;
	int counter4 = 0;
	int counter5 = 0;
	int counter6 = 0;
	int counter7 = 0;
	int counter8 = 0;
	

	String [] question1 = {
		"A. expend energy, enjoy groups,			B. conserve energy, enjoy one on one",
		"A. more outgoing, think out loud			B. more reserved,   think to your self",
		"A. Seek many tasks, public activities, interaction with others,		B.seek private, solitary activities  with quiet to concentrate",
		"A. external, communicative, express yourself,		B.  internal, reticent, keep to your self",	
		"A. active, initiate, 			B. reflective,  deliberate",
		
	};

	for (String freddie : question1){
	System.out.println(freddie);
	char response = scanner.next().charAt(0);

	if (response == 'A' || response == 'a'){
		counter1++;
		}else if (response == 'B' || response == 'b'){
			counter2++;
		}else {System.out.println("Expected A or B as response\nI know this is an error, please retry again");
		}
	}
		System.out.println(" ");
		System.out.println("Hello " + name + "you have selected : ");
		System.out.println("number of A is " + counter1);
		System.out.println("number of B is " + counter2);



	String [] question2 = {
			"A. Interpret literally, 			B. look for meaning and possibilities",
			"A. practical,  realistic,  experiential,		B.Imaginative, innovative, theoretical",
			"A. Standard, usual, conventional,			B.different,  novel, unique",
			"A. focus on here-and-now,		B. look to the future, global perspective, big picture",
			"A. Facts, things, what is,			B. ideas, dreams, what could be, philosophical", 
		};

		for (String freddie : question2){
		System.out.println(freddie);
		char response = scanner.next().charAt(0);

		if (response == 'A' || response == 'a'){
		counter3++;
		}else if (response == 'B' || response == 'b'){
			counter4++;
		}else {System.out.println("Expected A or B as response\nI know this is an error, please retry again");
		}
	}
		System.out.println(" ");
		System.out.println("Hello " + name + "you have selected : ");
		System.out.println("number of A is " + counter3);
		System.out.println("number of B is " + counter4);


	String [] question3 = {
			"A.logical, thinking, questioning,			B. empathetic, feeling, accomodating",
			"A. candid, straight forward, frank,		B. tactful,  kind, encouraging",
			"A. firm, tend to criticize, hold the line,	B. gentle, tend to appreciate, conciliate",
			"A. tough minded,  just, 					B. tender-hearted, merciful",
			"A.matter of  fact, issue-oriented,			B. sensitive, people-oriented, compassionate",
	};

	for (String freddie : question3){
		System.out.println(freddie);
		char response = scanner.next().charAt(0);

		if (response == 'A' || response == 'a'){
		counter5++;
		}else if (response == 'B' || response == 'b'){
			counter6++;
		}else {System.out.println("Expected A or B as response\nI know this is an error, please retry again");
		}
	}
		System.out.println(" ");
		System.out.println("Hello " + name + "you have selected : ");
		System.out.println("number of A is " + counter5);
		System.out.println("number of B is " + counter6);



	String [] question4 = {
			"A. organized, orderly,		B. flexible, adaptable",
			"A. plan, schedule,			B.unplanned,  spontaneous",
			"A. regulated,  structured,		B. easy-going, live and let live",
			"A. preparation, plan ahead,	B. go with the flow,   adapt as you go",
			"A. control,  gorven,		B. latitude,  freedom",
	};
	
	for (String freddie : question4){
		System.out.println(freddie);
		char response = scanner.next().charAt(0);

		if (response == 'A' || response == 'a'){
		counter7++;
		}else if (response == 'B' || response == 'b'){
			counter8++;
		}else {System.out.println("Expected A or B as response\nI know this is an error, please retry again");
		}
	}
		System.out.println(" ");
		System.out.println("Hello " + name + "you have selected : ");
		System.out.println("number of A is " + counter7);
		System.out.println("number of B is " + counter8);
		printBreif();


}



	public static void printBreif(){

	System.out.print("""
	INFP

		Healer
		The Thoughtful Idealist     (MBTI)
`		The Mediator   (16 personallities)

	
		The INFP Personalty Type
 				 INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the anount is only of passing concern. They see potential for a better 						future, and pursue truth and meaning with their own individual flair.
  				INFPs aresensitive, caring, and compassionate , and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgement, INFPs believe that each person must find 						their own path. They enjoy spending time exploring 	their own ideas and values, and are gently encouraging to others to do the same .INFPs are creative and often artistic; they enjoy finding new outlets for 					self-expression.

		What does INFP stand for ?
  				INFP is one of the sixteen personalty types created by Katharine Briggs and Isabel Myers, creators of the Myer=Briggs Type Indication (MBTI). INFP stands for Introverion, iNtuition, Feeling, and Preceiving, which are four core personalty traits based on the work of psychologist C.G. Jung. Each of the four letters of the INFP code signifies a key personality traits of this type. INFPs are energized by time alone (Intoverted), focus on ideals and concepts rather than facts and details (iNtuitive), make decisions based on feeloings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (perceiving). 





""");



}


   }