public class ExcelSheetColumnTitle_168 {

    static String convertToTitle(int columnNumber){
        StringBuilder output = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            char c = (char)(columnNumber % 26 + 'A');//we are subtracting 1 from columnNumber because we are adding A (run on pen and paper)
            columnNumber /= 26;
            output.append(c);
        }
        return output.reverse().toString();
    }
}
