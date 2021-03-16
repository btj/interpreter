package interpreter;

public interface AddableValue extends Value {
	
	public abstract Value add(Value other);

}
