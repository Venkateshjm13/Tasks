package task11_programs;

 class IncorrectPasswordException extends Exception {

	 	//this is the constructor for IncorrectPasswordException
	    public IncorrectPasswordException(String message) {
	        //the super keyword is used to call the constructor of the superclass (Exception). 
	    	//The message parameter is passed to the superclass constructor
	    	//which sets the error message for the exception.
	    	
	    	super(message);
	    }
	}

