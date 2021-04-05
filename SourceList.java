/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0218230U
 */
interface SourceList<T> {
  T getFirst();

  SourceList<T> getSecond();
  
  // Write your code here
  public SourceList<T> filter(BooleanCondition<? super T> cond);

  public <U> SourceList<U> map(Transformer<? super T, ? extends U> trans);
  
  public int length();
}
