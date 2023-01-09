public class SimonSays {
public static void main (String [] args) {
  String simonPattern = "";
  String userPattern = "";
  int userScore = 0;
  int i = 0;

  userScore = 0;
  simonPattern = "RRGBRYYBGY";
  userPattern  = "RRGBBRYBGY";

  /* Your solution goes here  */
  char s;
  char u;


  for (i=0;i<=10;i++) {
     s = simonPattern.charAt(i);
     u = userPattern.charAt(i);

     if (s == u) {
        userScore = userScore + 1;
        continue;
     }

  }

  System.out.println("userScore: " + userScore);

  return;
 }
}