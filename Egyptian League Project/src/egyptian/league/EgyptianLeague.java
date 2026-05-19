/*
                <The Egyptian League Simulator project>

Made By: 
Ramy Said 
David Gourge
Ahmed Kamal
Yossef Amer
Ahmed Abdelrazik

Date of project completion: 7 / 5 / 2024

Code Lines : 654 Line (without the description)

This project is a simulation for the Egyptian FootBall League, that contains the names of the actual teams, players, rates and real rules of the game. The program
has three options to choose from, how the League will be played.. 1-Random (which will keep the Egyptian League teams but randomise the rate.) 2-Customized(which 
will let you create your own teams with your own rate, Would be Usefull at the collage made leagues and Ramadan Leagues for example.) 3- The Egptian Premire League
(Which will use the real teams with their real player rates to calculate the Real average rate of each team.)
The program will then introduce you to two Options either 1- It Displays the Resutlts in the moment, or 2- You Play The League Yourself!
If you choose to play the league you will be able to to perform 7 actions in the game: 
1- Score a goal.
2-Give a red Card to the opponent team.
3-Give a Yellow Card to the opponent team.
4-Let the opponent team Score a goal.
5-Give a red Card to the your team.
6-Give a Yellow Card to the your team.
7-End the Match. 
Each action will affect the results of the game either in your advantiage or against it. 
After the League Is finished, the program will display a GUI table to showcase the ranking of the teams according to the score they have gained throught the league.

One Last note: Everything is unpredictable just like real life, The Ahli team will not always win the league just because it has the highest rate, There is always a 
chance for small teams to win, Just like Real Life!
 */
package egyptian.league;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

public class EgyptianLeague {

 public static void main(String[] args) {
int choose;
do{
        System.out.println("Hello!\n Choose your League options please");
        System.out.println("1.Random\n2.Customized\n3.EgyptianPremierLeague");
            Scanner X=new Scanner(System.in);   
choose=X.nextInt();
    switch (choose) {
        case 1:
            {
                Randomclass game = new Randomclass();
                break;
            }
        case 2:
            {
                CustomInput game = new CustomInput();
                break;
            }
        case 3: 
            {
               staticEgy game = new staticEgy();
                break;
            }
        default:
            break;
    }
    
    }
while(choose>3||choose<0);
 

}
}
 
    
   class Rules {
     String [] playerNames = {};
      String[] teams;
      int[]teamrating;

    public int calculateAverageRating(int[] ratings) {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.length;
    }
   }

class CustomInput extends Rules {
    
   Scanner input=new Scanner(System.in);
   // int i,j;
  public  int q;
         // int x=0,nt=0;
   // int tn=0,b=0,v=0;
  //  int t=0,m=0,k=0;
    int l=0;
     
        //String[] players;
     
     public CustomInput(){
         System.out.println("enter the num of teams : ");
    this.q=input.nextInt();  
   teams=new String[q];
   teamrating=new int[q];
   teams();
    FavouriteTeamo f = new FavouriteTeamo ( teams  ,  teamrating , q );
   // players=new String[11*n];
     }
     
    public void teams(){
 for ( int i=0;i<=teams.length-1;i++){
     

     System.out.println(" enter the team name : ");
     teams[i]=input.next();
 
 for (int z=0+l;z<=teamrating.length-1;){
     System.out.println(" enter the  team average rate from 50 to 100 ");
 teamrating[z]=input.nextInt();
 l++;
 if (teamrating[z] > 100 || teamrating[z] <50){
     continue;} 
 else {break;}
 }
 }
}
    }
    


class Randomclass extends Rules {

   Scanner input=new Scanner(System.in);
    Random PR=new Random();
    int q = 18;
    int i;
    int k=0;
   
   final String []team={"AL Ahli","Zamaliak","Pyramids","Ennpi","Pharco","Smouha","El Gouna","ZED","Al masry","Al ittihad","future","gaish","ismaily","National Bank fc","cerimica fc",
   "mokawloon","dakhleya","elmahalla"};
  
     int [] teamrating=new int[18];

   //expertimential printing
   public void Random(){
       
       for ( i=0;i<=team.length-1;i++){
          
      
                 for (int z=0+k;z<=teamrating.length-1;){
                   //  System.out.println(" Player : "+players[j]);
                      teamrating[z]=PR.nextInt(51)+50;
                    // print for verification
                      System.out.println(" the team "+team[i]+" with rating "+teamrating[z]);
                     k++;
                     break;
                 }      
   }
      
}
   public Randomclass() {
       Random(); 
            FavouriteTeamo f = new FavouriteTeamo ( team  ,  teamrating , q );
    }}
   


