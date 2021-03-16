package interpreter;

public class BooleanValue implements AndableValue {
	
	public final boolean value;
	
	public BooleanValue(boolean value) {
		this.value = value;
	}
	
	@Override
	public Value and(Value other) {
		if (other instanceof BooleanValue)
			return new BooleanValue(value & ((BooleanValue)other).value);
		else
			throw new RuntimeException("Cannot add a boolean to this value.");
	}

}
