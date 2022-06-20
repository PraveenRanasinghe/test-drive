import java.util.Arrays;

public class Testing {
    public static boolean primeNumber(int number){
        int i=2;
        if(number % i == 0){
            return false;
        }
        return true;
    }

    public static String reverseString( String word){
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public static boolean findVowels(String word){
        return word.matches(".*[aeiou]*.");
    }

    public static boolean findOdd(int number){
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static String removeWhiteSpace(String word){
        return word.trim();
    }
    
    public static String sort(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public static String rev(String n){
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        return sb.toString();
    }
    public static int maxValue(int [] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public void hello(String text){
        System.out.println(("Hello ") + text.trim());
    }

    static void bubbleSort(int [] array){
        for(int i=0; i<=array.length; i++){
            for(int j=0; j<= array.length-1; j++){
                if (array[j] > array[j + 1]) {
                     
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    void printArray(int arr[])
    {
        bubbleSort(arr);
        int n = arr.length-1;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(5));
        System.out.println(reverseString("Hello"));
        System.out.println(findVowels("Hello"));
        System.out.println(findOdd(6));
        System.out.println(removeWhiteSpace("My Name is Praveen!"));
        System.out.println(maxValue(new int[]{12,34,45,6,7,5}));
        Testing t = new Testing();
        t.hello(" Praveen");
        System.out.println(max(new int[]{12,384,45,6,7,5}));
        // t.printArray(new int[]{12,384,45,6,7,5});
        System.out.println(reve("Praveen"));
        System.out.println(rev("Huuhhuhuhuhuhuhuhuh kakakahshdjjdjdkdkd"));
        System.out.println(findMax(new int[]{12,34,45,6,7,500}));
        t.printArray(new int[]{12,34,45,6,7,500});
    }

    public static boolean prime(int number){
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static String re(String e){
        char ch[] = e.toCharArray();
        String word = "";
        for(int i=e.length()-1; i>=0; i++){
            word += ch[i];
        }
        return word;
    }

    public static String reverse(String word){
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public static int max(int[] number){
        int max = number[0];
        for(int i=0; i<= number.length-1; i++){
            if(number[i]>max){
                max = number[i];
            }
        }
        return max;
    }

    public static int[] sorting(int [] arr){
        
        return arr;
    }

    public static String reve(String word){
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]> arr[0]){
                max= arr[i];
            }
        }
        return max;
    }

}

