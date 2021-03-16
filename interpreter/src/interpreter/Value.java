package interpreter;

public interface Value {
	
	/*public static final*/ int[] x = new int[10];
	
	default boolean isZero() { return this instanceof IntValue && ((IntValue)this).value == 0; }
	
	public static Value evaluate(Value value1, char operator, Value value2) {
		switch (operator) {
		case '+':
			if (value1 instanceof AddableValue)
				return ((AddableValue)value1).add(value2);
			else
				throw new RuntimeException("Cannot apply + to these values");
		case '&':
			if (value1 instanceof AndableValue)
				return ((AndableValue)value1).and(value2);
			else
				throw new RuntimeException("Cannot apply & to these values");
		default:
			throw new RuntimeException("Operator not supported");
		}
	}
}