class staticEgy extends Rules{

     
    public staticEgy() {
      
    
    
    int q = 18;
     Ahly ahly = new Ahly();
     Zamaliak zamalik = new Zamaliak();
     Pyramids pyramids = new Pyramids();
     Ennpi enpi  = new Ennpi();
     Pharco pharco = new Pharco();
     Smouha smouha = new Smouha();
     El_Gouna elgouna = new El_Gouna();
     ZED zed = new ZED();
     Al_Masry almasry = new Al_Masry();
     Al_ittihad alitihad = new Al_ittihad();
     Future future = new Future();
     El_Gaish el_Gaish = new El_Gaish();
     Ismaily ismaily = new Ismaily();
     NBFC nbfc = new NBFC();
     CeramicaFC ceramicaFC = new CeramicaFC();
     Makawaloon makawaloon = new Makawaloon();
     DakhleyaFC dakhleyaFC = new DakhleyaFC(); 
     ElmahallaFC elmahallaFC = new ElmahallaFC();
     
      System.out.println ("alahly team : "+ Arrays.toString(ahly.playerst1));
  System.out.println ("player ratings : "+ Arrays.toString(ahly.playerratingt1));
   System.out.println ("Zamaliak team : "+ Arrays.toString(zamalik.playerst2));
  System.out.println ("player ratings : "+ Arrays.toString(zamalik.playerrating2));
  System.out.println ("pyramids team : "+ Arrays.toString(pyramids.playerst3));
  System.out.println ("player ratings : "+ Arrays.toString(pyramids.playerrating3));
   System.out.println ("enpi team : "+ Arrays.toString(enpi.playerst4));
  System.out.println ("player ratings : "+ Arrays.toString(enpi.playerrating4));
   System.out.println ("pharco team : "+ Arrays.toString(pharco.playerst5));
  System.out.println ("player ratings : "+ Arrays.toString(pharco.playerrating5));
  System.out.println ("smouha team : "+ Arrays.toString(smouha.playerst6));
  System.out.println ("player ratings : "+ Arrays.toString(smouha.playerrating6));
  System.out.println ("elgouna team : "+ Arrays.toString(elgouna.playerst7));
  System.out.println ("player ratings : "+ Arrays.toString(elgouna.playerrating7));
  System.out.println ("zed team : "+ Arrays.toString(zed.playerst8));
  System.out.println ("player ratings : "+ Arrays.toString(zed.playerrating8));
    System.out.println ("almasry team : "+ Arrays.toString(almasry.playerst9));
  System.out.println ("player ratings : "+ Arrays.toString(almasry.playerrating9));
   System.out.println ("alitihad team : "+ Arrays.toString(alitihad.playerst10));
  System.out.println ("player ratings : "+ Arrays.toString(alitihad.playerrating10));
   System.out.println ("future team : "+ Arrays.toString(future.playerst11));
  System.out.println ("player ratings : "+ Arrays.toString(future.playerrating11));
   System.out.println ("el_Gaish team : "+ Arrays.toString(el_Gaish.playerst12));
  System.out.println ("player ratings : "+ Arrays.toString(el_Gaish.playerrating12));
   System.out.println ("ismaily team : "+ Arrays.toString(ismaily.playerst13));
  System.out.println ("player ratings : "+ Arrays.toString(ismaily.playerrating13));
   System.out.println ("nbfc team : "+ Arrays.toString(nbfc.playerst14));
  System.out.println ("player ratings : "+ Arrays.toString(nbfc.playerrating14));
   System.out.println ("ceramicaFC team : "+ Arrays.toString(ceramicaFC.playerst15));
  System.out.println ("player ratings : "+ Arrays.toString(ceramicaFC.playerrating15));
   System.out.println ("makawaloon team : "+ Arrays.toString(makawaloon.playerst16));
  System.out.println ("player ratings : "+ Arrays.toString(makawaloon.playerrating16));
   System.out.println ("dakhleyaFC team : "+ Arrays.toString(dakhleyaFC.playerst17));
  System.out.println ("player ratings : "+ Arrays.toString(dakhleyaFC.playerrating17));
   System.out.println ("elmahallaFC team : "+ Arrays.toString(elmahallaFC.playerst18));
  System.out.println ("player ratings : "+ Arrays.toString(elmahallaFC.playerrating18));
  
   String [] teamNames = {"Ahly" ,"Zamaliak" ,"Pyramids", "Ennpi", "Pharco", "Smouha", "El_Gouna", "ZED", "Al_Masry" , "Al_ittihad", "Future", "El_Gaish", "Ismaily", "NBFC", "CeramicaFC",  "Makawaloon", "DakhleyaFC", "ElmahallaFC"};
     int [] rate = {ahly.teamRate1 , zamalik.teamRate2 , pyramids.teamRate3 , enpi.teamRate4 , pharco.teamRate5 , smouha.teamRate6 , elgouna.teamRate7 , zed.teamRate8 , almasry.teamRate9 , alitihad.teamRate10 , future.teamRate11 , el_Gaish.teamRate12 , ismaily.teamRate13 , nbfc.teamRate14 , ceramicaFC.teamRate15 , makawaloon.teamRate16 , dakhleyaFC.teamRate17 , elmahallaFC.teamRate18 };
     
     FavouriteTeamo f = new FavouriteTeamo ( teamNames  ,  rate , q );
      
    }
}
class Ahly extends Rules {
    final String[] playerst1 = {"Mohamed El Shenawi", "Mohamed Hani", "Rami Rabia", "Mohamed Abd El Moneim", "Ali Maaloul", "Marwan Attia", "Nedved", "Magdy Afsha", "Sahaat", "Emam Ashour", "Kharaba"};
    final int[] playerratingt1 = {85, 84, 70, 76, 86, 74, 78, 79, 80, 88, 90};
    int teamRate1;

