package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> strings=new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if(sourceList.get(i)*sourceList.get(i)>=lowerBound && sourceList.get(i)*sourceList.get(i)<=upperBound){
                strings.add(sourceList.get(i)*sourceList.get(i));
            }
        }
        return strings;
    }
}
