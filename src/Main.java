//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //quick test
        boolean result = isUnique("always");
        System.out.println("This word is unique : " + result);
    }

    public static boolean isUnique(String word){

        char[] list = word.toCharArray();
        for (int i = 0; i < list.length; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                if(word.charAt(i) == word.charAt(j))
                {
                    return false;
                }

            }
        }
        return true;
    }
}