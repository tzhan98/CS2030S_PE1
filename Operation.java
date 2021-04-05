/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0218230U
 *
 * */
// When running the style checker, it throws an exception
abstract class Operation {
  private Operand operand1;
  private Operand operand2;

  public Operand of(char character,Operand first, Operand second) {
    this.operand1 = first;
    this.operand2 = second;
    Operand op1 = first.eval();
    Operand op2 = second.eval();
    if (character == '*' && (op1 instanceof Integer) && (op2 instanceof Integer) {
      return Operand(op1 * op2);
    } else if (character == '+' && (op1 instanceof String) && (op2 instanceof String) {
      return Operand(op1 + op2);
    } else if (character == '^' && (op1 instanceof Boolean) && (op2 instanceof Boolean) {
      return Operand(op1 ^ op2);
    } else {
      return null;
    }
  }

  public static boolean boolXOR(Boolean op1, Boolean op2) {
    if (op1 == true && op2 == true) {
      return false;
    } else if (op1 == false && op2 == false) {
      return false;
    } else if (op1 == true && op2 == false) {
      return true;
    } else {
      return true;
    }
  }

}
