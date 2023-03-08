package com.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord){
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())){
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
//        return dictionary.getOrDefault(polishWord, Collections.emptyList());
        return result;
    }

    public List<EnglishWord> findEnglishWorlds(String polishWord){
        return Collections.emptyList();
    }

    public int size(){
        return dictionary.size();
    }

}
