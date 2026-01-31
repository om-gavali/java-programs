import java.util.*;
class Project
{
    int j,c,p,e;
    Scanner sc=new Scanner(System.in); 

        void job()
        {
			System.out.println("Which branch like you most");
			System.out.println("1.COMPUTER \n2.CIVIL \n3.ELECTRONIC");
			System.out.println("Select your branch ");
			j=sc.nextInt();
			
			if(j==1)
			{
				System.out.println("1.software Developer 2.software Tester");
				System.out.println("choose your interested side:-");
				c=sc.nextInt();
				
				if(c==1)
				{
				   System.out.println("Software developers conceive of, design, and build computer programs.Some develop new applications for mobile\n ");
				 System.out.println("or desktopuse, while others build underlying operating systems. Either way, software developers identify user\n"); 
				   System.out.println("needs, buildprograms,test out new software, and make improvements. Working closely with computer programmers,\n");
				   System.out.println("software developers fill crucialroles in the computer systems, manufacturing, finance, and software publishing\n industries.");
			   
				   System.out.println("HOW TO BECOME SOFTWARE DEVELOPER");
				   
				   System.out.println("EARN YOUR GEGREE :Software developers must earn a bachelor's degree in a relevant area of study.\n");
					System.out.println("Most employers require a degree in software development, though some remain open to other areas including  \n");
					System.out.println("computer science, computer programming,and related disciplines. Typically, employers look for candidates\n");
					System.out.println("from regionally accredited institutions so that they know what quality of education the professional received.\n");
				   
				   System.out.println("GAIN EXPERIENCE  :Many employers look for software developers with professional experience.\n");
					System.out.println("Professionals can demonstrate their work experience through resumes, cover letters, and portfolios.\n");
					System.out.println("Depending on their level of education,professionals may have different experiences with field work.\n");
					
System.out.println("For instance, graduates with a master's degree may have already started their careers before entering\n");
					System.out.println("into a master's program, or during their master's program.\n");
					}
				
				else if(c==2)
				{
					System.out.println("Software testing is the act  examining the artifacts and the behavior of the software under\n");
				    System.out.println("test by validation and verification. Software testing can also provide an objective, independent view \n");
					System.out.println("of the software to allow the business to appreciate and understand the risks of software implementation.\n");
					System.out.println("Test techniques include, but not necessarily limited to: \n-->Analyzing the product requirements for\n");
					System.out.println("completeness and correctness in various contexts like industry perspective, business perspective,\n");
					System.out.println("feasibility and viability of implementation, usability, performance, security, infrastructure");
					System.out.println("considerations, etc.\n-->Reviewing the product architecture and the overall design of the product.\n");
					System.out.println("-->Working with product developers on improvement in coding techniques, design patterns, tests that\n");
					System.out.println("can be written as part of code based on various techniques like boundary conditions, etc.\n");
					System.out.println("-->Executing a program or application with the intent of examining behavior.\n");
					System.out.println("-->Reviewing the deployment infrastructure and associated scripts & automation.\n");
					System.out.println("-->Take part in production activities by using monitoring & observability techniques\n");
				}
				else
				{
					System.out.println("Your Experties not found !!");
				}
				
				
			}
			
			else if(j==2)
			{
				System.out.println("\n1. Constructor\n2. Designer");
				System.out.println("Enetr your choice= ");
				p=sc.nextInt();
				
				if(p==1)
				{
					System.out.println("WHAT IS CIVIL CONSTRUCTION ?");
					
					
System.out.println("\n-->Civil projects are usually classified under the umbrella of civil engineering instead of being considered\n");
                    System.out.println("a branch of construction. ");
					System.out.println("\n-->Civil construction is often defined as a branch of Civil Engineering involved with the maintenance, design,\n");
                    System.out.println("and development of both natural and physically built environments.Civil construction companies do more than build structures. \n");
					
					System.out.println("\nROLE OF CIVIL ENGINEERS :-");
					System.out.println("\n-->Civil engineers are the people in charge of managing the construction projects. Among other things, they are\n");
				    System.out.println("responsible for making the design of the project they are assigned.Whether it is a transport project, a water or sewerage\n");
					System.out.println("system project, or more, they take the lead.Civil Engineers plan, design, and then test the structures before they are ready\n");
					System.out.println("to be used by the public. ");
					System.out.println("\nTheir work starts at designing the architectural drawings, choosing material for the project, and then working on \n");
					System.out.println("the design. They not only think about the structure but also how the construction of the project will affect its surroundings.\n");
				    System.out.println("They have to be sure they produce an economical, safe, and environmentally stable structure for each of their projects.Civil\n");
			    	System.out.println("engineers can choose from many areas of specialization.");
					
				}
				else if(p==2)
				{
					System.out.println("WHAT IS CIVIL DESIGNER ?");
					System.out.println("\n-->Civil designers draft civil engineering designs for roadways, water and sewage lines, drainage, and land grading\n");
					System.out.println("specifications for commercial and residential building sites using maps and topographical surveys. Civil designers primarily\n");
					System.out.println("work in office environments, but also sometimes travel to proposed building sites. These professionals report directly to\n");
				    System.out.println("project engineers. Civil designers find full-time and independent contractor work with building and architectural firms, \n");
					System.out.println("construction companies, governments, and private businesses of all kinds.\n");
         
		            System.out.println("\nCivil Designer Skills and Qualifications:-");
					System.out.println("\n-->Detail-Oriented - Civil designers are detail-oriented, and able to carefully analyze maps, surveys, and drawings\n");
                    System.out.println( "to plan functioning infrastructure systems");
					
					System.out.println("\n-->Computer Skills - They have excellent computer skills to work with multiple types of design software");
					System.out.println("\n-->Communication - Civil designers work closely with engineers, government officials, and other staff members, which\n");
                    System.out.println("requires good verbal communication skills");
					
					System.out.println("\n-->Time-Management - Because civil designers work within tight timeframes and strict deadlines, good time-management \n");
                   System.out.println( "skills are essential for this job");
				}
				 else
				{
				 System.out.println("Your Experties not found !!");
				}
			}
			else if(j==3)
			{
				System.out.println("\n1.Defence \n2.Devloper ");
				System.out.println("\n Enter your choise=");
				e=sc.nextInt();
				
				if(e==1)
				{
				    System.out.println("\nElectronic defence :- ");
                    System.out.println("\n-->Understanding how to use the electromagnetic spectrum (e.g. localizing transmitters, identifying unknown signals)\n");
					System.out.println("and how to misuse the electromagnetic spectrum (e.g. jamming communications, falsifying positioning information) is the\n");
					System.out.println("specialty of TNO's Electronic defence department. With its significant knowledge base, the Electronic defence team provides \n");
					System.out.println("an operational advantage to our customers.");	

                    System.out.println("\n-->The combination of the different expertise areas in Electronic Defence is unique in the Netherlands - and can be \n");
			        System.out.println("even considered unique in the world. And when it comes to electromagnetic innovations, our department is the strategic\n");
			        System.out.println("research and technology partner of the Netherlands Ministry of Defence, the Intelligence Services and the Ministry of \n");
					System.out.println("Justice and Safety. The success of this strategic relationship is the responsibility of Electronic defence. It provides \n");
					System.out.println("the incentive to guarantee an up-to-date knowledge base, readily available knowledge and development of future capabilities.");					
				}
				
				else if(e==2)
				{
					 System.out.println("\n-->Electronics Engineering is one of the largest and most sophisticated branches of engineering. It has made us\n");
                     System.out.println("available the equipments like Television, Radio, computers, telephones etc. ");
					 
					  System.out.println("\n-->Electronics has a major role in improving productivity in industries like oil, energy, agriculture and so many\n");
					  System.out.println("other important sectors of economy.An electronics engineer works in groups to design, fabricate, produce, test  and supervise\n");
					  System.out.println("the manufacturing of complex products and systems i.e. electronic equipment and components.He works for a number of \n");
					  System.out.println("industries including hospitals, computer industries, electronic data processing systems for communication and in defense etc.\n");
					  System.out.println("They work with microprocessors, fiber optics, telecommunication, television, radios etc. Electronics engineering is a rapidly\n");
					  System.out.println("growing sector where there is excellent job opportunity for the skilled professionals. ");
				}
				 else
				{
					System.out.println("Your experties not found !!");    
				}
			}
		}

