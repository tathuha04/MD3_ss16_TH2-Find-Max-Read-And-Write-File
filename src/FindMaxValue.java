import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBERS = "F:\\RIKKEI_ACADEMY\\MODULE_3\\ss16\\thuchanh2\\src\\number.txt";
        String PATH_RESULT = "F:\\RIKKEI_ACADEMY\\MODULE_3\\ss16\\thuchanh2\\src\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBERS);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