    public Ahly() {
        // Calculate the average rating and assign it to teamRate1
        teamRate1 = calculateAverageRating(playerratingt1);
        
    }
}
class Zamaliak extends Rules {
final String []playerst2={"Mohamed Awad","Nabil Dunga","Mohamed Ashraf Roqa","Ziad Kamal","Ahmed Hamdi","Mohamed Shehata","Seif Farouk Gaafar","Youssef Obama","Abdallah Said","Zizo","Shikabala"};
final int playerrating2[]={80,84,70,60,86,74,78,71,80,85,82};
int teamRate2;
public Zamaliak()
        {
        // Calculate the average rating and assign it to teamRate1
         teamRate2 = calculateAverageRating(playerrating2);
}}
class Pyramids extends Rules {
final String[]playerst3={"Ahmed El Shenawy","Islam Issa","Osama Galal","Ali Gabr","Ahmed Samy","Mohanad Lasheen","Ramadan Sobhi","Mostafa Fathi","Karim El Tayeb","Marwan Hamdi","Walid El Karti"};
final int playerrating3[]={77,54,70,76,86,74,76,79,80,81,90};
int teamRate3;
public Pyramids() {
        // Calculate the average rating and assign it to teamRate1
        teamRate3 = calculateAverageRating(playerrating3);
}}
class Ennpi extends Rules {
final String []playerst4={"Reda El Sayed","Ahmed Sabeha","Marwan Daoud","Ahmed El Agouz","Mody Naser","Ali Fawzi","Mostafa Dowidar","Rafik Kabou","Mohamed El Nahas","Ali Aboutaleb","Salah Zayed"};
final int playerrating4[]={65,84,70,76,86,74,78,79,77,82,65};
int teamRate4;
public Ennpi() {
        // Calculate the average rating and assign it to teamRate1
        teamRate4 = calculateAverageRating(playerrating4);
}
}
 class Pharco extends Rules {
 final String[]playerst5={"Mohamed Shika","Ahmed Awad","Mohamed Ayman","Mahmoud Gehad","Mahmoud El Badry","Ahmed Fouad","Saif Thierry","Omar Reda","Ahmed Sherif","Amr Nasser","Kingsley Sokari"};
 final int []playerrating5={44,64,70,56,50,64,70,79,80,80,66};
 int teamRate5;
 public Pharco() {
        // Calculate the average rating and assign it to teamRate1
  teamRate5 = calculateAverageRating(playerrating5);
 }}
