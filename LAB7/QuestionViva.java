public class QuestionViva {
 public static void main (String[] args){
   String[] words = {"tanmay" , "patra" , "rollnumber"};


    String newString = String.join(" " ,words);

    System.out.println("Answer = " + newString);


	        if (newString.isEmpty()) {
	            System.out.println("is empty");
	        } else {
	            System.out.println("is not empty");
        }

   }
 }