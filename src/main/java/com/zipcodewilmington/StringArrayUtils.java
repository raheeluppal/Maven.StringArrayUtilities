package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }
    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array){


        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        String result = "";
        boolean contains = false;
        for (int x = 0; x < array.length; x++){
            result = array[x] ;
            if (result.equals(value)){
                contains = true;
            }
        }
        return contains;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] backwards = new String[array.length];
        int backwardsPosition = 0;

        for (int i= array.length-1; i>=0; i--){


            backwards[backwardsPosition] = array[i];
            backwardsPosition++;

        }
        return backwards;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int ctr = array.length;
        for(int x =0; x < array.length/2; x++){
            if(!array[x].equals(array[ctr-1])){
                return false;
            }
            ctr--;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String test = "";
        for(int i = 0; i<array.length; i++){
            test += array[i].toLowerCase();
        }
        for(char alph = 'a'; alph <= 'z'; ++alph){
            if(!test.contains(Character.toString(alph))){
                return false;
            }
        }
        return true;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int count = 0; count < array.length; count ++){
            if(value.equals(array[count])){
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        if (array.length <= 0) {
            return array;
        } else {
            String[] result = new String[array.length - 1];
            int count = 0;
            for (String i : array) {
                if (!i.equals(valueToRemove)) {
                    result[count++] = i;
                }
            }
            return result;
        }
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = 0;
        if (array.length == 0) {
            return array;
        } else {
            for(int i = 0; i <= array.length-2; i++) {
                if (array[i].equals(array[i+1])){
                    array[i] = null;
                    count ++;
                }
            }
        }
        String[] result = new String[array.length-count];
        int newCount =0;
        for(int x = 0; x <= array.length-1; x++){
            if(array[x] != null){
                result[newCount] = array[x];
                newCount++;
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 0;
        if (array.length == 0) {
            return array;
        } else {
            for(int i = 0; i <= array.length-2; i++) {
                if (array[i].contains(array[i+1])){
                    array[i+1] += array[i];
                    array[i] = null;
                    count ++;
                }
            }
        }
        String[] result = new String[array.length-count];
        int newCount =0;
        for(int x = 0; x <= array.length-1; x++){
            if(array[x] != null){
                result[newCount] = array[x];
                newCount++;
            }
        }

        return result;


    }


}
