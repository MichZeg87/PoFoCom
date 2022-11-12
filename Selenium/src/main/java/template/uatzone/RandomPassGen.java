package template.uatzone;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPassGen {

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public String generatePass(int length, int lowCas, int uppCas, int digit) {
        PasswordGenerator gen = new PasswordGenerator();
        EnglishCharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(lowCas);

        EnglishCharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(uppCas);

        EnglishCharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(digit);

        String password = gen.generatePassword(length,  lowerCaseRule,
                upperCaseRule, digitRule);
        System.out.println("Password is: "+password);
        return password;
    }

}
