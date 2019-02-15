package edu.cnm.deepdive;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddAll {

  public static void main(String[] args) {
    int[] data = {-14,

    };

    int sum = IntStream.of(data).sum();
  }

  private static long addAll(long[] input) {
    long sum = 0;
    for (long i : input) {
      sum += i;
    }
    return sum;
  }

  private static int twice(int[] input) {
    int sum = 0;
    for (int i : input) {
      sum += i;
      int[] output = new int[sum];
      if (output[sum] == output[sum]) {
        return sum;
      }
    }
    return sum;
  }


  public String oddOrEven(int[] array) {
    String even = "even";
    String odd = "odd";
    int sum = 0;
    for (int i : array) {
      sum += i;
      if (sum % 2 == 0) {
        return even;
      } else {
        return odd;
      }
    }
    return even;
  }

  public static int dontGiveMeFive(int start, int end) {
    ArrayList<Integer> range = new ArrayList<>(end - start + 1);
    for (int i = start; i <= end; i++) {
      range.add(i);
      Iterator itr = range.iterator();
      while (itr.hasNext()) {
        int x = (Integer) itr.next();
        if (x % 2 != 0 & x % 5 == 0) {
          itr.remove();
        }
      }
    }
    return range.size();
  }

  public static int sortDesc(final int num) {
    int[] numbers = {num};
    Arrays.sort(numbers);
    return Integer.parseInt(numbers.toString());
  }

  public static int getSum(int a, int b) {
    if (b < a) {
      return IntStream.range(b, a+1).sum();
    } else {
      return IntStream.range(a, b + 1).sum();
    }
  }

  public static String maskify(String str) {
    if (str.isEmpty()) {
      return "";
    } else if(str.length() <= 3) {
      return str;
    } else {
      String str2 = str.substring(0, str.length()-4);
      String str3 = "#";
      str2=str2.replaceAll(".", str3);
      String str4 = str.substring(str.length()-4, str.length());
      return str2 + str4;
    }
  }

//  public int maxSpan(int[] nums) {
//    if (nums.length == 0)
//      return 0;
//    int span = 1;
//    for (int i = 0; i < nums.length; i++) {
//      int tempSpan = 1;
//      boolean valid = false;
//      int mark = nums[0];
//
//      if(nums[i] != mark) {
//        tempSpan += 1;
//      }
//      if (nums[i] == mark) {
//        tempSpan += 1;
//        valid = true;
//      }
//      if (tempSpan>span && valid) {
//        span = tempSpan;
//      }
//    }
//    return span;
//  }
//
//  public int maxSpan(int[] nums) {
//    if (nums.length == 0)
//      return 0;
//    String numbers = nums.toString();
//
//  }

  static int cubeOdd(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : arr) {
      if (i % 2 != 0) {
        int cube = (int) Math.pow(i, 3);
        list.add(cube);
      }
    }
    return list.stream().mapToInt(Integer::intValue).sum();
  }

  static String toJadenCase(String phrase) {
    if (phrase.equals(""))
      return null;

    String s = phrase.toUpperCase(Locale.ENGLISH);

    return s;
  }

  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 1)
      return -1;
    double formula = 1.609;
    double miles = kilometersPerHour/formula;
    return Math.round(miles);
  }

  public static String repeatSeparator(String word, String sep, int count) {
    StringBuilder builder = new StringBuilder();

    if(count>=1) {
      while(count!=0){
        builder.append(word);
        count--;
        if(count==0)
          break;
        builder.append(sep);
      }
    }
    return builder.toString();
  }

  public static boolean StringE (String str) {
    int count = 0;
    char me = 'e';
    for (int i = str.length()-1; i >= 0; --i) {
      if(str.charAt(i) == me)
        count++;
    }
    return count >= 1 && count <= 3;
  }

  public static String stringTimes(String str, int n) {
    if (n==0)
      return "";
    StringBuilder builder = new StringBuilder();
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      builder.append(str.charAt(i));
      if(i == str.length()-1) {
        i = -1;
        count++;
        if(count == n)
          break;
      }
    }
    return builder.toString();
  }
}


