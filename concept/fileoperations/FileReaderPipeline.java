package com.java.eight.concept.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class FileReaderPipeline {

	public static final Function<String, String> trim = String::trim;
	public static final Function<String, String> toUpperCase = String::toUpperCase;
	public static final Function<String, String> replaceSpecialCharacters = str -> str.replaceAll("[^\\p{Alpha}]+",	" ");
	public static final Function<String, String> pipeline = trim.andThen(toUpperCase).andThen(replaceSpecialCharacters);

	public static void main(String[] args) throws IOException {
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			file = new File("mytext.txt");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String result = pipeline.apply(line);
				System.out.println(result);
			}
		} catch (Exception e) {
			System.out.println("File Handling Exception: " + e);
		} finally {
			try {
				bufferedReader.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
