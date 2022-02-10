package com.samsung.ui;

enum Level {
    HIGH  (3),  //calls constructor with value 3
    MEDIUM(2),  //calls constructor with value 2
    LOW   (1)   //calls constructor with value 1
    ; // semicolon needed when fields / methods follow

    private final int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }
    
    public int getLevelCode() {
        return this.levelCode;
    }
    
}

public class EnumTest2 {
	public static void main(String[] args) {
		Level level = Level.HIGH;

		System.out.println(level.getLevelCode());
		System.out.println(level.ordinal());
		System.out.println(level.name());
	}
}
