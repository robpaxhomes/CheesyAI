package com.robpaxhomes.cheesyai.common;

import java.util.Random;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	  // Setup string
      String strOutputToUser = new String();

	  // create random object
	  Random randomno = new Random();

	  // Initial output from AI
      Scanner input = new Scanner(System.in);
      System.out.println("Hello. ");
      
      // Create everyone's object
      IProcessInput processInput = null;
      IProcessInput processInputJamie = new com.robpaxhomes.cheesyai.jamie.ProcessInput();
      IProcessInput processInputNick = new com.robpaxhomes.cheesyai.nick.ProcessInput();
      IProcessInput processInputReo = new com.robpaxhomes.cheesyai.reo.ProcessInput();
      IProcessInput processInputRob = new com.robpaxhomes.cheesyai.rob.ProcessInput();
      
      // Get initial input from the user
      String userInput = input.next();

      while(true)
	  {
	      // We have 4 people, 0 - 3
	      int nNextPerson = randomno.nextInt(4);
	      
	      switch(nNextPerson)
	      {
	      case 0: // Jamie
	    	  processInput = processInputJamie;
	    	  break;
	      case 1: // Nick
	    	  processInput = processInputNick;
	    	  break;
	      case 2: // Reo
	    	  processInput = processInputReo;
	    	  break;
	      case 3: // Rob
	    	  processInput = processInputRob;
	    	  break;
	      }
	      
	      strOutputToUser = processInput.processStringInput(userInput);
	      if(strOutputToUser == null)
	      {
	    	  strOutputToUser = "I don't Know.";
	      }
	      
	      
	      System.out.println(strOutputToUser);
	      userInput = input.next();
	      
	  }

	}

}
