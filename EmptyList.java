/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0218230U
 */
public class EmptyList<T> implements SourceList<T> {
  
  @Override
  public T getFirst() {
    return null;
  }

  @Override
  public SourceList<T> getSecond() {
    return null;
  }

  @Override
  public String toString() {
    return "EmptyList";
  }

  // Write your code here

  @Override
  public int length() {
    return 0;
  }

  @Override
  public boolean equals(Object compared) {
    if (compared instanceof EmptyList<?>) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    return new EmptyList();  
  }
  
  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> trans) {
   return new EmptyList(); 
  }

}
