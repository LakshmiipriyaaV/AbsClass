package abs;

class ThisKeyword {
	   String name;

	   
	   void setName( String name ) {
	       this.name = name;
	   }

	   
	   String getName(){
	       return this.name;
	   }

	   public static void main( String[] args ) {
	      ThisKeyword obj = new ThisKeyword();

	       
	       obj.setName("Lakshmipriya");
	       System.out.println("obj.name: "+obj.getName());
	   }
	}