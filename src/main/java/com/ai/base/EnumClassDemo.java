package com.ai.base;

import java.util.stream.Stream;

public class EnumClassDemo {
	public static void main(String[] args) {
		println(Counting.ONE);
		println(CountingEnum.ONE);
		println(CountingEnum.FOUR);
		printlnEachEnum();
		printEnumMeta(CountingEnum.FOUR);
		CountingEnum.FOUR.valueAsString();
	}
	public static void println(Counting counting) {
		System.out.println(counting);
	}
	public static void println(CountingEnum countingEnum) {
		System.out.println(countingEnum);
	}
	public static void printlnEachEnum() {
		Stream.of(CountingEnum.values()).forEach(
				System.out::println);
	}
	public static void printEnumMeta(Enum countEnum) {
		System.out.println("enumeration type:"+countEnum.getClass());
		System.out.println("member:"+countEnum.name());
		System.out.println("ordinal:"+countEnum.ordinal());
	}
}

enum CountingEnum{
	ONE(1){
		@Override
		String valueAsString() {
			return String.valueOf(this.getValue());
		}
	},
	TWO(2){
		@Override
		String valueAsString() {
			return String.valueOf(this.getValue());
		}
	},
	THREE(3){
		@Override
		String valueAsString() {
			return String.valueOf(this.getValue());
		}
	},
	FOUR(4){
		@Override
		String valueAsString() {
			return String.valueOf(this.getValue());
		}
	},
	FIVE(5){
		@Override
		String valueAsString() {
			return String.valueOf(this.getValue());
		}
	};
	private int value;
	
	public int getValue() {
		return value;
	}
	CountingEnum(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Counting [value=" + value + "]";
	}
	abstract String valueAsString();
}

/**
 * 枚举类：计数
 * 强类型约束
 * @author Administrator
 *
 */
final class Counting{
	public static final Counting ONE = new Counting(1);
	
	public static final Counting TWO = new Counting(2);
	
	public static final Counting THREE = new Counting(3);
	
	public static final Counting FOUR = new Counting(4);
	
	public static final Counting FIVE = new Counting(5);
	
	private int value;
	private Counting(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Counting [value=" + value + "]";
	}
}
