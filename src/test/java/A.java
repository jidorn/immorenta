import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NotDirectoryException;
import java.util.Arrays;
import java.util.Objects;

public class A {

    static boolean exists(int[] ints, int k) {
        if (ints.length==0)return false;
        if (ints.length==1)
            return ints[0]==k;
        Arrays.sort(ints);
        boolean found = false;
        int firstIndex = 0;
        int lastIndex = ints.length;
        int middle;
        if (ints[ints.length-1]==k) return true;
        else {
            while (!found && lastIndex-firstIndex>1){
                middle = (firstIndex+lastIndex)/2;
                found = ints[middle]==k;
                if (ints[middle]>k)
                    lastIndex = middle;
                else firstIndex = middle;
            }
        }
        return firstIndex==k;
    }

    static String findPath(File directory,String fileName,StringBuilder result) throws NotDirectoryException {
        if (directory.isDirectory()){
            search(directory,fileName,result);
        }
        else {
            throw new NotDirectoryException(fileName);
        }
        return result.toString();
    }

    private static void search(File directory, String fileName, StringBuilder result) {
        if (directory.canRead()){
            for (File temp : Objects.requireNonNull(directory.listFiles())){
                if (temp.isDirectory())
                    search(temp,fileName,result);
                else {
                    if (fileName.equals(temp.getName()))
                        result.append(temp.getAbsoluteFile().toString());
                }
            }
        }else {
            System.out.println(directory.getAbsoluteFile() + "Permission Denied");
        }
    }

    static double closestToZero(double[] ts) {
        double result= 1000000;

        if (ts.length ==0)
            return 0;
        for (double temperature : ts) {
            if (Math.abs(result) == Math.abs(temperature)) {
                if (temperature > 0)
                    result = temperature;
            } else if (Math.abs(result) > Math.abs(temperature))
                result = temperature;
        }
        return result;
    }
    static int[][] getTimesTable() {
        int[][] ret = new int[12][12];
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                ret[row][col] = (row + 1) * (col + 1);
            }
        }
        return ret;
    }

    static String fileReader(String path){
        FileReader reader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            reader = new FileReader(path);
            char[] buffer = new char[5];
            int numberOfReadedCharacters;
            while (true) {
                boolean test = (numberOfReadedCharacters = reader.read(buffer)) > 0;
                if (!test) break;
                stringBuilder.append(buffer, 0, numberOfReadedCharacters);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static boolean isPalindrome(String string){
        for ( int debut=0, fin =(string.length()-1); debut < fin ; debut++,fin-- ) {
            String start = string.substring( debut, debut+1 ).toLowerCase();
            String end   = string.substring( fin, fin+1 ).toLowerCase();

            if ( !  start.equals( end )  ) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(String firstString, String secondString){
        if (firstString==null||secondString==null)
            return false;
        if (firstString.isEmpty()||secondString.isEmpty())
            return false;
        String stringReversed = new StringBuilder(firstString).reverse().toString();
        return secondString.equals(stringReversed);
    }

    static int theShortestDifference(int p1, int p2, int result){
        int diff = Math.abs(p1)-Math.abs(p2);
        if (diff < result)
            return diff;
        else return result;
    }
}
