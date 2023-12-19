/**
 * A program to carry on conversations with a human user.
 */
public class ChatBot1
{
  // TODO: Change if needed.
  public static final int NUMBER_OF_RESPONSES = 4;

  /**
   * Get a default greeting
   * 
   * @return a greeting
   */
  public String getGreeting()
  {
    return "Hello, let's talk. Type something now and press the enter key:";
  }

  /**
   * Gives a response to a user statement
   * 
   * @param statement
   *          the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement)
  {
    String response = "";
    if (statement.indexOf("no") >= 0)
    {
      response = "Why so negative?";
    }
    else if (statement.indexOf("mother") >= 0
      || statement.indexOf("father") >= 0)
    {
      response = "Tell me more about your family.";
    }
    // The new responses are added here.

    // TODO: Handle cat and dog:

    // TODO: Handle your VHS teacher name:

    // TODO: Handle if the user just presses enter without typing anything:

    // There should also be three more replies of the student's own choosing.

    else
    {
      // Default response if we have no idea what they are typing.
      response = getRandomResponse();
    }
    return response;
  }

  /**
   * Pick a default response to use if nothing else fits.
   * 
   * @return a non-committal string
   */
  private String getRandomResponse()
  {
    double r = Math.random();
    int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
    String response = "";

    if (whichResponse == 0)
    {
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1)
    {
      response = "Hmmm.";
    }
    else if (whichResponse == 2)
    {
      response = "Do you really think so?";
    }
    else if (whichResponse == 3)
    {
      response = "You don't say.";
    }
    // TODO: Add two more responses here.

    return response;
  }
}
