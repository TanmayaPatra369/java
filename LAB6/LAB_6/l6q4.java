

class l6q4{
	    @SuppressWarnings("null")
		public static void main(String[] args) {
	        String str = null;

	        try {
	            System.out.println(str.length());
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e);
	        }
	    }
}