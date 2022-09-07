package sprint2.day4;

public class Vowel_And_Consonant {
    char ch = 'a';
    char ch1 = 'K';
    char ch2 = '@';
    public static void main(String[] args) {
        VowelCheck();
        ConsonantCheck();
        InvalidCharCheck();
    }

    public static void VowelCheck(){
        Vowel_And_Consonant chObj = new Vowel_And_Consonant();

        if(chObj.ch == 'a' || chObj.ch == 'e' || chObj.ch == 'i' || chObj.ch == 'o' || chObj.ch == 'u'){
            System.out.println(chObj.ch+" is Vowel");
        }else if((chObj.ch>='a' && chObj.ch<='z')||(chObj.ch>='A' && chObj.ch<='Z'))
            System.out.println(chObj.ch+" is Consonant");
        else
            System.out.println(chObj.ch+" Not an alphabet");
    }

    public static void ConsonantCheck(){
        Vowel_And_Consonant chObj = new Vowel_And_Consonant();

        if(chObj.ch1 == 'a' || chObj.ch1 == 'e' || chObj.ch1 == 'i' || chObj.ch1 == 'o' || chObj.ch1 == 'u'){
            System.out.println(chObj.ch1+" is Vowel");
        }else if((chObj.ch1>='a' && chObj.ch1<='z')||(chObj.ch1>='A' && chObj.ch1<='Z'))
            System.out.println(chObj.ch1+" is Consonant");
        else
            System.out.println(chObj.ch1+" Not an alphabet");
    }

    public static void InvalidCharCheck(){
        Vowel_And_Consonant chObj = new Vowel_And_Consonant();

        if(chObj.ch2 == 'a' || chObj.ch2 == 'e' || chObj.ch2 == 'i' || chObj.ch2 == 'o' || chObj.ch2 == 'u'){
            System.out.println(chObj.ch1+" is Vowel");
        }else if((chObj.ch2>='a' && chObj.ch2<='z')||(chObj.ch2>='A' && chObj.ch2<='Z'))
            System.out.println(chObj.ch2+" is Consonant");
        else
            System.out.println(chObj.ch2+" Not an alphabet");
    }


}




