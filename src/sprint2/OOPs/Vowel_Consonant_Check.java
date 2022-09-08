package sprint2.OOPs;

public class Vowel_Consonant_Check {
    public static void main(String[] args) {
        VowelCheck();

    }

    public static void VowelCheck(){
        Character charObj = new Character();
        if(charObj.s1 == 'a' || charObj.s1 == 'e' || charObj.s1 == 'i' || charObj.s1 == 'o' || charObj.s1 == 'u'){
            System.out.println(charObj.s1 + " is a vowel");
        }else{
            System.out.println(charObj.s1+" is a consonant");
        }
    }
}

class Character{
    char s1= 'a';
}