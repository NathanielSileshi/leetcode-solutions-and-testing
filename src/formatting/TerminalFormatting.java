package formatting;

public class TerminalFormatting {

    public TerminalFormatting(){}

    public void outputTitle(String problemName){

        int nameLength = problemName.length();
        int titleLength =  304 / (15 + nameLength); // Title length varies on the problem name length
        String title = ("  |" + problemName.toUpperCase() + " LEETCODE" + "|  ").repeat(titleLength); // Title characters
        String titleOutline = "-".repeat(304); // Title borders ---- full screen covers 304 "-" characters

        System.out.println(titleOutline + "\n" + title + "\n" + titleOutline);
    }
    public void outputproperties(String[] propertyNames, String[] properties){

        System.out.println();

        for(int index = 0; index < properties.length; index++){
            System.out.println( propertyNames[index] + properties[index]);
        }
        System.out.println();
    }
}
