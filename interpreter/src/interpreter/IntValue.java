package interpreter;

public class IntValue implements AddableValue, AndableValue {
	
	public final int value;
	
	public IntValue(int value) {
		this.value = value;
	}
	
	@Override
	public Value add(Value other) {
		if (other instanceof IntValue)
			return new IntValue(value + ((IntValue)other).value);
		else
			throw new RuntimeException("Cannot add an int to this value.");
	}
	
	@Override
	public Value and(Value other) {
		if (other instanceof IntValue)
			return new IntValue(value & ((IntValue)other).value);
		else
			throw new RuntimeException("Cannot apply & to an int value and the given value");
	}

}