class Smouha extends Rules {
final String[]playerst6={ "El-Hani Soliman ","Ahmed Hakam","Hossam Haridi","Mahmoud Wahid","Tarek Alaa","Bibo Ahmed Hassan","Islam Gaber","Junior Ajayi ","Ibrahima Gambo","Hossam Hassan","Hossam Greisha"};
 final int []playerrating6={43,84,70,76,86,74,78,79,80,58,90};
 int teamRate6;
 public Smouha() {
        // Calculate the average rating and assign it to teamRate1
  teamRate6 = calculateAverageRating(playerrating6);
 }}
class El_Gouna extends Rules {
final String[]playerst7={"Sobhi Soliman","Ahmed Hamed Shousha ","Sabri Rahil","Galal Fares ","Abdelfattah Sheta","Hossam Mohamed","Mohamed Emad","Ayman Moka","Hossam Ghanem","Karim Mamdouh","Gabriel Chukwudi"};
final int []playerrating7={73,84,70,76,65,74,78,79,80,48,90};
int teamRate7;
public El_Gouna() {
        // Calculate the average rating and assign it to teamRate1
 teamRate7 = calculateAverageRating(playerrating7);
}}
class ZED extends Rules {
final String[]playerst8={"Ali Lotfi","Mohamed Samir","Mohamed Ismail","Mohamed Ashraf","Ahmed Sayed","Mohamed Ali Okasha","Mahmoud Saber","Mostafa Ziko","Mostafa Saad","Mohamed Hamdi","Shady Hussein"};
final int []playerrating8={65,84,70,76,80,74,78,70,80,66,90};
int teamRate8;
public ZED() {
        // Calculate the average rating and assign it to teamRate1
 teamRate8 = calculateAverageRating(playerrating8);
}}
class Al_Masry extends Rules {
final String[]playerst9={"Mahmoud Gad","Mohamed Dabash","Ahmed Emad","Hussein El Sayed","Mostafa Ayman","Osama El Gazar","Mohamed El Fayoumi","Ziad Farag","Marwan Hamdi","Mohamed El Fayoumi","Mohamed El Gamal"};
final int[]playerrating9={55,84,70,76,86,74,73,79,80,65,60};
int teamRate9;
public Al_Masry() {
        // Calculate the average rating and assign it to teamRate1
 teamRate9 = calculateAverageRating(playerrating9);
}}
class Al_ittihad extends Rules {
final String[]playerst10={"Saif Teka","Mahdi Soliman","Sherif Rida","Rajab Omran","Ahmed Adel","Mabololo","Karim El Deeb","Abdelghani Mohamed","Ahmed Eid Abdel Naby","Belal El Sayed","Ahmed Ghoneim"};
final int[]playerrating10={42,84,70,76,62,74,78,79,80,58,63};
int teamRate10;
public Al_ittihad() {
        // Calculate the average rating and assign it to teamRate1
 teamRate10 = calculateAverageRating(playerrating10);
}}
class Future extends Rules {
final String[]playerst11={"Ahmed Yahya","Bassem Ali","Ahmed Refaat","Ghannam Mohammed","Ali Yasser","Ahmed Atef","Omar El Fishawy","Marwan Mohsen","Mohamed Farouk","mohamed zaalouk","Abdullah Hassan"};
final int[]playerrating11={30,84,76,76,55,74,78,79,80,65,70};
 int teamRate11;

    public Future() {
        teamRate11 = calculateAverageRating(playerrating11);
    }
 
}
class El_Gaish extends Rules {
final String[]playerst12={ "Mohamed Shaaban","Mohamed Diab","Amr Tarek","Hamid Mao","Islam Mohareb","Karim Salah","Fares Hattem","Omar Saeed","Yousry Wahid","Ahmed Meteb","Paul Joules"};
final int[]playerrating12={54, 70, 76, 86, 74, 78, 79, 80, 81, 90, 65};
 int teamRate12;

    public El_Gaish() {
        teamRate12 = calculateAverageRating(playerrating12);
    }
 
}
class Ismaily extends Rules {
final String[]playerst13={"Mohamed Fawzi","Mohamed Nasr","Ahmed Mohsen","Hatem Sukar","Mohamed Ehab","Essam Sobhy","Emad Hamdi","Nader Farag","Mohamed Wagdi","Hassan Saber","Mohamed Zidan"};
final int[]playerrating13={84, 70, 76, 86, 74, 78, 79, 77, 82, 65, 44};
 int teamRate13;

