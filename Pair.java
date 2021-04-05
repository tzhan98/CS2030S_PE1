/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0218230U
 */
public class Pair<T> implements SourceList<T> {
  private T first;
  private SourceList<T> second;

  public Pair(T first, SourceList<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public T getFirst() {
    return this.first;
  }

  @Override
  public SourceList<T> getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return this.first + ", " + this.second;
  }

  // Write your code here
  @Override
  public int length() {
    if (this.getSecond() instanceof EmptyList<?>) {
      return 0;
    } else {
      return 1 + this.getSecond().length();
    }
  }


  @Override
  public boolean equals(Object compared) {
    if (compared instanceof SourceList<?>) {
    @SuppressWarnings("unchecked")
    SourceList<T> comp = (SourceList<T>) compared;
      if (this.length() != comp.length()) {
        return false;
      } else if (this.getFirst() == comp.getFirst()){
        return getSecond().equals(comp.getSecond());
      } else if (this.getFirst() != comp.getFirst()) {
        return false;
      } else {
        return true;
      }
    } else {
      return false;
    }
  }

  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    if (this.getFirst() == null) {
      return new EmptyList<T>();
    } else if (this.getSecond() == null) {
      return new Pair<T>(cond.test(this.getFirst()), new EmptyList<>());
    } else if (cond.test(this.getFirst())) {
      return new Pair<T>(this.getFirst(), this.getSecond().filter(cond));
    } else if (!cond.test(this.getFirst())) {
      return new Pair<T>(this.getSecond().filter(cond), getSecond());
    } else {
      return null;
    }
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> trans) {
    if (this.getFirst() == null) {
      return new EmptyList<T>();
    } else if (this.getSecond() == null) {
      return new Pair<U>(trans.transform(this.getFirst()), new EmptyList<>());
    } else {
      return new Pair<U>(trans.transform(this.getFirst()), this.getSecond().map(trans));
    }
  }

}
