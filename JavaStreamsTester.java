/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Reisinger
 */
public class JavaStreamsTester {
    private static int getCountEmptyString(List<String> strings)
    {
        int emptyCount = (int)strings.stream().filter(a -> a.isEmpty()).count();
        return emptyCount;
    }
    
    private static int getCountLength3(List<String> strings)
    {
        return (int) strings.stream().filter(x -> x.length() == 3).count();
    }
    
    private static List<String> deleteEmptyStrings(List<String> strings)
    {
        strings.removeIf(String::isEmpty);
        return strings;
    }
    
    private static String getMergedString(List<String> strings, String separator) {
        Stream<String> words = Arrays.asList(strings + separator).stream();
        String joinedString = words.collect(Collectors.joining()); 
        joinedString = words.collect(Collectors.joining(separator));
        return joinedString;
    }
    
    private static List<Integer> getSquares(List<Integer> numbers)
    {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
    
    private static int getMax(List<Integer> numbers)
    {
        Integer max;
        return max = numbers.stream().mapToInt(a -> a).max().orElse(0);
    }
    private static int getMin(List<Integer> numbers)
    {
        Integer min;
        return min = numbers.stream().mapToInt(a -> a).min().orElse(0);
    }
    private static int getSum(List<Integer> numbers)
    {
        Integer sum;
        return sum = numbers.stream().mapToInt(a -> a).sum();
    }
    private static int getAverage(List<Integer> numbers)
    {
        Integer average;
        return average = (int)numbers.stream().mapToInt(a -> a).average().orElse(0);
    }
}

