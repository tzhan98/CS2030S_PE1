/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0218230U
 */

class Operand<T> {
  private T content;

  public Operand(T content) {
    this.content = content;
  }

  public T eval() throws InvalidOperandException {
    return this.content;
  }


}
