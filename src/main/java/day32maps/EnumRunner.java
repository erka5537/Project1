package day32maps;

public class EnumRunner {

    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName);

        String abbreviation = UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbreviation);
    }
}
