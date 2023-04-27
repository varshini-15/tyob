package com.ob.exercisess;

import java.io.FileReader;

public class FileExcep {
	public static void main(String[] args) {
		try {
			FileReader filereader = new FileReader("/home/onebill/Downloads/Java-Naming-conventions.pdf");
			System.out.println("file is ready");
		} catch (Exception e) {
			System.out.println("asdfghj");
		}finally {
			System.out.println("Exceptions");
		}

	}
}