    public Ismaily() {
        teamRate13 = calculateAverageRating(playerrating13);
    }
 
}
class NBFC extends Rules {
final String[]playerst14={"Hassan Mahmoud","Amir Medhat","Ahmed Yassin","Aymna Ashraf","Osama Ibrahim","Ahmed Rabia","Mohamed hilal","Mahmoud Sayed","Ahmed Madbouli","Kariem Bamboo ","Osama Faisel"};
final int[]playerrating14={64, 70, 56, 50, 64, 70, 79, 80, 80, 66, 43};
 int teamRate14;

    public NBFC() {
        teamRate14 = calculateAverageRating(playerrating14);
    }
 
}
class CeramicaFC extends Rules {
final String[]playerst15={"Mohamed Bassam","Khaled Sobhy","Saaed Samir","Ragab Nabil","Mohamed Adel","Nour Alaa","Mohamed Ibrahim","Ahmed Yasser Rayan","Alaa Shaaban","Hussien Emad","Mohamed Tony"};
final int[]playerrating15={84, 70, 76, 86, 74, 78, 79, 80, 58, 90, 73};
 int teamRate15;

    public CeramicaFC() {
        teamRate15 = calculateAverageRating(playerrating15);
    }
 
}
class Makawaloon extends Rules {
final String[]playerst16={ "Amer Amer","Mohamed Hozian","Amir Abed","Ammar Hamdi","Ziad Faraj","Emad Mayhoub","Amir Mari","Mohammed Antar","Mohamed Salem","Mohanad Mohamed","Omar Fathi Saviola"};
final int[]playerrating16={84, 70, 76, 65, 74, 78, 79, 80, 48, 90, 65};
 int teamRate16;

    public Makawaloon() {
        teamRate16 = calculateAverageRating(playerrating16);
    }
 
}
class DakhleyaFC extends Rules {
final String[]playerst17={"Ramadan Mostafa","Mohamed Shawky","Mahmoud Saber","Mahmoud Mansour","Ahmed Shedad","Mohamed Hamdy","Mohamed El Attar","Hamza Magdi","Mostafa Fawzi","Adham Hamid","Loai Fahmy"};
final int[]playerrating17={84, 70, 76, 80, 74, 78, 70, 80, 66, 90, 55};
 int teamRate17;

    public DakhleyaFC() {
        teamRate17 = calculateAverageRating(playerrating17);
    }
 
}
class ElmahallaFC extends Rules {
final String[]playerst18={ "Mahmoud Maher","El Sayed Zeyad","Alaa Yehia","Ahmed Reda","Yousef Hassan","Moaaz Mosaad","Wahed Mohsen","Ahmed Hassan","Momaen Rady","Hossam Hassan","Islam Marzouk"};
final int[]playerrating18={ 84, 70, 76, 86, 74, 73, 79, 80, 65, 60, 42};
 int teamRate18;

    public ElmahallaFC() {
        teamRate18 = calculateAverageRating(playerrating18);
    }
 
}

class FavouriteTeamo {
    
Random random = new Random();
        Scanner s = new Scanner(System.in);

  

