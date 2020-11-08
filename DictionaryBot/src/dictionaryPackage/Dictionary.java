package dictionaryPackage;

import java.util.ArrayList;

public class Dictionary {

	public ArrayList<Word> allWords;

	public void setAllWords(ArrayList<Word> allWords) {
		this.allWords = allWords;
	}

	public Dictionary(){
		allWords = new ArrayList<Word>();
	}

	public void appendWord(Word addedWord) {
		allWords.add(addedWord);
	}

	public void deleteWordByString(String removedWord) {
		for(int i=0;i<allWords.size()-1;i++) {
			if(allWords.get(i).getWordName().equals(removedWord)) {
				allWords.remove(i);
				return;
			}
		}
		System.out.println("Word could not be removed");
	}

	public Word getWord(String name) {
		Word theWord = null;
		for(int i=0;i<allWords.size()-1;i++) {
			if(allWords.get(i).getWordName().equals(name)) {
				theWord = allWords.get(i);
			}
		}

		return theWord;
	}
	
	public Word get(int x) {
		return allWords.get(x);
	}

	public String getAllWords() {
		String temp = "";
		for(int i = 0; i < allWords.size(); i++) {
			temp += (i+1) + ". " + allWords.get(i).getWordName() + " -- " + allWords.get(i).getDefinition() + "\n\n";
		}

		return temp;
	}

	public int size() {
		return allWords.size();
	}
}
