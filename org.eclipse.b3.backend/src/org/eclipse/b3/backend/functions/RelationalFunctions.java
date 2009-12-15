package org.eclipse.b3.backend.functions;

import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.SimplePattern;

public class RelationalFunctions {

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"=="})
	public static Boolean equals(Object left, Object right) {
		if(left == right || left.equals(right))
			return Boolean.TRUE;
		if(left instanceof Comparable) {
			if(((Comparable)left).compareTo(right) == 0)
				return Boolean.TRUE;
		} else if(right instanceof Comparable && ((Comparable)right).compareTo(left) == 0)
			return Boolean.TRUE;
		
		return Boolean.FALSE;
	}
	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"=="})
	public static Boolean equals(Number a, Number b) {
		if(a == b || a.equals(b))
			return Boolean.TRUE;
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() == b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() == b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() == b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() == b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() == b.shortValue());
		if(a instanceof Comparable) {
			if(((Comparable)a).compareTo(b) == 0)
				return Boolean.TRUE;
		} else if(b instanceof Comparable) {
			if(((Comparable)b).compareTo(a) == 0)
				return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!="})
	public static Boolean notEquals(Object left, Object right) {
		return equals(left,right) == Boolean.TRUE ? Boolean.FALSE : Boolean.TRUE;
	}

	@B3Backend(funcNames={"===", "eq"}, hideOriginal=true)
	public static Boolean isIdentical(Object left, Object right) {
		if(left == right)
			return Boolean.TRUE;		
		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!==", "neq"}, hideOriginal=true)
	public static Boolean isNotIdentical(Object left, Object right) {
		if(left != right)
			return Boolean.TRUE;
		return Boolean.FALSE;
	}
	
	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"<"})
	public static Boolean isLessThan(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isLessThan((Number)left, (Number)right);
		return left.compareTo(right) < 0 ? Boolean.TRUE : Boolean.FALSE;
	}

	@B3Backend(funcNames={"<"})
	public static Boolean isLessThan(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() < b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() < b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() < b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() < b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() < b.shortValue());

		return Boolean.FALSE;
	}
	
	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"<="})
	public static Boolean isLessThanOrEqualTo(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isLessThanOrEqualTo((Number)left, (Number)right);
		return left.compareTo(right) <= 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={"<="})
	public static Boolean isLessThanOrEqualTo(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() <= b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() <= b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() <= b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() <= b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() <= b.shortValue());

		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={">"})
	public static Boolean isGreaterThan(Comparable left, Comparable right) {
		if(left instanceof Number && right instanceof Number)
			return isGreaterThan((Number)left, (Number)right);
		return left.compareTo(right) > 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={">"})
	public static Boolean isGreaterThan(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() > b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() > b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() > b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() > b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() > b.shortValue());

		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={">="})
	public static Boolean isGreaterThanOrEqualTo(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isGreaterThanOrEqualTo((Number)left, (Number)right);

		return left.compareTo(right) >= 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={">="})
	public static Boolean isGreaterThanOrEqualTo(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() >= b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() >= b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() >= b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() >= b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() >= b.shortValue());

		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!"})
	public static Boolean not(Boolean left) {
		return left.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
	}
	@B3Backend(funcNames={"~="})
	public static Boolean matches(Pattern pattern, CharSequence string) {
		return pattern.matcher(string).matches() ? Boolean.TRUE : Boolean.FALSE;
	}
	
	@B3Backend(funcNames={"~="})
	public static Boolean matches(CharSequence string, Pattern pattern) {
		return pattern.matcher(string).matches() ? Boolean.TRUE : Boolean.FALSE;
	}

	@B3Backend(funcNames={"~="})
	public static Boolean matches(CharSequence string, CharSequence pattern) {
		return SimplePattern.compile(pattern).isMatch(string) ? Boolean.TRUE : Boolean.FALSE;
	}
	
}