        // Define the number of teams
        public FavouriteTeamo (String [] names, int [] power, int q ) {
        int[] numTeams = new int [q];
        String [] teams = names;
       
        int[] teamStrengths = new int[numTeams.length];
        int [] score = new int [numTeams.length];
        for (int i = 0; i < numTeams.length; i++) {
            teamStrengths[i] = power[i];
            score[i]= 0;   
        }
        
        // keep a copy of the rates
        int [] defaultStrengths = new int [teamStrengths.length]; 
        for (int i = 0; i < numTeams.length; i++) {
            defaultStrengths[i] = teamStrengths[i];
        }
        
            System.out.println("Please select a Method: \n 1- Show Results. \n 2-Play! ");
            int method;
            while (true){
             method = s.nextInt();
             if (method ==1 || method ==2){break;} 
             else {System.out.println("Invalid entry please enter a right choice 1 or 2");}
             
            }
            switch (method){
                
                case 1: {
                    for (int i=0; i < numTeams.length; i++){
                        for (int t=0; t < numTeams.length ; t++){
                            if (t==i){continue;}
                            else {
                                // reset rate each new fight, gives the team home +5 points
                                for (int a=0 ; a < numTeams.length ; a++){
                                    if (i == a){
                                        teamStrengths [a] = (defaultStrengths[a]+5);}
                                    else {teamStrengths [a] = defaultStrengths[a];}
                                }
                                for (int j =0; j<6; j++){
                                    int n = random.nextInt(6);
                                    if (n>=3){
                                        switch(n){
                                            case 3: teamStrengths[i] += 10;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " scores goal in team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = " + teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 4: teamStrengths[i] -= 3;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " gets a red card against team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 5: teamStrengths[i] -= 1;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " gets a yellow card against team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                        }}
                                    else {
                                        switch(n){
                                            case 0: teamStrengths [t] += 10;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " scores goal in team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 1: teamStrengths [t] -= 3;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " gets a red card against team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 2: teamStrengths [t] -= 1;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " gets a yellow card against team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                        }
                                    }
                                }
                                if(teamStrengths[i] > (teamStrengths[t]+5)){
                                    score[i] += 3;
                                }
                                else if(teamStrengths[t] > (teamStrengths[i]+5)){
                                    score[t] += 3;
                                }
                                else if(teamStrengths[i] - teamStrengths[t] <= 5){
                                    score[i] += 1;
                                    score[t] += 1;
                                    
                                }else if(teamStrengths[t] - teamStrengths[i] <= 5){
                                    score[i] += 1;
                                    score[t] += 1;
                                }
                            }}} break;
        }
                
                
                case 2 : {
                    // Display the strengthes on screen and let the user choose the team
                    System.out.println("Choose a team to play with.");
                    for (int i = 0 ; i <numTeams.length; i++){
                        System.out.println((i)+ "- Team " + teams[i] + " strength = " + teamStrengths[i]);
                    }
                    int favoriteTeam = s.nextInt();
                    
                    for (int i=0; i < numTeams.length; i++){
                        if ((favoriteTeam) == i){
                            for (int t=0; t < numTeams.length ; t++){
                                //reset all rates to oriiginal & give team i home +5 bonus
                                for (int a=0 ; a < numTeams.length ; a++){
                                    if (i == a){
                                        teamStrengths [a] = (defaultStrengths[a]+5);}
                                    else {teamStrengths [a] = defaultStrengths[a];}
                                }
                                if (t==i){continue;} //if t=i skip cause it will not vs itself
                                else {
                                    // user play
                                    System.out.println("your team now is playing against team " + t +"- "+ teams[t]);
                                    System.out.println("Choose the event \n 0- Goal for you. \n 1- Red card for opponent. \n 2- Yellow card for opponent. \n 3- Goal for opponent. \n 4- Red Card for you. \n 5- Yellow Card for you. \n 6- End Match");
                                    int event = 0;
                                    while (event != 6){
                                        event = s.nextInt();
                                        switch (event) {
                                            case 0: teamStrengths [i] += 10;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " scores a goal in team " + t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 1: teamStrengths [t] -= 3;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " gets a red card against team " + i +"- "+ teams[i] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 2: teamStrengths [t] -= 1;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " gets a yellow card against team " + i +"- "+ teams[i] + " ,Rate of team  " + i + " = "+ teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 3: teamStrengths[t] += 10;
                                            System.out.println ( "team " + t +"- "+ teams[t] + " scores goal in team " + i +"- "+ teams[i] + " ,Rate of team  " + i +"- "+ teams[i] + " = " + teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 4: teamStrengths[i] -= 3;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " gets a red card against team " + t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 5: teamStrengths[i] -= 1;
                                            System.out.println ( "team " + i +"- "+ teams[i] + " gets a yellow card against team " + t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " + t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            case 6: if (teamStrengths[i]>(teamStrengths[t]+5)){
                                                score[i] +=3;
                                                System.out.println("Match Ends Your team wins " + "the Rate = " + teamStrengths[i]);
                                            }
                                            else if (teamStrengths[t] > (teamStrengths[i]+5)){
                                                score[t] +=3;
                                                System.out.println("Match Ends Your team loses " );
                                            }
                                            else if(teamStrengths[i] - teamStrengths[t] <= 5) {
                                                score[i]+=1;
                                                score[t]+=1;
                                                System.out.println("it is a draw");
                                            }
                                            else if(teamStrengths[t] - teamStrengths[i] <= 5){
                                                score[i] += 1;
                                                score[t] += 1;
                                            }break;
                                            default : System.out.println("Invalid event code, choose from the codes above");
                                        }
                                    }
                                }
                            }}
                        
                        
                        else {
                            // t is opponent team
                            for (int t=0; t < numTeams.length ; t++){
                                if (t==i){continue;}
                                else {
                                    // reset rate each new fight, gives the team home +5 points
                                    for (int a=0 ; a < numTeams.length ; a++){
                                        if (i == a){
                                            teamStrengths [a] = (defaultStrengths[a]+5);}
                                        else {teamStrengths [a] = defaultStrengths[a];}
                                    }
                                    for (int j =0; j<6; j++){
                                        int n = random.nextInt(6);
                                        if (n>=3){
                                            switch(n){
                                                case 3: teamStrengths[i] += 10;
                                                System.out.println ( "team " + i +"- "+ teams[i] + " scores goal in team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = " + teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                                case 4: teamStrengths[i] -= 3;
                                                System.out.println ( "team " + i +"- "+ teams[i] + " gets a red card against team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                                case 5: teamStrengths[i] -= 1;
                                                System.out.println ( "team " + i +"- "+ teams[i] + " gets a yellow card against team " +  t +"- "+ teams[t] + " ,Rate of team  " + i +"- "+ teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            }}
                                        else {
                                            switch(n){
                                                case 0: teamStrengths [t] += 10;
                                                System.out.println ( "team " + t +"- "+ teams[t] + " scores goal in team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                                case 1: teamStrengths [t] -= 3;
                                                System.out.println ( "team " + t +"- "+ teams[t] + " gets a red card against team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                                case 2: teamStrengths [t] -= 1;
                                                System.out.println ( "team " + t +"- "+ teams[t] + " gets a yellow card against team " +  i +"- "+ teams[i] + " ,Rate of team  " + teams[i] + " = "+ teamStrengths[i] + " ,Rate of team  " +  t +"- "+ teams[t] + " = " + teamStrengths [t] ); break;
                                            }
                                        }
                                    }
                                    if(teamStrengths[i] > (teamStrengths[t]+5)){
                                        score[i] += 3;
                                    }
                                    else if(teamStrengths[t] > (teamStrengths[i]+5)){
                                        score[t] += 3;
                                    }
                                    else if(teamStrengths[i] - teamStrengths[t] <= 5){
                                        score[i] += 1;
                                        score[t] += 1; }
                                    else if(teamStrengths[t] - teamStrengths[i] <= 5){
                                        score[i] += 1;
                                        score[t] += 1;
                                    }
                                }}}
                    }
        }
                default : System.out.println("Invalid entry! Please Enter a Valid Choice 1 or 2");
        }
                    
           
        
        
        // yossef part
        //print out the scores
    for (int i =0 ; i < numTeams.length; i++){
        System.out.println("Team " + teams[i] + " Strength = " + teamStrengths[i]);
        System.out.println("Team " + teams[i] + " Score = " + score[i]);
    }
    
    JFrame frame = new JFrame("Points Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTable with 18 rows and 3 columns
        String[] columnNames = {"Place", "Team", "Points"};
        DefaultTableModel model = new DefaultTableModel(columnNames, numTeams.length);
        JTable table = new JTable(model);

        // Fixed team names (you can customize these)
        String[] teamNames = new String[numTeams.length];
        for (int i = 0; i < numTeams.length; i++) {
            teamNames[i] = "Team " + (i + 1);
        }

        
        // Sort the points in descending order
         // Bubble sort (descending order)
         int [] d = new int [numTeams.length];
         for (int i = 0 ; i < numTeams.length; i++){
         d[i] = i; 
         }
         int [] scoreNew = new int [score.length];
         for (int i = 0 ; i < numTeams.length; i++){
         scoreNew[i] = score[i]; 
         }
        for (int i = 0; i < numTeams.length - 1; i++) {
            for (int j = 0; j < numTeams.length - 1; j++) {
                if (scoreNew[j] < scoreNew[j + 1]) {
                    // Swap elements
                    int temp = scoreNew[j];
                    scoreNew[j] = scoreNew[j + 1];
                    scoreNew[j + 1] = temp;
                    int tempo = d[j] ; 
                    d[j]=d[j+1];
                    d[j+1]=tempo;
                }
            }
        }
        
        String [] teamsNew = new String [teams.length];
        for (int i =0 ; i <numTeams.length; i++){
        teamsNew[i]=teams[d[i]]; }
        
        for (int i = 0; i < numTeams.length; i++) {
            model.setValueAt(i + 1, i, 0); // Set place
            model.setValueAt(teamsNew[i], i, 1); // Set team name
            model.setValueAt(scoreNew[i], i, 2); // Set points (descending order)
        }

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Pack and display the frame
        frame.pack();
        frame.setVisible(true);
    

    
        
    }
            
}