/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0218230U
 */

class InvalidOperandException extends RuntimeException {

  private char character;

  public InvalidOperandException(char character) {
    super("ERROR: Invalid operand for operator " + character);
    this.character = character;
  }

}