		void sport ()
		{
					  int s; 
					  System.out.println("\nWhich is your favorite sport");
					  System.out.println("\n1. CRICKET\n2. FOOTBALL");
						
					  System.out.println("\nchoose your favorite sport:");
					  s=sc.nextInt();
					  
			if(s==1)
		    {
					  System.out.println("\n-->Cricket England’s national summer sport, which is now played throughout the world, particularly in Australia,\n");
					System.out.println("India, Pakistan, the West Indies, and the British Isles.");
					 System.out.println("\n-->Cricket is played with a bat and ball and involves two competing sides (teams) of 11 players. The field is \n");
					System.out.println("oval with a rectangular area in the middle, known as the pitch, that is 22 yards (20.12 metres) by 10 feet (3.04 metres) wide.\n");
					System.out.println("Two sets of three sticks, called wickets, are set in the ground at each end of the pitch. Across the top of each wicket lie\n");
					System.out.println("horizontal pieces called bails. The sides take turns at batting and bowling (pitching); each turn is called an “innings” \n");
					System.out.println("(always plural). Sides have one or two innings each, depending on the prearranged duration of the match, the object being to \n");
					System.out.println("score the most runs. The bowlers, delivering the ball with a straight arm, try to break (hit) the wicket with the ball so that\n");
					System.out.println("the bails fall. This is one of several ways that the batsman is dismissed, or put out. A bowler delivers six balls at one\n");
					System.out.println("wicket (thus completing an “over”), then a different player from his side bowls six balls to the opposite wicket. The batting\n side defends its wicket.");
					 System.out.println("\n-->There are two batsman up at a time, and the batsman being bowled to (the striker) tries to hit the ball away from\n");
					System.out.println("the wicket. A hit may be defensive or offensive. A defensive hit may protect the wicket but leave the batsmen no time to run\n");
					System.out.println("to the opposite wicket. In that case the batsmen need not run, and play will resume with another bowl. If the batsman can make \n");
					System.out.println("an offensive hit, he and the second batsman (the nonstriker) at the other wicket change places. Each time both batsmen can reach\n");
					System.out.println("the opposite wicket, one run is scored. Providing they have enough time without being caught out and dismissed, the batsmen may\n");
					System.out.println("continue to cross back and forth between the wickets, earning an additional run for each time both reach the opposite side.\n");
					System.out.println("There is an outside boundary around the cricket field. A ball hit to or beyond the boundary scores four points if it hits the \n");
					System.out.println("ground and then reaches the boundary, six points if it reaches the boundary from the air (a fly ball). The team with the highest\n");
					System.out.println("number of runs wins a match. Should both teams be unable to complete their number of innings before the time allotted, the match\n");
					System.out.println("is declared a draw. Scores in the hundreds are common in cricket.");	  
			}
			else if(s==2)
			{
					 System.out.println("\n-->Football, also called association football or soccer, game in which two teams of 11 players, using any part of their\n");
					System.out.println("bodies except their hands and arms, try to maneuver the ball into the opposing team’s goal. Only the goalkeeper is permitted to \n");
					System.out.println("handle the ball and may do so only within the penalty area surrounding the goal. The team that scores more goals wins.");
					System.out.println("\n-->Football is the world’s most popular ball game in numbers of participants and spectators. Simple in its principal \n");
					System.out.println("rules and essential equipment, the sport can be played almost anywhere, from official football playing fields (pitches) to\n");
					System.out.println("gymnasiums, streets, school playgrounds, parks, or beaches. Football’s governing body, the Fédération Internationale de Football \n");
					System.out.println("Association (FIFA), estimated that at the turn of the 21st century there were approximately 250 million football players and over \n");
					System.out.println("1.3 billion people “interested” in football; in 2010 a combined television audience of more than 26 billion watched football’s\n");
					System.out.println("premier tournament, the quadrennial month-long World Cup finals.");
			}
			 else
			{
				System.out.println("Your Experties not found !!");
			}
						
		}
public static void main (String args[])
		{
			
			int ch;
			
			Scanner sc=new Scanner (System.in);
			
			
    			Ab g=new Ab ();
			
		  do{	
   
					 System.out.println("\nWelcom in our carrier platform");
					 System.out.println("\n*****************************");
					 System.out.println("\n1. JOB\n2. SPORTS\n3. EXIT");
					 System.out.println("\n***************************");
					
					 System.out.println("\nEnter your choise:");
					ch=sc.nextInt();
					
					switch(ch)      // ch for job & sports & exit
					{
						case 1: g.job();
						break;
						
						case 2: g.sport();
						break;

					
					}
			}while(ch<3);
		}
}
